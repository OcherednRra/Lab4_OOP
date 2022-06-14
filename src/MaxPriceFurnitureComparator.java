import java.util.Comparator;

public class MaxPriceFurnitureComparator implements Comparator<Furniture> {

    public int compare(Furniture o1, Furniture o2) {

        return o1.getPrice() - o2.getPrice();
    }
}
