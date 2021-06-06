package ComparatorPack;

import java.util.Comparator;

public class PriceComparator implements Comparator<ProductComparatorUsage> {
    @Override
    public int compare(ProductComparatorUsage o1, ProductComparatorUsage o2) {
        return (int) (o1.price-o2.price);
        //based upon this logic, it will return +, -ve and 0 value.. similar to logic written in CompareTo method of
        //comparable class.
    }
}
