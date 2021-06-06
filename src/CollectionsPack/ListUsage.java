package CollectionsPack;

import java.util.ArrayList;
import java.util.Iterator;

/*
Iterable(Interface)<-----Collection(Interface)<-----List(Interface)<------ArrayList/LinkedList/(Vector<---Stack)
The important points about Java ArrayList class are:
Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.
Java ArrayList class is non synchronized.
Java ArrayList allows random access because array works at the index basis.
In ArrayList, manipulation is little bit slower than the LinkedList in Java because a lot of shifting needs to occur
if any element is removed from the array list.
 */
public class ListUsage {
    public static void main(String[] args){
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Rahul");
        alist.add("Dhruv");
        alist.add("Ekta");
        alist.add("Mom");
        alist.add("Dad");
        alist.add("Rahul");  //duplicate values possible
        alist.add(null);
        alist.add(null); //multiple null values allowed
        System.out.println("Arraylist printed as "+alist);
        //We can iterate in following ways
        System.out.println("=====Using Iterator=====");
        Iterator<String> itr = alist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("=====Using For loop=====");
        for(String str:alist){
            if ((str != null && !str.equals("Rahul"))) {
                System.out.println(str);
            }
        }

        System.out.println("=====Using Foreach loop=====");
        alist.forEach(System.out::println);

        if(alist.contains("Rahul")){
            System.out.println("Value Present");
        }

        alist.remove(null); //first matched element is removed.
        System.out.println(alist);

        ArrayList<String> alist2 = new ArrayList<>();
        alist2.add("Puneet");
        alist2.add("Neha");

        alist.addAll(alist2);  //adding 1 list to other
        System.out.println(alist);

        System.out.println("Check if alist2 is present in alist:=====> "+alist.containsAll(alist2));

        alist.removeAll(alist2);  //removing 1 list from other
        System.out.println(alist);


    }
}
