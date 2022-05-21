package com.estiam.gestionetudiants.service.serviceImpl;

import java.util.List;

import com.estiam.gestionetudiants.dao.EtudiantDao;
import com.estiam.gestionetudiants.entity.Etudiant;
import com.estiam.gestionetudiants.service.serviceInterface.EtudiantService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EtudiantServiceImpl implements EtudiantService{

    @Autowired
    EtudiantDao etudiantDao;
    @Override
    public void ajouterEtudiant(Etudiant etudiant) {
        if(etudiant!= null){
            etudiantDao.save(etudiant);
        }
        else System.out.println("error");
        
    }

    @Override
    public List<Etudiant> consulterLesEtudiants() {
        
        return etudiantDao.findAll();
    }

    @Override
    public Etudiant rechercherEtudiantsParIdantifiant(Long matEtudiant) {
        
        return etudiantDao.rechercherEtudiantsParIdantifiant(matEtudiant);
    }

    @Override
    public List<Etudiant> rechercherEtudiantsParMotCle(String motCle) {
        
        return etudiantDao.rechercherEtudiantsParMotCle(motCle);
    }
    
}
