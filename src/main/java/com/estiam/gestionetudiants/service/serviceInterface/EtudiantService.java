package com.estiam.gestionetudiants.service.serviceInterface;

import java.util.List;

import com.estiam.gestionetudiants.entity.Etudiant;

public interface EtudiantService {

    void ajouterEtudiant(Etudiant etudiant);
    List<Etudiant> consulterLesEtudiants();
    Etudiant rechercherEtudiantsParIdantifiant(Long matEtudiant);
    List<Etudiant> rechercherEtudiantsParMotCle(String motCle);
    
}
