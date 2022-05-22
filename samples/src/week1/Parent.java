package week1;

public abstract class Parent {
    Parent(int a) {
        System.out.println("Using constructor with a parameter");

    }


    Parent(){
        System.out.println("Using default constructor");
    }

    abstract void output();

    void output(String s){
        System.out.println("Parent's output");
    }

    void test(){
        System.out.println("Test method in superclass");

    }}
