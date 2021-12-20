import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLowestHighestNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(0,12,1,23,3,12,234,89,765,67);

        //sec highest
        int secH = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(secH);

        int sechH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(sechH);

        int  secL = list.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println(secL);

        
    }
}
