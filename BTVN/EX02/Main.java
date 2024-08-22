package SS_11.BTVN.EX02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Bước 1: Tạo chuỗi có giá trị
Bạn sẽ tạo một chuỗi có giá trị là "Rikkei Academy để nông dân biết code".*/
        String string = "Rikkei Academy để nông dân biết code";


        /*Bước 2: Tạo danh sách (List) chứa các chuỗi
Bạn cần tạo một danh sách (List) trong Java để chứa các phần tử kiểu chuỗi (String).*/
        // List<String> listString = new ArrayList<String>();



        /*Bước 3: Chuyển đổi chuỗi thành mảng và gán vào danh sách
Bạn sẽ chuyển đổi chuỗi ở bước 1 thành các phần tử trong một mảng (Array) bằng cách sử dụng phương thức split() của chuỗi, sau đó thêm các phần tử này vào danh sách.*/
        String[] stringArray = string.split(" ");
// hoac         for (String s : stringArray) {
//            listString.add(s);
//        }
      //  listString.addAll(Arrays.asList(stringArray));
       List<String> listString = new ArrayList<String>(Arrays.asList(stringArray)); // truyền qua contractor
        List<String> listString2= Arrays.asList(stringArray);

        /*Bước 4: Duyệt danh sách và in ra các chuỗi có độ dài lớn hơn 3 ký tự
Cuối cùng, bạn sẽ duyệt qua danh sách và in ra những phần tử có độ dài lớn hơn 3 ký tự.*/
        for (String word : listString) {
            if(word.length()>3){
                System.out.println(word);
            }
        }
    }
}
