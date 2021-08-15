package JavaDasar;

public class ToString {

    public String name;
    public int price;

    public ToString(String name, int price){
        this.name = name;
        this.price = price;
    }

    // toString Method
    public String toString(){
        return "User name : " + name + " || " + " Price : " + price;
    }

}
