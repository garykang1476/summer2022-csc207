package week1;

public class Girl extends Human {
    public Girl(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "This is a girl";
    }

    public void huaZhuang(){
        System.out.println("Zhen hao kan!");
    }
}
