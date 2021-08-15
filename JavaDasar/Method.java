package JavaDasar;

class MethodClass {

    String name;
    String address;
    final String country = "Indonesia";

    void Show(String ParamName){
        System.out.println("Hello " + ParamName + "My Name is " + name);
    }
}

public class Method {
    public static void main(String[] args) {

        MethodClass user = new MethodClass();

        user.name = "Getsu";
        user.address = "Cianjur";

        System.out.println(user.name);
        System.out.println(user.address);
        System.out.println(user.country);

        user.Show("Friends ");

    }
}