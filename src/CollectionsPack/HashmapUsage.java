package CollectionsPack;

import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class HashmapUsage {
    public static void main(String[] args){
        JSONParser parser = new JSONParser();
        HashMap<String,String> hm = new HashMap<>();
        try {
            Object obj = parser.parse(new FileReader("/Users/rahul/Documents/WorkingFolder/data.json"));
            JSONObject jObj = (JSONObject) obj;
            Iterator<String> itrKeys = jObj.keySet().iterator();
            while (itrKeys.hasNext()){
                String key = itrKeys.next();
                String value = jObj.get(key).toString();
                hm.put(key,value);
            }
            hm.put(null,"Ajay");
            hm.put(null,"Kanak");

            System.out.println(hm);
        } catch (ParseException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
