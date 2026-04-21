package com.exampl.designpattern.decoratordesignpattern;

public class Main {
    public static void main(String[] args) {
        Request request = new BasicRequest();

        request = new AuthenticationDecorator(request);
        request = new AuthorizationDecorator(request);
        request.handleRequest();
    }
    }