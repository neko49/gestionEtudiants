package com.estiam.gestionetudiants.dao;

import java.util.List;

import com.estiam.gestionetudiants.entity.Etudiant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Fassinou
 */

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long>{
    
    /**
	 * on recherche tous les Etudiants par mot cle
	 * @param motCle
	 * @return une liste d'etudiants
	 */
	@Query("select e from Etudiant e where e.nomEtudiant like %:motCle%")
	public List<Etudiant> rechercherEtudiantsParMotCle(@Param("motCle") String motCle);

     /**
	 * on recherche tous les Etudiants par identifiant
	 * @param matEtudiant
	 * @return une liste d'etudiant
	 */
	@Query("select e from Etudiant e where e.matEtudiant=:matEtudiant")
	public Etudiant rechercherEtudiantsParIdantifiant(@Param("matEtudiant") Long matEtudiant);

}
