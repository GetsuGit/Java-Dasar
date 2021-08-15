package JavaDasar;

public class EnumApp {
    public static void main(String[] args){

        EnumClass enumclass = new EnumClass();

        enumclass.setName("User");
        enumclass.setLevel(EnumLevel.PREMIUM);

        System.out.println("Name : " + enumclass.getName());
        System.out.println("Level : " + enumclass.getLevel());
        System.out.println(enumclass.getLevel().getData());

        // konpersi Enum
        String leveName = EnumLevel.VIP.name();
        System.out.println(leveName);

        EnumLevel enumLevel = EnumLevel.valueOf("PREMIUM");
        System.out.println(enumLevel);

        //EnumLevel[] enumLevel1 = EnumLevel.values();
        //System.out.println(enumLevel1);

        System.out.println("Print Level");
        for (EnumLevel enumLevel1 : EnumLevel.values()){
            System.out.println(enumLevel1);
        }

    }
}
