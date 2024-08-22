package SS_11.BTVN.EX04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println("Danh sách trước khi sắp xếp: "+ list);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        // In danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp: " + list);



    }
}
