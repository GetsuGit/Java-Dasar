package JavaDasar;

public enum EnumLevel {

    STANDARD("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String Data;

    // Enum Method
    EnumLevel(String Data){
        this.Data = Data;
    }

    public String getData(){
        return Data;
    }
}
