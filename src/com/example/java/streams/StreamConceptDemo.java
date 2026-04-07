package com.example.java.streams;

//Stream:-> As we consider Stream is a pipeline, through which our collection elements passes through.
//while elements passes through pipelines, it performs various operation like sorting, filtering etc.
// flow-->
//Collection->Create stream->intermediate operation->Terminal Operation
//step 1:- Streams are created from the data source like collection or array etc.
//step 2:- Intermediate operation:-> it is used to perform some operation on the stream and it returns the stream itself.
// Intermediate operations like:- filter(),sorted(),map(),distinct() etc are used.
//Intermediate operations atr lazy in nature, means these operations get executed only when terminal operation is invoked.
//step 3:- Terminal operation:-> it is used to perform some final operation on the stream
// and it returns a non-stream result. Terminal operations like:- forEach(),collect(),count(),reduce() etc are used.
import java.util.*;
public class StreamConceptDemo {
    public static void main(String[] args){
        List<Integer>list= new ArrayList<>();
        list.add(20000);
        list.add(30000);
        list.add(40000);
        list.add(50000);
        list.add(60000);
        System.out.println("print the original list:"+list);
        long count= list.stream()
                .filter(x->x>30000)
                .count();
        System.out.println("print the count of number greater than 30000:"+count);
    }
}

// howMany ways to create a stream?-->
//1. from collection:-> collection.stream()
//2. from array:-> Arrays.stream(array)
//3.from Static method:-> Stream.of(element1,element2,element3,...)
//4. from infinite stream:-> Stream.iterate(seed, nextFunction) and Stream.generate(supplier)
//5.From Stream Builder:-> Stream.builder()
//6.From Stream Iterate:-> Stream.iterate(seed, hasNextPredicate, nextFunction)


// why we call intermediate operations as lazy.
