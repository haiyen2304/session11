package SS_11.BTVN.EX01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
/*     Tạo List ngẫu nhiên
       Bạn sẽ cần tạo một danh sách các số nguyên (Integer) có tối đa 10 phần tử. Các phần tử này sẽ được tạo ra ngẫu nhiên.*/
        List<Integer> list =new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(100));
        }
        /*Bước 2: In danh sách
Sau khi tạo ra danh sách, bạn sẽ in nó ra để kiểm tra xem danh sách đã được tạo đúng hay chưa.*/
        System.out.println(list);
        /*Bước 3: Tìm phần tử lớn nhất
Sử dụng phương thức Collections.max() để tìm và in ra phần tử có giá trị lớn nhất trong danh sách.*/
        int numberMax= Collections.max(list);
        System.out.println("so lon nhat la : "+numberMax);
        Collections.reverse(list);
        System.out.println("Danh sasch sau khi bi dao nguoc "+list);
        Collections.sort(list);
        System.out.println("Danh sách sau khi sắp xếp: "+list);

        List<Integer> list2 =new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list2.add(rand.nextInt(100));
        }
        System.out.println("list 2: "+list2);
        list.addAll(list2);
        System.out.println("sau khi add : "+list);

    }
}
