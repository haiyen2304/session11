package SS_11.BTVN.EX06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RemoveDuplicates {
    public static void main(String[] args) {

        // Bước 1: Tạo danh sách chứa các số nguyên

        List<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(10));
        }
        System.out.println("Mang cac so nguyen"+list);

        // Bước 2: Tạo danh sách mới để chứa các phần tử không trùng lặp
        List<Integer>newList=new ArrayList<>();
        for(Integer number:list){
            if(!newList.contains(number)){ //contains : kiểm tra trùng lặp
                newList.add(number);
            }
        }
        System.out.println("Danh sách mới không chứa các phần tử trùng lặp: "+newList);




    }
}
