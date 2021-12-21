package com.capg.ems.exceptions;

public class ComplianceNotFoundException extends RuntimeException {
	
	public ComplianceNotFoundException(String message) {
		super();
	}
	
	public ComplianceNotFoundException(String message,Throwable e) {
		super(e);
	}

}
