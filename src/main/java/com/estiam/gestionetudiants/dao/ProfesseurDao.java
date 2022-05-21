package com.estiam.gestionetudiants.dao;


import com.estiam.gestionetudiants.entity.Professeur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author Fassinou
 */
@Repository
 public interface ProfesseurDao extends JpaRepository<Professeur, Long>{
    
     /**
	 * on recherche tous les professeurs par identifiant
	 * @param matriculeProf
	 * @return une liste de professeurs
	 */
	@Query("select p from Professeur p where p.matriculeProf = :matriculeProf")
	public Professeur afficherProfesseursparId(@Param("matriculeProf") Long matriculeProf);
}
