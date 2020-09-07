import java.util.ArrayList;
import java.util.List;

public class ArrayExample {

    public static void main(String[] args) {
        //
        String[] strArray = new String[15];
        for (int i = 0; i < 15; i++) {
            strArray[i] = "String" + i;
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(strArray[i]);
        }

        List<String> list = new ArrayList<>();
        list.add("String 1");
        list.get(0);
    }
}
