package com.estiam.gestionetudiants.service.serviceInterface;

import java.util.List;

import com.estiam.gestionetudiants.entity.Professeur;

public interface ProfesseurService {

    void ajouterProfesseur(Professeur professeur);
    List<Professeur> consulterLesProfesseurs();
    Professeur rechercherProfesseurParIdantifiant(Long matriculeProf);
    
}
