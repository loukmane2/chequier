package io.chequier.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.chequier.domain.Compte;
import io.chequier.services.CompteService;

@RestController
@RequestMapping("compte")
@CrossOrigin
public class CompteController {
    @Autowired
    private CompteService compteService ;

    @GetMapping("/all")
    public ResponseEntity<?> getAllComptes(){
        List<Compte> comptes = compteService.findAll();
        return new ResponseEntity<Iterable<Compte>>(comptes , HttpStatus.OK);
    }
}
