package com.capg.ems.exceptions;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(String msg){
        super(msg);
    }

    public EmployeeNotFoundException(String msg,Throwable e){
        super(msg,e);
    }
}
