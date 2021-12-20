import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumNames {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, 4, 54,3, 2,4, 1, 6,7,1,7,23,7,3);
        Set<Integer> dup = numbers.stream()
                                  .filter(e-> Collections.frequency(numbers, e)>1)
                                  .collect(Collectors.toSet());
                                    System.out.println(dup);


        List<String> names = Arrays.asList("Pawan", "Ranjith", "Bharath", "Manohar", "Raghu", "Pawan","Ranjith", "Bharath", "Manohar");
        Set<String> dup1 = names.stream()
                                .filter(e1-> Collections.frequency(names, e1)>1)
                                .collect(Collectors.toSet());
                                 System.out.println(dup1);
    }
}
