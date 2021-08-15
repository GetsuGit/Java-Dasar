package JavaDasar;

public class EqualMethod {
    public static void main(String[] args){

     String first = "Getsu";
     first = first + " " + "Design";

     System.out.println(first);

     String second = "Gestu Design";
     System.out.println(second);

     System.out.println("1. false  : " + (first == second));
     System.out.println("2. false  : " + first.equals(second));

     String third = "Gestu Design";

     System.out.println(second == third);
     System.out.println(second.equals(third));



    }
}
