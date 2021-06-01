    package CollectionsPack;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.stream.Collectors;

    public class StreamsUsage {
        public static void main(String[] args) {
            List<Integer> al = new ArrayList<>();
                al.add(4);
                al.add(2);
                al.add(1);
                al.add(3);
                al.add(3);
            List<Integer> al2 = al.stream().filter(x->x>2).collect(Collectors.toList());
            List<Integer> al3 = al.stream().map(x->x+2).collect(Collectors.toList());
            List<Integer> al4 = al.stream().sorted((x,y)->x>y?1:x<y?-1:0).collect(Collectors.toList());
            long cnt = al.stream().distinct().count();
            al2.forEach(System.out::println);
            System.out.println("=============");
            al3.forEach(System.out::println);
            System.out.println("=============");
            al4.forEach(System.out::println);
            System.out.println("======Distinct count======="+cnt);

        }
    }
