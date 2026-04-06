package com.example.streamsquestions;
// Here I am creating a main class  and creating a list of Employee Objects.
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(29, "def", 32, 646, "M", "IT", "Bengaluru", 2011, 14, "Manager"));
        empList.add(new Employee(11, "kyl", 33, 433, "M", "HR", "Hyderabad", 2022, 3, "Manager"));
        empList.add(new Employee(12, "gfh", 34, 120, "F", "Sales", "Bengaluru", 2017, 8, "Sales"));
        empList.add(new Employee(13, "whj", 35, 323, "M", "Sales", "Chennai", 2013, 12, "HR"));
        empList.add(new Employee(14, "wej", 36, 233, "M", "HR", "Coimbatore", 2014, 11, "HR"));

        empList.add(new Employee(5, "web", 21, 323, "M", "IT", "Pune", 2011, 14, "SDE-3"));
        empList.add(new Employee(3, "fbw", 20, 332, "M", "IT", "Trivandam", 2022, 3, "SDE-2"));
        empList.add(new Employee(2, "weh", 22, 322, "F", "IT", "Pune", 2016, 9, "SDE-3"));
        empList.add(new Employee(19, "ehw", 28, 222, "F", "IT", "Trivandam", 2011, 14, "DevOps Engineer"));

        //1.Find oldest Employee by age from the Employee List.
        Employee oldestEmployee = empList.stream()
                .max(Comparator.comparing(Employee::getAge))
                .orElse(null);
        System.out.println("Oldest Employee: " + oldestEmployee);

        //2. Group Employees by city from the Employee List.
        Map<String, List<Employee>> result = empList.stream()
                .collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("print the result:" + result);

        //3. Find names of all the departments in the organization
        List<String> result1 = empList.stream()
                .map(Employee::getDeptName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("print the result1:" + result1);

        //4.Sort the employees by salary in each department in ascending order
        //Department ke basis pe group karo
        //Har group ke andar salary ke hisaab se sort karo
        Map<String, List<Employee>> result2 = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted(Comparator.comparing(Employee::getSalary))
                                        .collect(Collectors.toList())
                        )
                ));
        System.out.println(result2);

        // 5. Find the highest salary earning employee in the organisation.
        Employee highestSalary = empList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElse(null);
        System.out.println("print the highest salary of the employee:" + highestSalary);

        //6.Find highest paid salary Employee in the organisation based on gender
        Employee paidSalry = empList.stream()
                .max(Comparator.comparing(Employee::getGender))
                .orElse(null);
        System.out.println("print the highest salary of the employee based on gender:" + paidSalry);

        //7.Find highest salaried employee based on department.
        //Har department ka sabse highest salary wala employee nikaalna hai
        Map<String, Employee> ans = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                x -> x.orElse(null)
                        )
                ));
        System.out.println(ans);

        //8.Find second highest paid salary Employee based on department.
        //har department ke andar 2nd highest salary wala employee nikaalna hai
        Map<String,Employee>secondHighestSalary= empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list->list.stream()
                                        .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .skip(1)
                                        .findFirst()
                                        .orElse(null)
                                           )
                                            ));
        // 9. Find the youngest female employee in the organization.
        //Sirf female employees filter karo
        // Unme se minimum age wala find karo
        Employee femaleEmployee= empList.stream()
                .filter(x->x.getGender().equalsIgnoreCase("F"))
                .min(Comparator.comparing(Employee::getAge))
                .orElse(null);

        //10. Find the number of employees in the organisation.
        long noOfEmployee= empList.stream()
                .count();
        System.out.println("count the employee:"+ noOfEmployee);
// 11. Sort an Employee List by age and name.
        List<Employee>sortedList= empList.stream()
                .sorted(Comparator.comparing(Employee::getAge)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("print the sorted list:"+sortedList);

        //12. Find Average age of Male and Female Employees from Employee List.
        //Male aur Female alag-alag group karo
        //Har group ka average age nikaalo
        Map<String,Double>avgrResult= empList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getAge)
                ));
        System.out.println(avgrResult);

        //13.Find the department name which has the highest number of employees.
        //Kaunsa department me sabse zyada employees hain.
         String departmentName= empList.stream()
                .collect(Collectors.groupingBy(Employee::getDeptName,
                        Collectors.counting()
                        ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(departmentName);

        //14. Find maximum age of an Employee from Employee List
        //if you want only maximum age then you solve it like this.
        int maxAge= empList.stream()
                .mapToInt(Employee::getAge)
                .max()
                .orElse(0);
        System.out.println(maxAge);

        //if you want the maximum age Employee name then you solve it like this--
        Employee maxAges= empList.stream()
                .max(Comparator.comparing(Employee::getAge))
                .orElse(null);
        System.out.println(maxAges);

        // 15.Find the names of the departments that have more than three employees
List<String>deptName= empList.stream()
        .collect(Collectors.groupingBy(Employee::getDeptName,
                Collectors.counting()))
        .entrySet()
        .stream()
        .filter(x->x.getValue()>3)
        .map(Map.Entry::getKey)
        .collect(Collectors.toList());
        System.out.println(deptName);


    }
}
