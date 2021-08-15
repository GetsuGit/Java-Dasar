package JavaDasar;

public class EqualsApp {
    public static void main(String[] args){

        EqualsOverride equal = new EqualsOverride("Getsu", 100);

        System.out.println(equal.name);
        System.out.println(equal.price);

        System.out.println(equal);

        EqualsOverride equal1 = new EqualsOverride("Getsu", 100);

        System.out.println(equal.equals(equal1));
        System.out.println(equal.hashCode() == equal1.hashCode());

    }
}
