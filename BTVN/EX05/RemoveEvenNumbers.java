package SS_11.BTVN.EX05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println("ArrayList chứa các số nguyên"+list);
        /*Bước 3: Tạo một ArrayList mới để lưu những số nguyên không chia hết cho 2*/

        ArrayList<Integer> newList2 = new ArrayList<>();
        for(Integer i : list) {
            if(i%2==0){
                newList2.add(i);
            }
        }
        System.out.println("Danh sách ban đầu: " + list);
        System.out.println("Danh sách sau khi xóa số chẵn: " + newList2);

    }
}
