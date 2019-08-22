package io.chequier.services;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import io.chequier.domain.Compte;
import io.chequier.repositories.CompteRepository;

@Service
public class CompteService {

    @Autowired
	CompteRepository compteRepository;
    
    public List<Compte> findAll(){
    	return compteRepository.findAll();
    }

    public Compte findCompteByNumeroCompte(Long numero){
        Compte compte =compteRepository.findByNumCompte(numero);
        return compte ;
   }
}
