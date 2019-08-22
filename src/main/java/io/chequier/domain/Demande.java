package io.chequier.domain;
import io.chequier.domain.Compte;
import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Demande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iddemande;
	private String motif;
	private Date datecre = new Date();
	private Date dateexc;
	@NotBlank(message = "Statut is required") 
	@Size (min = 8, message="PLEASA use minimum 8 characters")
	private String statut;
	@ManyToOne
	@JoinColumn(name="numCompte")
	private Compte compte;
	
	
	public Demande() {
		super();
	}
	public String getMotif() {
		return motif;
	}
	public Demande(String motif, Date datecre, Date dateexc,
			@NotBlank(message = "Statut is required") @Size(min = 8, message = "PLEASA use minimum 8 characters") String statut,
			Compte compte) {
		super();
		this.motif = motif;
		this.datecre = datecre;
		this.dateexc = dateexc;
		this.statut = statut;
		
		this.compte = compte;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public Date getDatecre() {
		return datecre;
	}
	public void setDatecre(Date datecre) {
		this.datecre = datecre;
	}
	public Date getDateexc() {
		return dateexc;
	}
	public void setDateexc(Date dateexc) {
		this.dateexc = dateexc;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
