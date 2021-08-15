package JavaDasar;

public interface InterfaceDefault {

    void drive();

    int getNumber();

    default boolean isBig(){
        return false;
    }
}

