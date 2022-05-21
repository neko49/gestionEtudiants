package com.estiam.gestionetudiants.service.serviceImpl;

import java.util.List;

import com.estiam.gestionetudiants.dao.ClasseDao;
import com.estiam.gestionetudiants.entity.Classe;
import com.estiam.gestionetudiants.service.serviceInterface.ClasseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClasseServiceImpl implements ClasseService {

    @Autowired
    private ClasseDao classeDao;
    @Override
    public void ajouterClasse(Classe classe) {
        if(classe!= null){
            classeDao.save(classe);
        }
        else System.out.println("error");
        
    }

    @Override
    public List<Classe> afficherClasses() {
    
        return classeDao.findAll();
    }

    @Override
    public void ajouterProfesseurClasse(Long matriculeProf, Classe classe) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void ajouterEtudiantsClasse(Long matEtudiant, Classe classe) {
        // TODO Auto-generated method stub
        
    }

    
    
}
