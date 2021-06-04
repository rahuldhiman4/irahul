    package CollectionsPack;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.*;
    import java.util.stream.Collectors;

    public class StreamsUsage {
        public static void main(String[] args) {
            List<Integer> al = new ArrayList<>();
            al.add(4);
            al.add(2);
            al.add(1);
            al.add(3);
            al.add(3);
            List<Integer> al2 = al.stream().filter(x -> x > 2).collect(Collectors.toList());
            List<Integer> al3 = al.stream().map(x -> x + 2).collect(Collectors.toList());
            List<Integer> al4 = al.stream().sorted((x, y) -> x > y ? 1 : x < y ? -1 : 0).collect(Collectors.toList());
            long cnt = al.stream().distinct().count();
            al2.forEach(System.out::println);
            System.out.println("=============");
            al3.forEach(System.out::println);
            System.out.println("=============");
            al4.forEach(System.out::println);
            System.out.println("======Distinct count=======" + cnt);

            Map<Integer, String> mp = new HashMap<Integer, String>();
            mp.put(3, "Rahul");
            mp.put(2, "Dhruv");
            mp.put(8, "Kanak");
            mp.put(4, "Ekta");
            mp.put(9, "Puneet");
            mp.put(5, "Ajay");
            mp.put(1, "Raj");
            mp.put(7, "Urmila");
            mp.put(6, "Heena");

            System.out.println("======Sorting map by key=======");
            mp.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
            System.out.println("======Sorting map by key Reverse Order=======");
            mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
            System.out.println("======Sorting map by Value=======");
            mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
            System.out.println("======Sorting map by Value Reverse Order=======");
            mp.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

            System.out.println("======Filtering map by key=======");
            Map<Integer, String> mp2 = mp.entrySet().stream().filter(x -> x.getKey() < 6).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
            mp2.forEach((key, value) -> System.out.println(key + " " + value));

            System.out.println("======Filtering map by both key and value=======");
            Map<Integer, String> mp3 = mp.entrySet().stream().filter(x->x.getKey()<5).filter(x->x.getValue().startsWith("R")).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
            for(Map.Entry m : mp3.entrySet()){
                System.out.println(m.getKey()+" = "+m.getValue());
            }

            System.out.println("======Sort above map result by key in reverse.=======");
            mp3.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        }
    }