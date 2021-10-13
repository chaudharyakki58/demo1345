package com.company;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Stream;



public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.println("enterstring :");
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        employee emp;
        emp = new employee(123,21,"ankit");
        //System.out.println(emp.getAge());

        Predicate<String> des= i -> (i.equals("chaudhary")) ;
        Predicate<Integer> age = i -> (i<25);

       //Predicate<Integer> lesserthan = i -> (i < 18);

        list.add("ankit");
        list.add("chaudhary");
        //Stream<java.lang.String> c= list.stream().filter("chaudhary");
        boolean dummy= des.test("chaudhary");
        boolean dummy2= age.test(emp.getAge());
        if(dummy2){
            System.out.println(emp.getName());
        }
        System.out.println("result check and perdicate ");
        boolean a = des.test("chaudhary");
        boolean b= age.test(20);
        //boolean ce = a.and(b);
        System.out.println(a);
        System.out.println(b);

        //sc.next();
    }


}
