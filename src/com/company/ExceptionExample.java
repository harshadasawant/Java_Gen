package com.company;


import java.io.IOException;

public class ExceptionExample {
//checked
    void checked() throws IOException{
        throw new IOException();
    }
//unchecked
    void checked1() throws ArithmeticException{
        throw new ArithmeticException();
    }

    void div(int a){
            float ans = 13 / a;
            System.out.println("from div ans = " + ans);
    }
    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();
       try {
           obj.div(0);
       }catch (ArithmeticException e){
           e.printStackTrace();
       }
        System.out.println("hello");
//checked
       try {
           obj.checked();
       }catch(IOException e){
           e.printStackTrace();
       }

//       unchecked
       try {
           obj.checked1();
       }catch (ArithmeticException e){
           e.printStackTrace();
       }

        System.out.println("hello1");
    }
}
