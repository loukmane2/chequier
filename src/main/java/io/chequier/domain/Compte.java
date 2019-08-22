package io.chequier.domain;

import javax.persistence.*;

import io.chequier.domain.Abonne;
@Entity
public class Compte {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long numCompte;
private double soldeompte;
private double soldecomptable;
@ManyToOne
@JoinColumn(name = "id_abonne")
private Abonne abonne ;
public double getSoldeompte() {
	return soldeompte;
}
public void setSoldeompte(double soldeompte) {
	this.soldeompte = soldeompte;
}
public double getSoldecomptable() {
	return soldecomptable;
}
public void setSoldecomptable(double soldecomptable) {
	this.soldecomptable = soldecomptable;
}
public Abonne getAbonne() {
    return abonne;
}

public void setAbonne(Abonne abonne) {
    this.abonne = abonne;
}
public Compte(double soldeompte, double soldecomptable, Abonne abonne) {
	super();
	this.soldeompte = soldeompte;
	this.soldecomptable = soldecomptable;
	this.abonne = abonne;
}
public Compte() {
	super();
}


	
}
