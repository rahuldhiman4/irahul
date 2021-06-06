package ComparatorPack;

import java.util.Comparator;

public class NameComparator implements Comparator<ProductComparatorUsage> {

    @Override
    public int compare(ProductComparatorUsage o1, ProductComparatorUsage o2) {
        return o1.name.compareTo(o2.name);
    }
}
