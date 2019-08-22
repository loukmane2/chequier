package io.chequier.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.chequier.domain.Compte;
import io.chequier.domain.Demande;




public interface DemandeRepository extends CrudRepository<Demande,Long>{
	List<Demande> findAll();
	Demande findByIddemande(Long id);
	List<Demande> findByStatut(String statut);
	List<Demande> findByMotif(String motif);
	List<Demande> findByDatecre(Date date);
	List<Demande> findByDatecreBetween(Date date1,Date date2);
	List<Demande> findByMotifAndStatut( String motif , String statut);
    List<Demande> findByMotifOrStatut( String motif , String statut);

}
