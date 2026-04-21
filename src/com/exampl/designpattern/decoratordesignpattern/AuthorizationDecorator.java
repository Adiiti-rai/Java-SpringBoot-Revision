package com.exampl.designpattern.decoratordesignpattern;

 class AuthorizationDecorator extends RequestDecorator {

     public AuthorizationDecorator(Request request){
         super(request);
     }

     @Override
     public void handleRequest(){
         System.out.println("checking user permission");
         request.handleRequest();
     }
}
