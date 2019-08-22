package io.chequier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.chequier.domain.Demande;
import io.chequier.repositories.AbonneRepository;
import io.chequier.repositories.CompteRepository;
import io.chequier.repositories.DemandeRepository;

@Service
public class DemandeService {
	
	@Autowired
	DemandeRepository demandeRepository; 
	
	public Demande saveOrUpdateDemande(Demande demande) {
		return demandeRepository.save(demande);
	}
	public List<Demande> findDemandeByMotif (String motif) {
        List<Demande> demandes = demandeRepository.findByMotif(motif);
        return demandes ;
    }
	 public List<Demande> findDemandeByStatut (String statut){
	        List<Demande> demandes = demandeRepository.findByStatut(statut);
	        return demandes ;
	    }
	 public  List<Demande> findAllDemande (){
	        List<Demande> demandes = demandeRepository.findAll();
	        return demandes ;
	    } 
	 public List<Demande> getDemandeByMotifAndStatut( String motif ,String statut){
	        List<Demande> demandes = demandeRepository.findByMotifAndStatut(motif,statut);
	        return demandes ;
	    }
	
	 public List<Demande> getDemandeByMotifOrStatut( String motif ,String statut){
	        List<Demande> demandes = demandeRepository.findByMotifOrStatut(motif,statut);
	        return demandes ;
	    }
	
	
	

}
