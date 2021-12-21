package com.capg.ems.exceptions;

public class DepartmentNotFoundException extends RuntimeException {
	
	    public DepartmentNotFoundException(String dep){
	        super(dep);
	    }

	    public DepartmentNotFoundException(String dep,Throwable e){
	        super(dep,e);
	    }
	}

