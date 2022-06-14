import java.util.Comparator;

public class MaxWarrantyFurnitureComparator implements Comparator<Furniture> {

    public int compare(Furniture o1, Furniture o2) {

        return o1.getWarranty() - o2.getWarranty();
    }
}
