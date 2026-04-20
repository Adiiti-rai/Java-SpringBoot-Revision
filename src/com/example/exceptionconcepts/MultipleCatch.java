package com.example.exceptionconcepts;

public class MultipleCatch {
    public static void main(String[] args){
        try {
            int a = 10;
            int b = 0;
            // ArithmeticException
            int result = a / b;
            System.out.println(result);

            //NullPointerException
            String str = null;
            System.out.println(str.length());

             //NumberFormatException
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error:"+e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Null pointer error:"+e.getMessage());
        }
        catch(Exception e){
            System.out.println("General error:"+e.getMessage());
        }
    }
}
