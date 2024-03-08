package day55_Week11_Review;

import java.util.*;

public class C07_CollectionsPractice {
    public static void main(String[] args) {
        List<String > items=new ArrayList<>();
        items.add("shoes");
        items.add("toys");
        System.out.println("items = " + items);


        Collections.addAll(items,"tshirt","hats");

        System.out.println("items = " + items);

        String[] arr=items.toArray(new String[0]);
        //Collections.sort(arr);

        Collections.sort(items);
        System.out.println("items = " + items);

        System.out.println("----------------------");

        HashSet<Integer> integerHashSet=new LinkedHashSet<>();
        integerHashSet.add(2);
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);

        System.out.println("integerHashSet = " + integerHashSet);

        integerHashSet.addAll(Arrays.asList(7,8,0,5));
        System.out.println("integerHashSet = " + integerHashSet);

        //Collections.sort(integerHashSet);

        ArrayList<Integer> arrayList=new ArrayList<>(integerHashSet);
        Collections.sort(arrayList);
        System.out.println("arrayList = " + arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());

        System.out.println("arrayList = " + arrayList);

        System.out.println("Collections.max(arrayList) = " + Collections.max(arrayList));
        System.out.println("Collections.min(arrayList) = " + Collections.min(arrayList));

        Set<Integer> set=new HashSet<>();// no duplicates, no index --- random order
        set.add(4);
        set.add(5);
        set.add(4);
        set.add(12);
        set.add(34);
        set.add(-12);
        set.add(9);

        System.out.println("set = " + set);

        System.out.println("Collections.max(set) = " + Collections.max(set));

        System.out.println("Collections.min(set) = " + Collections.min(set));


    }
}
