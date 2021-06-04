package CollectionsPack;
/*
1. The hierarchy of Java Map is given below:
Map (Interface) <------SortedMap (Interface)<------TreeMap (Class)
Map (Interface) <------Hashmap (Class) <--------- LinkedHashMap (Class)
2. A Map is useful if you have to search, update or delete elements on the basis of a key.
3. A Map doesn't allow duplicate keys, but you can have duplicate values. HashMap and LinkedHashMap allow null keys and
values (but only 1 null key), but TreeMap doesn't allow any null key.
4. A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
5. HashMap is the implementation of Map, but it doesn't maintain any order.
   LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.
   TreeMap is the implementation of Map and SortedMap. It maintains ascending order.
 */
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.*;
import java.util.*;

public class HashmapUsage {
    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        HashMap<String,String> hm = new HashMap<>();
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
        TreeMap<String,String> tm = new TreeMap<>();
        try {
            Object obj = parser.parse(new FileReader("/Users/rahul/Documents/WorkingFolder/data.json"));
            JSONObject jObj = (JSONObject) obj;
            Iterator<String> itrKeys = jObj.keySet().iterator();
            while (itrKeys.hasNext()){
                String key = itrKeys.next();
                String value = jObj.get(key).toString();
                hm.put(key,value);
                lhm.put(key,value);
                tm.put(key,value);
            }
            hm.put("-1","Kanak");
            hm.put("98","Raj");
            hm.put(null,"Ajay"); //doesn't maintain any order.. can print in any order.

            lhm.put("-1","Kanak");
            lhm.put("98","Raj");
            lhm.put(null,"Ajay");  //maintains insertion order.. will print elements the way they were inserted.

//            tm.put(null,"Ajay");   //can't put null key
            tm.put("100",null); //maintains ascending order, will be printed based upon ascending order.

            System.out.println("Hashmap : "+hm);
            System.out.println("LinkedHashMap "+lhm);
            System.out.println("TreeMap "+tm);

            /*
            Three ways to iterate a Hashmap
                Using a for loop to iterate through a HashMap
                Using a forEach to iterate through a HashMap
                Using an iterator to iterate through a HashMap
             */

            System.out.println("Using a for loop to iterate through a HashMap ");
            for(Map.Entry m:hm.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }

            System.out.println("Using a forEach to iterate through a HashMap");
            lhm.forEach((key,value)->System.out.println(key +" = "+value));

            System.out.println("Using an iterator to iterate through a HashMap");
            Iterator<Map.Entry<String,String>> it = tm.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String,String> set = it.next();
                System.out.println(set.getKey() + " = " + set.getValue());
            }
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }
}
