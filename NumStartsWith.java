import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartsWith {
    public static void main(String[] args) {

   //Numbers Start With
        List<Integer> numbers = Arrays.asList(2,34,65,22,234,2023,21,29,0,67,55);

        List<Integer> numWith2  = numbers.stream()
                                 .map(e->String.valueOf(e))
                                 .filter(e->e.startsWith("6"))
                                 .map(Integer::valueOf)
                                 .collect(Collectors.toList());
        System.out.println(numWith2);


   //Name Starts With
        List<String> names =  Arrays.asList("Pawan","Ranjith", "Manohar", "Suresh","Jagadish", "Prashanth");

        List<String> nameWithP =  names.stream()
                                       .map(e->String.valueOf(e))
                                       .filter(e->e.startsWith("P"))
                                       .map(String::valueOf)
                                       .collect(Collectors.toList());
        System.out.println(nameWithP);
    }
}
