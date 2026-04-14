package com.example.stringbufferconcepts;

public class Student {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aditi Rai");
        System.out.println(sb);

        //.append()->add text at the end
        sb.append("student");
        System.out.println(sb);

        //.insert()->add text at the specified index
        sb.insert(0, "Miss ");
        System.out.println(sb);

        //.replace()->replace text between the specified start and end index
        sb.replace(0, 4, "Ms.");
       System.out.println(sb);

        //.delete()->delete text between the specified start and end index
        sb.delete(11, 14);
        System.out.println(sb);

            // .reverse()->reverse the text
        sb.reverse();
        System.out.println(sb);

        // .capacity()->returns the current capacity of the string buffer
        System.out.println("Capacity: " + sb.capacity());

        // .length()->returns the current length of the string buffer
        System.out.println("Length: " + sb.length());








    }
}
