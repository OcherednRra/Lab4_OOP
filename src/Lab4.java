import java.util.Arrays;
import java.util.Collections;

public class Lab4 {
    public static void main(String[] args) {
		/*
		1515 % 11 = 8  -----> Клас меблі, як мінімум 5 полів
		*/

        Furniture[] furniture = {
            new Furniture("armchair", 1200, 5, true),
            new Furniture("bed", 1500, 3, true),
            new Furniture("table", 1000, "brown", 2),
            new Furniture("shelf", 500, "yellow", 1),
            new Furniture("wardrobe", 900, "black", 7, false)
        };

        Integer[] prices = new Integer[furniture.length];
        Integer[] warranties = new Integer[furniture.length];

        for (byte i = 0; i < furniture.length; i++){
            prices[i] = furniture[i].price;
            warranties[i] = furniture[i].warranty;
        }

        Arrays.sort(prices);
        Arrays.sort(warranties, Collections.reverseOrder());

        System.out.println("Відсортований масив цін (за зростанням): " + Arrays.toString(prices));
        System.out.println("Відсортований масив гарантій (за спаданням): " + Arrays.toString(warranties));
    }
}
