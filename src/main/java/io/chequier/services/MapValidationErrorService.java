package io.chequier.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

public class MapValidationErrorService {

	
	 public ResponseEntity<?> MapValidationError(BindingResult result){
	        if(result.hasErrors()){
	            Map<String , String> errors = new HashMap<>();
	            for (FieldError error : result.getFieldErrors()){
	                errors.put(error.getField() , error.getDefaultMessage());
	            }
	            return new ResponseEntity<Map<String , String>>(errors, HttpStatus.BAD_REQUEST) ;
	        }
	        return  null ;
	    }
}
