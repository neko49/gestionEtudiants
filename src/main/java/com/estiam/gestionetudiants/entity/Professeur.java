package com.estiam.gestionetudiants.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
/**
 * 
 * @author Fassinou
 */

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Professeur {


    @Id
    private Long matriculeProf;


    private String nomProfesseur;

    private String prenomProfesseur;

    @ManyToMany
    private List<Classe> listClasseProfesseur;

}
