package week2;

import java.util.*;

public class Demo {

    public static void funnyMethod(int a) throws MyException{
        if (a > 10) {
            throw new MyException("Haha!");
        }
    }

    public static void main(String[] args) {
//        JiaTeLin j1 = new JiaTeLin();
////        Gun j2 = new JiaTeLin();
////        Damageable j3 = new JiaTeLin();
////        j3.make_damage();
////        j2.gunFire();

//        ArrayList list1  = new ArrayList();
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Name");
//        ArrayList<Damageable> list3 = new ArrayList<>();
//        ArrayList<Gun> list4 = new ArrayList<>();
//
//        MyStack<Integer> myStack1 = new MyStack<>();
//        MyStack myStack2 = new MyStack();
//
//
//        // use interface as reference type as much as you can.
//        // Dependency Inversion Principle.
//
//        List<Integer> l1 = new ArrayList<>();
//        Set<String> s1 = new HashSet<>();
//        Map<String, Integer> m1 = new HashMap<>();
//
//        // For Each Loop
//        for(Integer num: l1){  // for num in l1
//
//        }
//
//        // Index loop
//        for(int i = 0; i < l1.size(); i ++){
//
//        }


        try {
            funnyMethod(6);
        }
        catch (MyException e){
            System.out.println("Expcetion happened....");
        }


    }
}
