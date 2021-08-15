package JavaDasar;

public class MethodOverrApp {
        public static void main(String[] args){

            MethodOverriding manager = new MethodOverriding();
            manager.name = "Getsu";
            manager.sayHello("User");

            vicePresident vp = new vicePresident();
            vp.name = "Code";
            vp.sayHello("Design ");

        }
}
