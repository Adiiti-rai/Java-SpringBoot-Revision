package com.exampl.designpattern.decoratordesignpattern;

class AuthenticationDecorator extends RequestDecorator {
public AuthenticationDecorator(Request request){
    super(request);
}

@Override
    public void handleRequest(){
    System.out.println("Authenticating user");
    request.handleRequest();
}

}
