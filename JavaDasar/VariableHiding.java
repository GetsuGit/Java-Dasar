package JavaDasar;

class VariableHiding {
    String name;
    void doIt(){
        System.out.println("Do it in Parent ");
    }
}

class HidingChild {
    String name;
    void doIt(){
        System.out.println("Do it in child ");
    }
}
