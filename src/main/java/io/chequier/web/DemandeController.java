package io.chequier.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.chequier.domain.Demande;

import io.chequier.services.CompteService;

import io.chequier.services.DemandeService;

@RestController
@RequestMapping(value = "/demande")
@CrossOrigin
public class DemandeController {
    @Autowired
    private DemandeService demandeService ;
    
    @Autowired
    private CompteService compteService ;
    
    @PostMapping("/add")
    ResponseEntity<?> CreateNewDemande (@RequestBody Demande demande){
        Demande demande1 = demandeService.saveOrUpdateDemande(demande);
        return new ResponseEntity<Demande>(demande1,HttpStatus.CREATED);
    }
    @GetMapping("/and/{motif}/{statut}")
    public ResponseEntity<?> getDemandeByMotifAndStatut(@PathVariable String motif ,@PathVariable String statut){
        List<Demande> demandes = demandeService.getDemandeByMotifAndStatut(motif,statut);
        return new ResponseEntity<List<Demande>>(demandes ,HttpStatus.OK);
    }
    @GetMapping("/or/{numero}/{motif}/{statut}")
    public ResponseEntity<?> getDemandeByMotifOrStatut(@PathVariable String motif ,@PathVariable String statut){
        List<Demande> demandes = demandeService.getDemandeByMotifOrStatut(motif,statut);
        return new ResponseEntity<List<Demande>>(demandes ,HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<?> getAllDemandes(){
        List<Demande> demandes = demandeService.findAllDemande();
        return new ResponseEntity<List<Demande>>(demandes ,HttpStatus.OK);
    }
   /* @DeleteMapping("/delete/{numero}")
    public ResponseEntity<?> deleteProject(@PathVariable Long numero){
        demandeService.deleteDemandeById(numero);
        return new ResponseEntity<String>("demande with id "+numero+" was deleted with success",HttpStatus.OK);
    }*/

}
