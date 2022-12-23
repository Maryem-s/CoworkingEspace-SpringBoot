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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Administrateur;
import com.example.demo.model.Domicilation;
import com.example.demo.model.Espace;
import com.example.demo.model.Locataire;
import com.example.demo.model.Proprietaire;
import com.example.demo.model.Reservation;
import com.example.demo.service.ServiceDomicilation;
import com.example.demo.service.ServiceEspace;
import com.example.demo.service.ServiceLocataire;
import com.example.demo.service.ServiceProprietaire;
import com.example.demo.service.ServiceReservation;

@Controller
public class MyController {
	
	///////////// Proprietaire///////////////////
	@Autowired
	private ServiceProprietaire service;
	
	@RequestMapping("/index")
	public String viewIndexPage(Model model) {
		
		return "index";
	}
	
	
	@RequestMapping("/connexion")
	public String viewConnexionPage(Model model) {
		
		return "connexion";
	}
	
	

	@RequestMapping("/propos")
	public String viewProposPage(Model model) {
		
		return "propos";
	}
	@RequestMapping("/Cowork")
	public String viewCoworkPage(Model model) {
		
		return "Cowork";
	}


	@RequestMapping(value="/account",method= {RequestMethod.POST})
	public String viewAccountPage(@RequestParam("password") String motpasse,@RequestParam("email") String email,Model model) {
		Proprietaire client=service.getByEmail(email);
		System.out.println(client.getId_prop());
		if(client.getPassword().equals(motpasse) && client.getEmail().equals(email))
		{
			model.addAttribute("Proprietaire",client);
			return "account";

		}
		return "connexion";
	}
	@GetMapping("/inscription")
	public String addProprietaire(Model model) {
		model.addAttribute("Proprietaire", new Proprietaire());
		return "inscription";
	}
	
	@RequestMapping(value = "/prop/ajouter", method = RequestMethod.POST)
	public String save(@ModelAttribute("proprietaire") Proprietaire prop) {
		service.save(prop);
		return ("connexion");
	}
	

	@RequestMapping("/prop/modifier/{id}")
	public String ShowProprietairePage(Model model,@PathVariable(name = "id") Proprietaire id) {
		Proprietaire p=service.get(id.getId_prop());
		model.addAttribute("Proprietaire",p);
	System.out.println("id jjjjjjj"+id);
		return "inscription";
	}

	@RequestMapping("/supprimer/{id}")
	public String delete(@PathVariable(name = "id") int id) {
		service.delete(id);
		return ("redirect:/");
	}

/*	//// locataire////////
	@Autowired
	private ServiceLocataire service1;

	@GetMapping("/index")
	public String viewHomePage(Model model) {
		List<Locataire> listlocataire = service1.listAll();
		model.addAttribute("listeLocataire", listlocataire);
		return "index";
	}

	@GetMapping("/")
	public String addLocataire(Model model) {
		model.addAttribute("locataire", new Locataire();
		return "";
	}

	@RequestMapping(value = "/ajouter", method = RequestMethod.POST)
	public String save(@ModelAttribute("etudiant") Locataire loc) {
		service1.save(loc);
		return ("redirect:/");
	}

	@RequestMapping("/modifier/{id}")
	public ModelAndView ShowLocatairePage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("page1");
		Locataire loc = service1.get(id);
		mav.addObject("locataire", loc);
		return mav;
	}

	@RequestMapping("/supprimer/{id}")
	public String deleteLocataire(@PathVariable(name = "id") int id) {
		service1.delete(id);
		return ("redirect:/");
	}

////////////Reservation//////////////////////////
	
	////////////////// Domicilation///////////
	

*/
////////////Espace//////////////////////////


}


