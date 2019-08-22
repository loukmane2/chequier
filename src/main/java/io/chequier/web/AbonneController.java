package io.chequier.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.chequier.services.AbonneService;

@RestController
@RequestMapping("/abonne")
@CrossOrigin
public class AbonneController {
    @Autowired
    private AbonneService abonneService ;
}
