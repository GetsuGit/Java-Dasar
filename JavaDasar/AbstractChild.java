package JavaDasar;

class AbChild extends AbstractClass {


}

public class AbstractChild{
    public static void main(String[] args){

        AbChild abstract1 = new AbChild();
        abstract1.name = "Getsu";

        System.out.println("It's from Abstract Class : " + abstract1.name);
    }
}