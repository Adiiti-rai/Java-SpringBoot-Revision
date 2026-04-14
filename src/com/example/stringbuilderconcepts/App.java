package com.example.stringbuilderconcepts;

public class App {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Aditi");
        System.out.println(sb);

        //.append()->add text at the end
        sb.append(" ");
        sb.append("Rai");
        System.out.println(sb);

        //.insert()->add text at the specified index
        sb.insert(0," ");
        sb.insert(0,"Epam");
        System.out.println(sb);

        //.replace()->replace text between the specified start and end index
        sb.replace(0,4,"miss");
        System.out.println(sb);

        //.delete()->delete text between the specified start and end index
        sb.delete(11,14);
        System.out.println(sb);

        // .reverse()->reverse the text
        sb.reverse();
        System.out.println(sb);

    }
}
