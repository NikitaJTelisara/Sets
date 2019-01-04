package Sets;

import sun.awt.windows.ThemeReader;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: NT030798
 * Date: 1/4/19
 * Time: 4:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class EnumerationMain {
    public static void main(String[] args){
        Hashtable<Integer, String> table = new Hashtable();
        table.put(1, "abc");
        table.put(2, "def");
        table.put(3, "ghi");

        //Enumeration is used to iterate Hashtable, Vector and Stack
        // Enumeration has 2 methods   : hasMoreElements(), nextElements(), (Does not have remove like the iterator
        // Enumeration enumeration = table.elements(); // in iterator it is .iterator()
        //  Fail-safe . No safe
        Enumeration enumeration = table.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        Vector<String> v = new Vector<String>();
        v.add("niki");
        v.add("bik");
        v.add("llll");

        Enumeration ee = v.elements();
        while (ee.hasMoreElements()){
            System.out.println(ee.nextElement());
        }
    }
}
