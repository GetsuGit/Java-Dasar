package JavaDasar;

public class InChild implements heritChild {
    public void drive(){
        System.out.println("Drive From Interface Inheritance : Drive Code");
    }

    public int getNumber(){
        return 4;
    }

    public String getBrand() {
        return "\nBrand From Interface Inheritance : Drive User";
    }
}
