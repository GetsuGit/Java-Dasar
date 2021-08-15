package JavaDasar;

public class ConsOverloading {

        String name;
        String address;
        final String country = "Indonesia";

        // Constructor
        ConsOverloading(String ParamName, String ParamAddress){
            name = ParamName;
            address = ParamAddress;
        }

        ConsOverloading(String ParamAddress){
            address = ParamAddress;
        }

        // Constructor Overloading
        void Show(String ParamName){
            System.out.println("My address at " + ParamName + "My Name is " + name);
        }
   }
