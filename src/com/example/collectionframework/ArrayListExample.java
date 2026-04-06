package com.example.collectionframework;

//ArrayList:--- It implements the List interface. It is part opf java util.package
//ArrayList is a resizable (dynamic) array that allows duplicates and maintains insertion order.
//key features-->. Maintain the insertion order,
//                .It allows duplicates,
//                .It is not synchronized,
//                .It allows null values
//                . Dyanamic array that can grow as needed.
//Internally working--> ArrayList uses dynamic array internally.
//default capacity of arrayList is 10.
// when the number of elements exceeds the capacity,
// it creates a new array with a larger capacity and copies the existing elements to the new array.
// New Capacity=(old capacity)+(old capacity)/2.

import java.util.*;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String>list= new ArrayList<>();
        // adding elements to the arrayList
        list.add("java");
        list.add("Test");
        list.add("Aditi");
        list.add("Venu");
        list.add("Aditi");
        list.add("programming");
        list.add("Venu");
        System.out.println("prin the arrayList:"+list);

        // accessing elements from the arrayList--> .get(index)
        System.out.println("print the elemnet at index 4:"+list.get(4));

        // removing element from the arrayList--> .remove(index) or .remove(object o)
        list.remove(2);
        System.out.println("print the arrayList after removing the element:"+list);
        list.remove(String.valueOf("Venu"));
        System.out.println("print the arrayList after removing the element:"+list);

        // updating element in the arrayList--> .set(index,element)
        list.set(2,"Aditi Rai");
        System.out.println("print the arrayList after updating the element:"+list);
        // size of the arrayList--> .size()
        System.out.println("print the list of size:"+list.size());

        // iterating the arrayList--> using for loop, enhanced for loop, iterator
        System.out.println("iterating the arrayList using for loop:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("iterating the arrayList using enhanced for loop:");
        for(String element:list){
            System.out.println(element);
        }
        System.out.println("iterating the arrayList using iterator:");
        Iterator<String>iterator= list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // .contains(Object o)
        System.out.println("check the element in the list:"+ list.contains("java"));

        //.clear()--> to remove all the elements from the arrayList
//        System.out.println("print the arryaList before clear:"+list);
//        list.clear();
//        System.out.println("print the arrayList after clear:"+list);

        // .isEmpty()
        System.out.println("check the arryList is empty or not:"+list.isEmpty());

        // .toArray()--> to convert the arrayList to an array
        System.out.println( "convert the ArrayList into array:"+ Arrays.toString(list.toArray()));
        //  here,Converts the ArrayList into an array using toArray().
// Since arrays do not print elements directly (they print memory reference),
// Arrays.toString() is used to convert the array into a readable string format.

        //.indexOf(object o)
        System.out.println("print the index of the element:"+list.indexOf("Venu"));
        //.lastIndex(Object 0);
        System.out.println("print the last index of the element:"+list.lastIndexOf("Aditi"));

        // .subList(fromIndex,toIndex)--> to get a sublist from the arrayList
        System.out.println("print the sublist of the arrayList:"+list.subList(1,4));


    }
}


