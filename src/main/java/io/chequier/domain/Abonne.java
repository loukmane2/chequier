package io.chequier.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
public class Abonne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_abonne;
	@NotBlank(message = "Customer Familly name is required") 
	private String nom;
	@NotBlank(message = "Customer First name is required") 
	private String prenom;
	@NotBlank(message = "Custoer username is required") 
	private String username; 
	@NotBlank(message = "Customer Username is required") 
	@Size (min = 8, message="PLEASA use minimum 8 characters")
	private String password;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Abonne(String nom, String prenom, String username, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.username = username;
		this.password = password;
	}
	public Abonne() {
		super();
	}
	
	
	

}
