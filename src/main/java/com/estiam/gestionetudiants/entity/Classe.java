package com.estiam.gestionetudiants.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
/**
 * 
 * @author Fassinou
 * 
 */

@Entity
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Classe {

    @Id
    @NonNull
    private Long idClasse;

    private String villeClasse;

    private int capaciteClasse;

    private String nomClasse;

    @OneToMany(mappedBy = "classeEtudiant")
    private List<Etudiant> listEtudiant;

    @ManyToMany
    private List<Professeur> listProfesseur;

    
}
