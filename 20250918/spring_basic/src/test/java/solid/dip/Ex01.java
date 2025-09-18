package solid.dip;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        //java.util.List -> ArrayList, LinkedList // List
        List<String> items = new ArrayList<>();
        //LinkedList<String> items = new LinkedList<>(); // List
        items.add("사과");
        items.add("오렌지");

        process(items);

    }

    private static void process(List<String> items) {
        items.forEach(System.out::println);

        if (items instanceof ArrayList) {
            ArrayList<String> items2 = (ArrayList) items;

        }
    }

}
