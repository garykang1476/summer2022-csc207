package week1;

public abstract class Child extends Parent {
    int a;

    Child(int a){
        this.a = a;
    }


    // inherited abstract output()..


    abstract void newMethod();


    void output(String s){
        super.output(s);
        System.out.println("Overloaded method...");

    }


}
