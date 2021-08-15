package JavaDasar;

public class MethodHidingApp {
     public static void main(String[] args){

         HidingChild hidingChild = new  HidingChild();
         hidingChild.name = "Getsu";
         hidingChild.doIt();
         System.out.println("Name is : " + hidingChild.name);

         //VariableHiding parentHiding = (VariableHiding) hidingChild;
         VariableHiding parentHiding = new VariableHiding();
         parentHiding.doIt();


     }
}
