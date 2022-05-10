import java.util.Arrays;
import java.util.Collections;

public class Furniture {
    String name;
    String color;
    int warranty;
    int price;
    boolean is_new;

    public Furniture(String name, int price, int warranty, boolean is_new){
        this.name = name;
        this.price = price;
        this.warranty = warranty;
        this.is_new = is_new;
    }

    public Furniture(String name, int price, String color, int warranty){
        this.name = name;
        this.color = color;
        this.warranty = warranty;
        this.price = price;
    }

    public Furniture(String name, int price, String color, int warranty, boolean is_new){
        this.name = name;
        this.color = color;
        this.warranty = warranty;
        this.price = price;
        this.is_new = is_new;
    }

    @Override
    public String toString() {
        return  "Furniture {\n\tname: " + name +
                ",\n\tcolor: " + color +
                ",\n\twarranty: " + warranty +
                ",\n\tprice: " + price +
                ",\n\tis new?: " + is_new +
                "\n}";
    }
}