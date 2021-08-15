package JavaDasar;

class FieldClass {
    String name;
    String address;
    final String country = "Indonesia";
}
public class Field {
    public static void main(String[] args) {

        FieldClass user = new FieldClass();

        user.name = "Getsu Code";
        user.address = "Cianjur";

        System.out.println(user.name);
        System.out.println(user.address);
        System.out.println(user.country);

    }
}