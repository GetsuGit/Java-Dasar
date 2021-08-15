package JavaDasar;

public class ToStringApp {
    public static void main(String[] args){

        ToString data = new ToString("Getsu", 100);

        System.out.println(data.name);
        System.out.println(data.price);

        System.out.println(data);
    }
}
