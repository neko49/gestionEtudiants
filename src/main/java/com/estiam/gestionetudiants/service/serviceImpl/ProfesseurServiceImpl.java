package com.estiam.gestionetudiants.service.serviceImpl;

import java.util.List;

import com.estiam.gestionetudiants.dao.ProfesseurDao;
import com.estiam.gestionetudiants.entity.Professeur;
import com.estiam.gestionetudiants.service.serviceInterface.ProfesseurService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProfesseurServiceImpl implements ProfesseurService{

    @Autowired
    ProfesseurDao professeurDao;
    @Override
    public void ajouterProfesseur(Professeur professeur) {
        
        if(professeur != null){
            professeurDao.save(professeur);
        }
        else System.out.println("error");
    }

    @Override
    public List<Professeur> consulterLesProfesseurs() {
        
        return professeurDao.findAll();
    }

    @Override
    public Professeur rechercherProfesseurParIdantifiant(Long matriculeProf) {
        
        return professeurDao.afficherProfesseursparId(matriculeProf);
    }
    
}
