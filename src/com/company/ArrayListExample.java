package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

    static void arrayFunction(){
        List<String> li = new ArrayList<String>();
        li.add("Priyanka");
        li.add("Harshada");
        li.add("Ashwini");
        li.add("Ashwini");
        li.add(2,"Priya");

//        for(String s:li){
//            System.out.println("s =="+s);
//        }

        Collections.sort(li);
        for(int i=0;i<li.size();i++){
            System.out.println("li.get(i) = " + li.get(i));
        }
    }

    static void LinkedListFunction(){
        List<String> li = new LinkedList<String>();
        li.add("Priyanka");
        li.add("Harshada");
        li.add("Ashwini");
        li.add("Ashwini");
        li.add(2,"Priya");

        System.out.println("===================Linked List ====================");
        for(String s:li){
            System.out.println("s =="+s);
        }
      }

      static void PersonList(){
        List<Person1> personList  = new ArrayList<Person1>();
          Person1 p1 = new Person1();
          p1.setAge(35);
          p1.setName("Harshada");
          p1.setWeight(55.0f);

          Person1 p2 = new Person1();
          p2.setAge(26);
          p2.setName("chhavi");
          p2.setWeight(50.0f);

          personList.add(p1);
          personList.add(p2);

          for(Person1 p : personList){
              System.out.println(p.getName());
              if(p.getName().equals("chhavi")){
                  p.setAge(24);
              }
              System.out.println(p.getAge());
              System.out.println(p.getWeight());

          }
      }


    static void StudentList(){
        List<Student1> li = new ArrayList<Student1>();
        li.add(new Student1(3,23,"harshada"));
        li.add(new Student1(2,34,"Teju"));
        li.add(new Student1(1,20,"Daksh"));
        Collections.sort(li);
        for(Student1 st : li){
            System.out.println(st);

        }
    }

    static void StudentSortList(){
        List<Student2> li = new ArrayList<Student2>();
        li.add(new Student2(3,23,"Harshada"));
        li.add(new Student2(2,17,"Teju"));
        li.add(new Student2(1,20,"Daksh"));
        System.out.println("===============sort on Name ===============");
        Collections.sort(li,new NameComparator());
        for(Student2 st : li){
            System.out.println(st);
        }
        System.out.println("===============sort on Age ===============");
        Collections.sort(li,new AgeComparator());
        for(Student2 st : li){
            System.out.println(st);
        }
    }

    public static void main(String[] args) {
//        arrayFunction();
//        LinkedListFunction();
//        PersonList();
        StudentList();
        StudentSortList();

    }

}
