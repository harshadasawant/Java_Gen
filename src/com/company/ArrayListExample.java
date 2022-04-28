package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    static void arrayFunction(){
        List<String> li = new ArrayList<String>();
        li.add("Priyanka");
        li.add("Harshada");
        li.add("Ashwini");
        li.add("Ashwini");
        li.add(2,"Priya");

        for(String s:li){
            System.out.println("s =="+s);
        }
        for(int i=0;i<li.size();i++){
            System.out.println("li.get(i) = " + li.get(i));
        }
    }
    public static void main(String[] args) {
        arrayFunction();
    }

}
