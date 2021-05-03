package pl.rjug.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Piotrek");
        names.add(0, "Asia");
        names.set(0, "Adrian");
        names.remove("Adrian");

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String name : names) {
            names.remove(name);
        }

        System.out.println(names);
    }
}
