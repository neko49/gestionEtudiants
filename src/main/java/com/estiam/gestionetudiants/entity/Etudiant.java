package com.estiam.gestionetudiants.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
/**
 * 
 * @author Fassinou
 * 
 */

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue
    private Long matEtudiant;


    private String nomEtudiant;


    private String prenomEtudiant;


    private LocalDate dateDeNaissance;

    @ManyToOne
    private Classe classeEtudiant;
    
}
