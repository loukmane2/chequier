package io.chequier.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler {

 @ExceptionHandler
  public final ResponseEntity<Object> HandleProjectIdException(DemandeMotifException ex  , WebRequest request){
	 DemandeMotifExceptionsResponse exceptionResponce = new DemandeMotifExceptionsResponse(ex.getMessage());
	 return new ResponseEntity<Object>(exceptionResponce, HttpStatus.BAD_REQUEST);
	 
 }

}
