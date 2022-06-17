package week4.dip;

public class Operator {

    Vehicle c;  // Dependency..

    Operator(Vehicle c){
        c = this.c;
    }

    void use(){
        c.run();
    }
}
