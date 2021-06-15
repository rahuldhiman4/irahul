package ExercisesPack;

import java.util.*;
import java.util.stream.Collectors;

public class MaxNumber {
    public static void main(String[] args){
        Integer arr[] = new Integer[]{2,3,33,5,67,12,0,32,57,8,3,2,46,86,32,3,5,78,9,7,34,96};
        List<Integer> l  = Arrays.asList(arr);
        int x = l.stream().max((a,b)->a>b?1:a<b?-1:0).get();
        System.out.println("Max number: "+x);

        System.out.println("Another way to find max: "+l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(0));

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Old school way to find max: "+max);

    }
}
