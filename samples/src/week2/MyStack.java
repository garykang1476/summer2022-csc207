package week2;

import java.util.ArrayList;

public class MyStack<T> {

    ArrayList<T> items;

    MyStack(){
        items = new ArrayList<>();
    }

    void push(T newItem){
        items.add(newItem);  // append
    }

    T pop(){
        return items.remove(items.size() - 1);
    }

    boolean isEmpty(){
        return items.size() == 0;
    }

}
