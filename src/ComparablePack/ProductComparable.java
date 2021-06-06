package ComparablePack;

import java.util.ArrayList;
import java.util.Collections;

/*
Comparable provides a single sorting sequence. In other words, we can sort the collection on the basis of a single
element such as id, name, and price.
Comparable affects the original class, i.e., the actual class is modified.
Comparable provides compareTo() method to sort elements.
Comparable is present in java.lang package.
We can sort the list elements of Comparable type by Collections.sort(List) method.
 */
public class ProductComparable implements Comparable<ProductComparable>{
    int id;
    String name;
    double price;
    ProductComparable(int x, String y, double z){
        id = x;
        name = y;
        price = z;
    }

    //As in compareTo method, we are writing sorting logic for id; so that becomes natural sorting of this class and you
    //you cant sort with name and price simultaneously. only any one sorting type is allowed.
    @Override
    public int compareTo(ProductComparable o) {
        //IF YOU REPLACE 1 WITH -1 AND -1 WITH 1, IT WILL REVERSE THE LOGIC AND PRINT IN REVERSE ORDER
        if(this.id>o.id)
        return 1;
        else if(this.id<o.id)
            return -1;
        else
            return 0;
    }
}
class MainComparableClass{
    public static void main(String[] args){
        ArrayList<ProductComparable> productArray = new ArrayList<>();
        productArray.add(new ProductComparable(23,"Soap",56.98));
        productArray.add(new ProductComparable(32,"Detergent",46.8));
        productArray.add(new ProductComparable(11,"Laptop",10562.28));
        productArray.add(new ProductComparable(23,"Mobile",234.9));
        productArray.add(new ProductComparable(56,"Piano",12.43));
        productArray.add(new ProductComparable(11,"Sugar",6.2));
        productArray.add(new ProductComparable(23,"Salt",156.8));
        productArray.add(new ProductComparable(76,"Oil",526.33));
        productArray.add(new ProductComparable(9,"Powder",36.8));
        productArray.add(new ProductComparable(34,"Adapter",526.33));
        Collections.sort(productArray);
        productArray.forEach((x)->System.out.println(x.id+" "+x.name+" "+x.price));

    }
}
