package io.chequier.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.chequier.domain.Compte;

@Repository
public interface CompteRepository  extends CrudRepository<Compte,Long> {
    List<Compte> findAll();
    Compte findByNumCompte(Long numCompte);
}
