package arraylist.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListSorting {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();

        a.add(1);
        a.add(3);
        a.add(5);

        b.add(2);
        b.add(6);
        b.add(8);

        merge(a, b);
    }

    static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        List<Integer> mergedList = Stream.of(a, b)
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        Set<Integer> sortedList = new TreeSet<>(mergedList);

        System.out.println("A " + sortedList);

        System.out.println("B " + b);
    }
}