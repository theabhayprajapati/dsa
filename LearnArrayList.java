import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> bolist = new ArrayList<>();
        ArrayList<String> srlist = new ArrayList<>();

        System.out.println(list);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            list.add(input.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println("Size of ArrayList: " + list.size());

        }
        System.out.println(list.size());
        System.out.println(list);
        ListMax(list);
    }
    // 5 4 3 2 1 0

    static int ListMax(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(max);
        Collections.swap(list, max, 2);
        System.out.println(list);
        return max;

    }

}