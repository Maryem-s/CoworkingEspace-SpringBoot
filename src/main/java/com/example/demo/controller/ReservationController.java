package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Proprietaire;
import com.example.demo.model.Reservation;
import com.example.demo.service.ServiceReservation;
@Controller
@RequestMapping("/emplacement")

public class ReservationController {
	@Autowired
	private ServiceReservation service2;

	@GetMapping("/ajouterReservation")
	public String view(Model model) {
		List<Reservation> listReservation = service2.listAll();
		model.addAttribute("Reservation", new Reservation());
		model.addAttribute("listReservation", listReservation);
		return "/ajouterReservation";
	}

	@RequestMapping("")
	public String viewEmplacementPage(Model model) {
		model.addAttribute("Reservation",new Reservation());
		return "emplacement";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("Reservation") Reservation res) {
		service2.save(res);
		return ("redirect:/emplacement");
	}

	@RequestMapping("/modifierReservation/{id}")
	public String ShowReservationPage(Model model,@PathVariable(name = "id") Reservation id) {
		Reservation res = service2.get(id.getId_reserv());
		model.addAttribute("Reservation", res);
		System.out.println("id jjjjjjj"+id);
			return "/ajouterReservation";
	
	}


	@RequestMapping("/supprimerReservation/{id}")
	public String deleteReservation(@PathVariable(name = "id") int id) {
		service2.delete(id);
		return ("redirect:/");
	}

}

