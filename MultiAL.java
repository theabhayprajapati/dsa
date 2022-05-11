import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // intialize the list
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < list.size(); j++) {
                list.get(i).add(input.nextInt());
                
            }
        }

        System.out.println(list);
        System.out.println(list.get(1).get(2));
        

    }
    
}