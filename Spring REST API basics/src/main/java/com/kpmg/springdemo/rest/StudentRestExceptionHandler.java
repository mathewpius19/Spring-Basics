package com.kpmg.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class StudentRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException error){
		
		//create a student error response 
		StudentErrorResponse err = new StudentErrorResponse();
		 err.setStatus(HttpStatus.NOT_FOUND.value());
		 err.setMessage(error.getMessage());
		 err.setTimeStamp(System.currentTimeMillis());
		
		 //return a response entity
		return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	
	//Add another exception handler
	//to catch any exception
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(Exception e){
		StudentErrorResponse err = new StudentErrorResponse();
		 err.setStatus(HttpStatus.BAD_REQUEST.value());
		 err.setMessage(e.getMessage());
		 err.setTimeStamp(System.currentTimeMillis());
		
		 //return a response entity
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
}
}
