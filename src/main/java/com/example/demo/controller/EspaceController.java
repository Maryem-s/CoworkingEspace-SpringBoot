package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.Espace;
import com.example.demo.service.ServiceEspace;

@Controller
@RequestMapping("/account")
public class EspaceController {
	@Autowired
	private ServiceEspace serviceEsp;

	@GetMapping("/ajouterEspace")
	public String add(Model model) {
		model.addAttribute("Espace", new Espace());
		return "ajouterEspace";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEspace(@ModelAttribute("Espace") Espace Esp) {
		serviceEsp.save(Esp);
		return "redirect:/account";
	}

	@RequestMapping("/modifierEspace/{id}")
	public String ShowEditPage(Model model, @PathVariable(name = "id") Espace id) {
		Espace esp  = serviceEsp.get(id.getRef_espace());
		model.addAttribute("Espace", esp );
		System.out.println("id jjjjjjj" + id);
		return "/ajouterEspace";
	}

	@RequestMapping("/supprimerEspace/{id}")
	public String deleteEspacePage(@PathVariable(name = "id") int id) {
		serviceEsp.delete(id);
		return "redirect:/";
	}

}
