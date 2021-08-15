package JavaDasar;

public class InnerApp {
    public static void main(String[] args){

        InnerClass innerClass = new InnerClass();
        innerClass.setName("Getsu Code");

        InnerClass.Inner InnerChild = innerClass.new Inner();
        InnerChild.setName("User");

        System.out.println("From InnerChild : " + InnerChild.getName());
        System.out.println("From InnerClass : " + InnerChild.getInnerClass());

        InnerClass innerClass2 = new InnerClass();
        innerClass2.setName("Belum Ada");

        InnerClass.Inner InnerChild2 = innerClass2.new Inner();
        InnerChild2.setName("Design");

        System.out.println("From InnerChild : " + InnerChild2.getName());
        System.out.println("From InnerClass : " + InnerChild2.getInnerClass());

    }

}
