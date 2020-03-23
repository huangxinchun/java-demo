package hxc.day1.demo1;

import java.util.ArrayList;

/**
 * 四年多
 */
public class demoArray {
    public static void main(String[] args) {
        Person[] list = new Person[3];

        Person one = new Person("12121", 1);
        list[0] = one;
        System.out.println(list);

        //array_list
        ArrayList<Person> listArr = new ArrayList<>();
        listArr.add(one);
        System.out.println(listArr);
        for(int i = 0 ; i < listArr.size(); i++) {
            System.out.println(listArr.get(i).getName());
        }

    }
}
