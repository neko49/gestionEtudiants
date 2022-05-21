package com.estiam.gestionetudiants.controller;

import java.util.List;

import com.estiam.gestionetudiants.entity.Classe;
import com.estiam.gestionetudiants.service.serviceInterface.ClasseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author Fassinou
 */

@RestController
@RequestMapping("/classes")
public class ClasseController {
    
    @Autowired
    private ClasseService classeService;
    @PostMapping("/ajouter")
	public void ajouterClasse(@RequestBody Classe classe) {
		classeService.ajouterClasse(classe);
	}
    @GetMapping("/affichertout")
	public List<Classe> afficherClasses() {
		return classeService.afficherClasses();
	}

	public void ajouterProfesseurClasse(Long matriculeProf, Classe classe) {
		classeService.ajouterProfesseurClasse(matriculeProf, classe);
	}

	public void ajouterEtudiantsClasse(Long matEtudiant, Classe classe) {
		classeService.ajouterEtudiantsClasse(matEtudiant, classe);
	}

    
}
