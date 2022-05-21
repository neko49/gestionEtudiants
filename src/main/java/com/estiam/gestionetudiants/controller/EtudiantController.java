package com.estiam.gestionetudiants.controller;

import java.util.List;

import com.estiam.gestionetudiants.entity.Etudiant;
import com.estiam.gestionetudiants.service.serviceInterface.EtudiantService;

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
 * 
 * Le controlleur
 */
@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    
    @Autowired
    private EtudiantService etudiantService;

    @PostMapping("/ajouter")
	public void ajouterEtudiant(@RequestBody Etudiant etudiant) {
		etudiantService.ajouterEtudiant(etudiant);
	}
    
    @GetMapping("/consultertout")
	public List<Etudiant> consulterLesEtudiants() {
		return etudiantService.consulterLesEtudiants();
	}
    
    @GetMapping("/rechercherparID/matEtudiant/{matEtudiant}")
	public Etudiant rechercherEtudiantsParIdantifiant(@PathVariable Long matEtudiant) {
		return etudiantService.rechercherEtudiantsParIdantifiant(matEtudiant);
	}
    
    @GetMapping("/rechercherparMC/motCle/{motCle}")
	public List<Etudiant> rechercherEtudiantsParMotCle(@PathVariable String motCle) {
		return etudiantService.rechercherEtudiantsParMotCle(motCle);
	}

    
}
