package JavaDasar;

class ConstructorClass {

    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    ConstructorClass(String ParamName, String ParamAddress){
        name = ParamName;
        address = ParamAddress;
    }

    void Show(String ParamName){
        System.out.println("Hello " + ParamName + "My Name is " + name);
    }
}
public class Constructor {
    public static void main(String[] args) {

        ConstructorClass user = new ConstructorClass("Getsu", "Cianjur");

       // user.name = "Getsu";
        // user.address = "Cianjur";

        System.out.println(user.name);
        System.out.println(user.address);
        System.out.println(user.country);

        user.Show("Design ");



    }
}
