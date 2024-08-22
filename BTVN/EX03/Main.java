package SS_11.BTVN.EX03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Bước 1: Tạo sẵn một chuỗi là một câu hoặc đoạn văn
Bạn sẽ tạo một chuỗi chứa câu hoặc đoạn văn cần xử lý.*/

        String string ="Than em vua trang la vua tron anh a";
        System.out.println(string);
        /*Bước 2: Chuyển đổi từng từ trong chuỗi đó thành các phần tử trong danh sách*/
        List<String> list = new ArrayList<String>(Arrays.asList(string.split(" ")));
        System.out.println(list);
        List<String> newList=new ArrayList<>();
        int minLengthWord=list.get(0).length();
        for(String s:list){
            if(s.length()<minLengthWord){
                minLengthWord=s.length();
                newList.clear();
                newList.add(s);
            }else if(s.length()==minLengthWord){
                newList.add(s);
            }
        }
        System.out.println("mang chứa có độ dài ngắn nhất: "+newList);
        // bonus
        System.out.println("Các từ có độ dài ngắn nhất:");
        for (String word : newList) {
            System.out.println(word);
        }

    }
}
