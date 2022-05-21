package com.estiam.gestionetudiants.controller;

import java.util.List;

import com.estiam.gestionetudiants.entity.Professeur;
import com.estiam.gestionetudiants.service.serviceInterface.ProfesseurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Fassinou
 */
@RestController
@RequestMapping("/professeurs")
public class ProfesseurController {

    @Autowired
    private ProfesseurService professeurService;
    @PostMapping("/ajouter")
	public void ajouterProfesseur(@RequestBody Professeur professeur) {
		professeurService.ajouterProfesseur(professeur);
	}
    @GetMapping("/consultertout")
	public List<Professeur> consulterLesProfesseurs() {
		return professeurService.consulterLesProfesseurs();
	}
    @GetMapping("/afficherparID/matriculeProf/{matriculeProf}")
	public Professeur rechercherProfesseurParIdantifiant(@PathVariable Long matriculeProf) {
		return professeurService.rechercherProfesseurParIdantifiant(matriculeProf);
	}

    


}
