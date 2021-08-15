package JavaDasar;

class ThisKeywordClass {

    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    ThisKeywordClass(String name, String address){
        this.name = name;
        this.address = address;
    }

    ThisKeywordClass(String paramName) {
        this(paramName, null);
    }

    void Show(String name){
        System.out.println("\nHello " + name + "My Name is " + this.name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        ThisKeywordClass user = new ThisKeywordClass("User", "Cianjur");
        ThisKeywordClass user1 = new ThisKeywordClass("Design");

        /* user.name = "Getsu";
         user.address = "Cianjur"; */

        System.out.println("This Keyword: ");

        System.out.println("Name : " + user.name);
        System.out.println("Address : " + user.address);
        System.out.println("Country : " + user.country);

        user.Show(" User ");

        System.out.println(user1.name);
        //System.out.println(user4.country);

    }
}

