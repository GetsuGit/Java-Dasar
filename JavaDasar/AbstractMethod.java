package JavaDasar;

abstract class AbstractMethod {

    public String name;

    public abstract void run();
}

class AbsMethod extends AbstractMethod{

    public void run(){
        System.out.println("User name : " + name + " is run");

        }
}