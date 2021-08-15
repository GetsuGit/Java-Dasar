package JavaDasar;

import java.util.Objects;

public class EqualsOverride {


    public String name;
    public int price;

    public EqualsOverride(String name, int price){
        this.name = name;
        this.price = price;
    }

    // toString Method
    public String toString(){
        return "User name : " + name + " || " + " Price : " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsOverride that = (EqualsOverride) o;
        return price == that.price && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
