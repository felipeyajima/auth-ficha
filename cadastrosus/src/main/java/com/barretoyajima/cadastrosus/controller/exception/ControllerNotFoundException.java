package com.barretoyajima.cadastrosus.controller.exception;

public class ControllerNotFoundException extends RuntimeException{
    public ControllerNotFoundException(String message){
        super(message);
    }
}