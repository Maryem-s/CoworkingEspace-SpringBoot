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

import com.example.demo.model.Domicilation;
import com.example.demo.model.Espace;
import com.example.demo.model.Proprietaire;
import com.example.demo.model.Reservation;
import com.example.demo.service.ServiceDomicilation;

@Controller
@RequestMapping("/Domicilation")

public class DomicilationController {
	@Autowired
	private ServiceDomicilation service4;
	@RequestMapping("")
	public String viewDomicilationPage(Model model) {
		model.addAttribute("Domicilation",new Domicilation());
		return "Domicilation";
	}
	@GetMapping("/ajouterDomicilation")
	public String add(Model model) {
		List<Domicilation> listdomicilation = service4.listAll();
		model.addAttribute("Domicilation", new Domicilation());
		model.addAttribute("listdomicilation", listdomicilation);
		return "/ajouterDomicilation";
	}



	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveDomicilationt(@ModelAttribute("Domicilation") Domicilation domi) {
		service4.save(domi);
		return ("redirect:/Domicilation");
	}


	@RequestMapping("/modifierDomicilation/{id}")
	public String ShowDomicilationPage(Model model, @PathVariable(name = "id") Domicilation id) {
		Domicilation domi = service4.get(id.getRef_domicilation());
		model.addAttribute("Domicilation", domi);
		System.out.println("id jjjjjjj" + id);
		return "ajouterDomicilation";
	}


	@RequestMapping("/supprimerDomicilation/{id}")
	public String deleteDomicilation(@PathVariable(name = "id") int id) {
		service4.delete(id);
		return ("redirect:/");
	}
}
