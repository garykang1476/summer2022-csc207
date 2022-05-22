package week1;

public class Demo {

    public static void main(String[] args) {

        // downward
        Human h1 = new Girl("Alex", "45 C");
        Boy h2 = new Boy("Alex", "45 C");

        ((Girl) h1).huaZhuang();
        //((Girl) h2).huaZhuang();



        // upward
        System.out.println(h2.count);
        System.out.println(((Human) h2).count);


        // cross reference -> Compile..
        // ((String) h2)



    }
}
