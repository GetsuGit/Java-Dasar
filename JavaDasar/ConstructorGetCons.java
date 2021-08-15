package JavaDasar;

public class ConstructorGetCons {

    String name;
    String address;
    final String country = "Indonesia";


    ConstructorGetCons(String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    ConstructorGetCons(String paramName){

        this(paramName, null);
    }

    ConstructorGetCons(){

        this(null);
    }
}
