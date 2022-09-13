package com.kpmg.springdemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kpmg.springdemo.rest.StudentErrorResponse;
import com.kpmg.springdemo.rest.StudentNotFoundException;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudent;
	
	@PostConstruct
	public void loadData() {
		
		theStudent = new ArrayList<>();
		
		theStudent.add(new Student("Mathew", "Olickal"));
		theStudent.add(new Student("Jan", "Joel"));
		theStudent.add(new Student("Mary", "bobeep"));
		
	}
	//define endpoint for /student
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		
		return theStudent;
	}
	
	//define endpoint for /students/{studentId} - return student at index
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		//check student id with list size
		
		if(studentId>=theStudent.size()||studentId<0) {
			throw new StudentNotFoundException("Invalid student Id "+studentId );
		}
		
		//just index into the list
		
		return theStudent.get(studentId);
		
	}
	
	//Add an exception handler
	
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
