import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String a = Cat.printName(7);
        System.out.println(a);
        Cat cat = new Cat();
        cat.voice("barsik");
//        cat.name = "murzik";
        System.out.println(cat);

        System.out.println(cat.name);
        // Создание и заполнение HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(2); // Дубликат
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(3); // Дубликат

        System.out.println("HashSet: " + hashSet);

        // Создание и заполнение LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(2); // Дубликат
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(3); // Дубликат

        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Создание и заполнение TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(2); // Дубликат
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3); // Дубликат

        System.out.println("TreeSet: " + treeSet);
    }
}
