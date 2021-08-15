package JavaDasar;

public class InterfaceApp {
    public static void main(String[] args){

        InterfaceClass data = new InterChild();
        System.out.println(data.getTier());
        data.drive();

        // Interface Heritance
        heritChild data1 = new InChild ();
        System.out.println(data1.getBrand());
        System.out.println("Number is : " + data1.getNumber());
        data1.drive();

        // Interface Deafult Method
        InterfaceDefault data2 = new DefChild();
        System.out.println(data2.getNumber());
        data2.getNumber();


    }
}
