package JavaDasar;

public class ObjectApp {
    public static void main(String[] args) {

        ConsOverloading user = new ConsOverloading("Getsu", "Cianjur");
        ConsOverloading user1 = new ConsOverloading("Getsu", "Cianjur");

        ConstructorGetCons user2 = new ConstructorGetCons("User", "ID ");
        ConstructorGetCons user3 = new ConstructorGetCons("UserApp");
        ConstructorGetCons user4 = new ConstructorGetCons(null);

        /* user.name = "Getsu";
         user.address = "Cianjur"; */

        System.out.println("Constructor Overloading : ");

        System.out.println(user.name);
        System.out.println(user.address);
        System.out.println(user.country);

        user1.Show("The Magical Forest");

        System.out.println("\nConstructor get Constructor : ");

        // Constructor get Constructor
        System.out.println("Param Name : " + user2.name);
        System.out.println("Param Address : " + user2.address);
        System.out.println("Param Country : " + user2.country);

        System.out.println(user3.name);
        //System.out.println(user4.country);

    }
}