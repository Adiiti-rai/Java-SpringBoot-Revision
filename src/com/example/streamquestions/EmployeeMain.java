package com.example.streamquestions;
import java.util.*;
import java.util.stream.*;
public class EmployeeMain {
    public static void main(String[] args){
        List<Employee> list= List.of(
new Employee(101,"Aditi",500000,"cse"),
    new Employee(102,"hari",100000,"it"),
new Employee(103,"Ram",200000,"testing"),
new Employee(104,"Shyam",400000,"cse")
);

        // sort the list of employee based on salary.
        List<Employee>result1= list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();
        System.out.println(result1);

        //sort the list of employee in descending order  based on salary.
        List<Employee>result2= list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println(result2);
// group employees by department and calculate average salary
        Map<String,Double>answer= list.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(answer);
        //or
        Map<String,Double>answer2= list.stream()
                .collect(Collectors.groupingBy(Employee::getDept,Collectors.collectingAndThen(Collectors.toList(),l->l.stream().mapToDouble(Employee::getSalary).average().orElse(0.0))));
        System.out.println(answer);


}
}




