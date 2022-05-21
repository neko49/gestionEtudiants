package com.estiam.gestionetudiants.dao;

import com.estiam.gestionetudiants.entity.Classe;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 
 * @author Fassinou
 */

public interface ClasseDao extends JpaRepository<Classe, String>{
    
}
