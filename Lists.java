import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(7);
        System.out.println(values.get(1));
        values.remove(0);
        System.out.println(values);
        values.add(7);
        values.add(6);
        System.out.println(values);
        System.out.println(values.indexOf(7));
        Collections.sort(values);
        System.out.println(values);
    }
}
