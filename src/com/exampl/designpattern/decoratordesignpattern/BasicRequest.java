package com.exampl.designpattern.decoratordesignpattern;

 class BasicRequest implements Request {
     @Override
     public void handleRequest(){
         System.out.println("procvessing the basic request");
     }


}
