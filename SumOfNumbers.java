import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,56,76,23,65);
        Optional<Integer> sum = list.stream().reduce((a,b)->a+b);
        System.out.println(sum.get());
    }
}
