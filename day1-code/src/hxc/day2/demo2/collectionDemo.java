package hxc.day2.demo2;

import java.util.ArrayList;
import java.util.Collection;

public class collectionDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("4343");
        coll.add("34343");
        Integer site = coll.size();
        System.out.println(coll);
        System.out.println(site);
    }
}
