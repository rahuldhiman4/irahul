package ComparatorPack;

import java.util.Comparator;

public class IdComparator implements Comparator<ProductComparatorUsage> {

    @Override
    public int compare(ProductComparatorUsage o1, ProductComparatorUsage o2) {
        if(o1.id>o2.id){
            return 1;
        }
        else if(o1.id<o2.id){
            return -1;
        }
        else
            return o1.name.compareTo(o2.name);  //If ids are similar, sort on names for those.
    }
}
