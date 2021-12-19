import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetLinkedHashSetTreeSet {
    public static void main(String[] args) {
        Set<String> employees1 = new HashSet<>();
        employees1.add("Pawan");
        employees1.add("Ranjith");
        employees1.add("Pawan");
        employees1.add("Bharath");
        employees1.add("Sreenu");
        employees1.add("Chandu");
        System.out.println("HashSet values"+employees1);
        employees1.add(null);
        employees1.add(null);
        System.out.println("HashSet values"+employees1);



        Set<String> employees = new LinkedHashSet<>();
        employees.add("Pawan");
        employees.add("Ranjith");
        employees.add("Pawan");
        employees.add("Bharath");
        employees.add("Sreenu");
        employees.add("Chandu");
        System.out.println("LinkedHashSet values"+employees);
        employees.add(null);
        employees.add(null);
        System.out.println("LinkedHashSet values"+employees);

        Set<String> employees2 = new TreeSet<>();
        employees2.add("Pawan");
        employees2.add("Ranjith");
        employees2.add("Pawan");
        employees2.add("Bharath");
        employees2.add("Sreenu");
        employees2.add("Chandu");
        System.out.println("TreeSet values"+employees2);
        employees2.add(null);
        employees2.add(null);
        System.out.println("TreeSet values"+employees2);
    }
}

//OutPut::
/*HashSet values[Bharath, Pawan, Ranjith, Chandu, Sreenu]
        HashSet values[null, Bharath, Pawan, Ranjith, Chandu, Sreenu]
        LinkedHashSet values[Pawan, Ranjith, Bharath, Sreenu, Chandu]
        LinkedHashSet values[Pawan, Ranjith, Bharath, Sreenu, Chandu, null]
        TreeSet values[Bharath, Chandu, Pawan, Ranjith, Sreenu]
        Exception in thread "main" java.lang.NullPointerException
        at java.util.TreeMap.put(TreeMap.java:563)
        at java.util.TreeSet.add(TreeSet.java:255)
        at HashSetLinkedHashSetTreeSet.main(HashSetLinkedHashSetTreeSet.java:43)*/
