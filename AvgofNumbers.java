import java.util.Arrays;
import java.util.List;

public class AvgofNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,54,13,13,12,65);
        double avg = list.stream().mapToInt(e->e).average().getAsDouble();
        System.out.println("avarage  number::"+avg);
    }
}
