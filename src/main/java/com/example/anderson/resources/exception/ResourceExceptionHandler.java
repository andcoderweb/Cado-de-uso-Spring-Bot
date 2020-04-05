package com.example.anderson.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.anderson.services.exceptions.ObjectNotFoundExceptions;

@ControllerAdvice
public class ResourceExceptionHandler {
	public ResponseEntity<StardardError> objectNotFoundject(ObjectNotFoundExceptions e, HttpServletRequest request) {
		StardardError err = new StardardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
