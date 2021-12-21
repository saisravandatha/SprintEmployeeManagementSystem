package com.capg.ems.exceptions;

public class StatusReportNotFoundException extends RuntimeException {
	
    public StatusReportNotFoundException(String message){
        super();
    }

    public StatusReportNotFoundException(String message,Throwable e){
        super(e);
    }

}
