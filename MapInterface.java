import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,String> employee = new HashMap<>();
        employee.put("One","pawan");
        employee.put("Two","Ranjith");
        employee.put("Three","Bharath");
        employee.put("Four","Manohar");
        employee.put("Five","Kusuma");
        employee.put("Six","Ajay");
        employee.put("Seven","Manu");
        System.out.println(employee);
        employee.put("Eight","harsh");
        System.out.println(employee);
        employee.put(null, "Ajay");
        employee.put(null, "Vamshi");
        System.out.println(employee);

        Map<String,String> employee1 = new LinkedHashMap<>();
        employee1.put("One","pawan");
        employee1.put("Two","Ranjith");
        employee1.put("Three","Bharath");
        employee1.put("Four","Manohar");
        employee1.put("Five","Kusuma");
        employee1.put("Six","Ajay");
        employee1.put("Seven","Manu");
        System.out.println(employee1);
        employee1.put("Eight","harsh");
        System.out.println(employee1);
        employee1.put(null, "Ajay");
        employee1.put(null, "Vamshi");
        System.out.println(employee1);




        Map<String,String> employee3 = new Hashtable<>();
        employee3.put("One","pawan");
        employee3.put("Two","Ranjith");
        employee3.put("Three","Bharath");
        employee3.put("Four","Manohar");
        employee3.put("Five","Kusuma");
        employee3.put("Six","Ajay");
        employee3.put("Seven","Manu");
        System.out.println(employee3);
        employee3.put("Eight","harsh");
        System.out.println(employee3);
        employee3.put(null, "Ajay");
        employee3.put(null, "Vamshi");
        System.out.println(employee3);

        Map<String,String> employee2 = new TreeMap<>();
        employee2.put("One","pawan");
        employee2.put("Two","Ranjith");
        employee2.put("Three","Bharath");
        employee2.put("Four","Manohar");
        employee2.put("Five","Kusuma");
        employee2.put("Six","Ajay");
        employee2.put("Seven","Manu");
        System.out.println(employee2);
        employee2.put("Eight","harsh");
        System.out.println(employee2);
        employee2.put(null, "Ajay");
        employee2.put(null, "Vamshi");
        System.out.println(employee2);


    }
}
