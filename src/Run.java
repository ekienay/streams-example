import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Run {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Roma");
        list.add("Marina");
        list.add("Sasha");
        list.stream().filter(s -> s.length() == 4).forEach(System.out::println);
        list.stream().filter(s -> s.length() == 4).map(s -> s + ": is Junior Dev").forEach(System.out::println);


        List<String> example = Stream.of("back","front").collect(Collectors.toList());
        example.forEach(System.out::println);

        List<Integer> intExample = Stream.of(1,2,2,4,6).findFirst().stream().collect(Collectors.toList());
        intExample.forEach(System.out::println);

        String str = Stream.of("b", "a", "c", "k").collect(Collectors.joining(" -> ", "[ ", " ]"));
        System.out.println(str);

    }
}
