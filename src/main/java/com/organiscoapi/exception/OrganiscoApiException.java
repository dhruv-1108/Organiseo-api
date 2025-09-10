package com.organiscoapi.exception;

import org.springframework.http.HttpStatus;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganiscoApiException extends RuntimeException{
	 
	private HttpStatus status;
	 private String message;
	 
	 
	 public OrganiscoApiException(String message, HttpStatus status) {
			this.status=status;
			this.message=message;
		}
	 
	 
}