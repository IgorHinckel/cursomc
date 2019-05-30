package com.igorhinckel.cursomc.resources.exception;

import javax.servlet.http.HttpServlet;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.igorhinckel.cursomc.services.exceptions.ObjectNotFoudException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoudException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoudException exception, HttpServlet request){
		StandardError erro = new StandardError(HttpStatus.NOT_FOUND.value(), exception.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}

}
