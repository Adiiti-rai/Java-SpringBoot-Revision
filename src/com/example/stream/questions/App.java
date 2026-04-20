package com.example.stream.questions;
//Merge Two Lists into a Single List

import java.util.*;
import java.util.stream.*;
public class App {
    public static void main(String[] args){
        List<Integer>list1= List.of(1,2,3,4,5);
        List<Integer>list2= List.of(6,7,8,9,10);
        List<Integer>mergeList= Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.toList());
        System.out.println(mergeList);

        // Find the Intersection of Two Lists
        List<Integer>result= list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(result);

        // Find the Union of Two Lists

        List<Integer>unionResult= Stream.concat(list1.stream(),list2.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unionResult);

        //Find the Difference Between Two Lists

        List<Integer>ans= list1.stream()
                .filter(n->!list2.contains(n))
                .collect(Collectors.toList());
        System.out.println(ans);



    }
}
