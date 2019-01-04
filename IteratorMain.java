package Sets;

import java.util.*;

public class IteratorMain {

    public static void main(String[] args) {
        List<String> list = new LinkedList<String>(); //Maintains Insertionorder , allow duplicated
        list.add("niki");
        list.add("teli");

        Iterator it = list.iterator();
        //Iterator is used to iterate HashMap, HashSet, ArrayList and LinkedList
        // Iterator has 3 methods   : hasNext(), next(), remove()
        // Iterator it = list.iterator() // in enumeration it is .elements()
        // Fail-fast , safer

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for(String s: list){
            System.out.println(s);
        }
        List<Employee> emp = new LinkedList<Employee>();  // Maintains the insertion order , allows duplicates
        emp.add(new Employee("niki",1));
        emp.add(new Employee("niki1",2));
        emp.add(new Employee("niki2",3));
        emp.add(new Employee("niki3",4));

        Iterator<Employee> it1 = emp.iterator();
        while (it1.hasNext()){
            System.out.print(it1.next().name);
            System.out.print("\n");
        }

        HashSet<Employee> emp1 = new LinkedHashSet<Employee>(); // Maintains the insertion order, but no duplicates
        emp1.add(new Employee("niki",1));
        emp1.add(new Employee("niki1",2));
        emp1.add(new Employee("niki2",3));
        emp1.add(new Employee("niki3",4));

        HashMap<Integer,Employee> emp2 = new LinkedHashMap<Integer,Employee>(); // Maintains the insertion order, but no duplicates
        emp2.put(1,new Employee("niki",1));
        emp2.put(2,new Employee("niki1",2));
        emp2.put(4,new Employee("niki2",3));
        emp2.put(3,new Employee("niki3",4));

        Set dd= emp2.keySet();
        Iterator eee = dd.iterator();
        while (eee.hasNext()){
            System.out.println(emp2.get(eee.next()).name);

        }
    }
}


