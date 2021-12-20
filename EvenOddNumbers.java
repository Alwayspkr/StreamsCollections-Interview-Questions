import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,42,46,0,8,92,53,11,91,80);
//evenNumbers
        List<Integer> evenList = numbers.stream()
                                                .filter(e-> e%2==0)
                                                .collect(Collectors.toList());
                                                 System.out.println(evenList);

//OddNumbers
        List<Integer> oddList = numbers.stream()
                                                .filter(e-> e%2!=0)
                                                .collect(Collectors.toList());
                                                 System.out.println(oddList);


    }
}
