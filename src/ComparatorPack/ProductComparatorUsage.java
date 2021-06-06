package ComparatorPack;

import java.util.ArrayList;
import java.util.Collections;

/*
The Comparator provides multiple sorting sequences. In other words, we can sort the collection on the basis of multiple
 elements such as id, name, and price etc.
Comparator doesn't affect the original class, i.e., the actual class (ProductComparatorUsage)  is not modified.
Comparator provides compare() method to sort elements.
A Comparator is present in the java.util package.
We can sort the list elements of Comparator type by Collections.sort(List, Comparator) method.
For below examples, within the same package, we have written 3 comparators separately, anyone can be used based upon req.
 */
public class ProductComparatorUsage {
    int id;
    String name;
    double price;
    ProductComparatorUsage(int x, String y, double z){
        id = x;
        name = y;
        price = z;
    }
}
class MainComparatorClass{
    public static void main(String[] args){
        ArrayList<ProductComparatorUsage> arr = new ArrayList<>();
        arr.add(new ProductComparatorUsage(23,"Soap",56.98));
        arr.add(new ProductComparatorUsage(32,"Detergent",46.8));
        arr.add(new ProductComparatorUsage(11,"Laptop",10562.28));
        arr.add(new ProductComparatorUsage(23,"Mobile",234.9));
        arr.add(new ProductComparatorUsage(56,"Piano",12.43));
        arr.add(new ProductComparatorUsage(11,"Sugar",6.2));
        arr.add(new ProductComparatorUsage(23,"Salt",156.8));
        arr.add(new ProductComparatorUsage(76,"Oil",526.33));
        arr.add(new ProductComparatorUsage(9,"Powder",36.8));
        arr.add(new ProductComparatorUsage(34,"Adapter",526.33));

        System.out.println("=====Sorting using IdComparator=======");
        Collections.sort(arr, new IdComparator());
        arr.forEach((x)->System.out.println(x.id+" "+x.name+" "+x.price));

        System.out.println("=====Sorting using NameComparator=======");
        Collections.sort(arr, new NameComparator());
        arr.forEach((x)->System.out.println(x.id+" "+x.name+" "+x.price));

        System.out.println("=====Sorting using PriceComparator=======");
        Collections.sort(arr, new PriceComparator());
        arr.forEach((x)->System.out.println(x.id+" "+x.name+" "+x.price));

        System.out.println("=====Sorting using IDComparator but reverse=======");
        Collections.sort(arr, Collections.reverseOrder(new IdComparator()));  //Complete logic will be reveresed, even
        //When ids are equal, it will reverse the name sorting logic too
        arr.forEach((x)->System.out.println(x.id+" "+x.name+" "+x.price));
    }
}
