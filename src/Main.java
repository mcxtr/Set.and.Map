
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer>  list = new ArrayList<>();


        Random random = new Random();
        int list2 = 0;

        for (int i = 0; i < 400; i++) {
           int a = random.nextInt(1,100);
           list.add(a);
           set.add(a);
            list2+=a;
        }

            int sum = 0;
            for (int num : set) {
                sum+= num;

            }
        System.out.println(list);
        System.out.println("list summa: "+list2);
        System.out.println(set);
        System.out.println("Hash set summa: "+sum);

    }
    }
