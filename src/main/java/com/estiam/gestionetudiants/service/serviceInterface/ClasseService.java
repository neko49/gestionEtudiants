package com.estiam.gestionetudiants.service.serviceInterface;

import java.util.List;

import com.estiam.gestionetudiants.entity.Classe;

public interface ClasseService {
    
    void ajouterClasse(Classe classe);
    List<Classe> afficherClasses();
    void ajouterProfesseurClasse(Long matriculeProf, Classe classe);
    void ajouterEtudiantsClasse(Long matEtudiant, Classe classe);
}
