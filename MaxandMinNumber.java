import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxandMinNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,23,34,43,54,222,12,2222,90);

        int max =  list.stream().max(Comparator.comparing(Integer:: valueOf)).get();
        System.out.println(max);

        int min =  list.stream().min(Comparator.comparing(Integer:: valueOf)).get();
        System.out.println(min);


    }
}
