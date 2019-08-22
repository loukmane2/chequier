package io.chequier.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import io.chequier.repositories.AbonneRepository;

@Service
public class AbonneService {
	@Autowired
	private AbonneRepository abonneRepository;
	

}
