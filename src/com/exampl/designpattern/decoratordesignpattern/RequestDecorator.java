package com.exampl.designpattern.decoratordesignpattern;

abstract class RequestDecorator implements Request {
    protected Request request;

    public RequestDecorator(Request request){
        this.request= request;
    }
}
