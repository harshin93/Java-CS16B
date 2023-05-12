import java.util.ArrayList;
import java.util.Comparator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<Integer>();

        numbers.add(9);
        numbers.add(8);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString());

        System.out.println(numbers.size());

        System.out.println(numbers.contains(Integer.valueOf(1)));

        numbers.forEach(number -> {
            System.out.println(number * 32);
        });

        numbers.forEach(number -> {
            numbers.set(numbers.indexOf(number), number * 2);
        });
        System.out.println(numbers.toString());


    }
    
}
