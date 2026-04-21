package clg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class collection {
    public static void main(String[] args) throws IndexOutOfBoundsException{
//        List<Integer> arr = new ArrayList<>();

        List<Integer> arr = new LinkedList<>();

        arr.add(12);
        arr.add(88);
        arr.add(34);
        arr.add(76);
        arr.add(15);
        arr.add(33);

        System.out.println(arr.indexOf(12));
        arr.set(4, 24);
        System.out.println(arr.get(4));

        System.out.println(arr.contains(54));

        arr.remove(3);
        System.out.println(arr.get(3));

        System.out.println(arr.size());

        arr.addFirst(12);
        arr.addLast(3);

        for(int a: arr){
            System.out.println(a);
        }
    }
}

