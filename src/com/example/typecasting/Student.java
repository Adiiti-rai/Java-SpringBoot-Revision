package com.example.typecasting;

public class Student {
    public static void main(String[] args){
        //convert int[]array into char[]array
         int[] arr= new int[]{1,2,3,4,5};
       // int[] arr= {1,2,3,4,5};
        char[] chArr= new char[arr.length];
        for(int i=0;i<arr.length;i++){
            chArr[i]=(char)arr[i];
            System.out.println(chArr[i]+'0'); // because '0' = ASCII 48
           // So:1 + 48 = 49 → '1' 2 + 48 = 50 → '2'
        }

        // convert char[]array into int[]array
        char[] cArr= {'A','B','C','D','E'};
        int[] iArr= new int[cArr.length];
        for(int i=0;i<cArr.length;i++){
            iArr[i]= cArr[i];
            System.out.println(iArr[i]);
        }


    }
}
