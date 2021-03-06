import java.util.*;

public class Lab4 {
    public static void main(String[] args) {

		/*
		1515  % 11 = 8  -----> Клас меблі, як мінімум 5 полів
		*/

        List<Furniture> furnitures = new ArrayList<>();

        furnitures.add(new Furniture("armchair", 1200, 5, true));
        furnitures.add(new Furniture("bed", 1500, 3, true));
        furnitures.add(new Furniture("table", 1000, "brown", 2));
        furnitures.add(new Furniture("shelf", 500, "yellow", 1));
        furnitures.add(new Furniture("wardrobe", 900, "black", 7, false));

        System.out.println("Сортування за ціною:");
        Collections.sort(furnitures, new MaxPriceFurnitureComparator());
        System.out.println(furnitures);

        System.out.println("Сортування за гарантією:");
        Collections.sort(furnitures, new MaxWarrantyFurnitureComparator());
        System.out.println(furnitures);

    }
}
