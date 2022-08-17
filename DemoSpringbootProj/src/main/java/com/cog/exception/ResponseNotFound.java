package com.cog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResponseNotFound extends RuntimeException {
	private static final long serialVersionUID= 1L;
	private String responseName;
	private String fieldName;
	private Object fieldValue;
	
	public String getResponseName() {
		return responseName;
	}
	
	
	public String getFieldName() {
		return fieldName;
	}
	
	
	public Object getFieldValue() {
		return fieldValue;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public ResponseNotFound(String responseName, String fieldName, Object fieldValue) {
		super(String.format("%s not found with the %s", responseName, fieldName, fieldValue));
		this.responseName = responseName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	

}
