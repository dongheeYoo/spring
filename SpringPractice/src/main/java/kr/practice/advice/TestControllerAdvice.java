package kr.practice.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import kr.practice.entity.TestEntity;
import kr.practice.exception.TestNotFoundException;

@RestControllerAdvice
public class TestControllerAdvice {

	@ExceptionHandler(TestNotFoundException.class)
	protected ResponseEntity<TestEntity> handleTestNotFoundException(TestNotFoundException tnfe){
		
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("no");
	}
	
}
