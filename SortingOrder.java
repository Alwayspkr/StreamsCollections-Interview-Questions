import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrder {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,32,54,2,13,54,12,13,14,9,1,0,55);

        List<Integer> AscOrder = list.stream().sorted().collect(Collectors.toList());
        System.out.println(AscOrder);

        List<Integer> DiscOrder = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(DiscOrder);

    }
}
