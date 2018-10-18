package Sets;

import java.util.*;

public class main {

    public static void main(String[] args) {


        /*
             HashTable:
            - Uses key value pair
            - uses put to add vales.(table.put(key,val);
            **Allows Duplicate
            ** Does not maintain insertion order

            // different from Hashmap
            ** Does not allow null for both key and value
            - Synchronized and thread safe, poor performance

            Hashtable table = new Hashtable<Integer, String>();
            table.put(null, null);  Failed with null pointer exception
            table.put(1, "yes");
            table.put(1, "no");
            Set<Integer> s = table.keySet();
            for (Integer i : s) {
                //for duplicate keys , only one will be picked
                System.out.println(table.get(i));
            }
            */

        /* HashMap
        - Uses key value pair
        - uses put to add vales.(table.put(key,val);
        - Allows Duplicate
        - Does not maintain insertion order , LinkedHashMap maintains insertion order of the key .LinkedHashMap used more memory to maintain the order

        HashMap<String,Integer> s1 = new LinkedHashMap<String,Integer>();

        //different from Hashtable
        - Allow null for both key and value
        - Not Synchronized and not thread safe. You can synchronize the using Collections.synchroinzedCollection(), better performance

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(null, null);
        map.put(1, "yes");
        map.put(2, "no");

        Set<Integer> ss = map.keySet();
        for (Integer i : ss) {
            //for duplicate keys , only one will be picked
            System.out.println(map.get(i));
        }

        HashMap<String,Integer> s1 = new LinkedHashMap<String,Integer>();
        s1.put("a",1);
        Set<String> s = s1.keySet();
        for(String ss: s){
            System.out.println(s1.get(ss));
        }

        HashSet
        same as Hashmap
        - Allows null keys
        - Not Synchronized and not thread safe .You can synchronize the using Collections.synchroinzedCollection()
         to make it read only, better performance
        - Does not maintain insertion order , LinkedHashSet does maintain order .LinkedHashSet uses more memory to maintain a link of order

        HashSet<String> s2 = new LinkedHashSet<String>();

        // Different from Hashtable and HashSet
        -  Does not Allow duplicate, it is used to maintain unique list
        -  Uses just one value
        -  Uses add instead of put (set.add();

        Set<String> ss = new HashSet<String>();
        ss.add("aa");
        ss.add("aa");  //wont get added as maintains unique list
        System.out.println(ss.size());
        for(String s:ss){
            System.out.println(s);
        }

        HashSet<String> s1 = new LinkedHashSet<String>();
        s1.add("aa");
        for(String ss: s1){
            System.out.println(s1);
        }

        HashSet, LinkedHashSet, TreeSet
        - All 3 implement set interface
        - Hence all do not allow duplicate
        - All are not threadsafe
        TreeSet maintains sorting order or elements.
        HashSet does not maintain insertion order
        LinkedHashSet maintains insertion Order

        TreeSet<String> ss = new TreeSet<String>();
        ss.add("niki");
        ss.add("aa");
        ss.add("ele");
        for(String s : ss){
            System.out.println(s);
        }

        LinkedHashSet<String> sss = new LinkedHashSet<String>();
        sss.add("niki");
        sss.add("aa");
        sss.add("ele");
        for(String s : sss){
            System.out.println(s);
        }


        LinkedHashMap and HashMap
        - LinkedHashMap extends HashMap and implements Map
        -LinkedHashMap maintains order of Insertion based on key
        - Cannot change the order. If you change a value of a key
          lhm.put(key, newValue). The order will remain the same

        HashSet and ArrayList
        - HashSet does not allow duplicate , ArrayList does
        - Both allow null
        - HashSet implements set interface, ArrayList implements List interface . Traverse both using a iterator

          Set s = new HashSet();
          List s = New ArrayList();
          List s = new LinkedList();

        - HashSet does not maintain insertion order, ArrayList does like TreeSet, but TreeSet does not allow duplicate
          because all list (ArrayList, Linked List maintain order of insertion)
          sets does maintain order of insertion (Linkedhashset does)
        - ArrayList is indexed collection , you cad do .get(index) to retrieve a object. HashSet is a object based. Tt does .contains(object).
          Lookup in ArrayList is O(n) as it iterated through entire list .
          HashSet lookup is O(1) as it implements HashMap. .contains() internally implements .containsKey(object)
        - Both are not thread safe and not used for multi threading. You can synchronize the using Collections.synchroinzedCollection()
         to make it read only

        Therefore only HashTable is thread safe

        */





    }
}