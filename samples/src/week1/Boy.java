package week1;

public class Boy extends Human {

    static int count = 11111;


    public Boy(String name, String address) {
        super(name, address);
        yanZhi = 10;
    }


    @Override
    public String toString() {
        return getName() + " " +getAddress() + Integer.valueOf(yanZhi).toString();
    }
}
