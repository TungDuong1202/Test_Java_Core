import java.util.ArrayList;
import java.util.List;


public class Main {

    public static List<String> processStrings(List<String> list){
        List<String> resultList = new ArrayList<>();
        for (String element : list){
            if (element.contains("@")){
                int lastAtIndex = element.lastIndexOf("@");
                //Lấy chuỗi trước kí tự @ cuối cùng
                String beforeAt = element.substring(0, lastAtIndex);
                //Xóa các kí tự @
                beforeAt = beforeAt.replace("@","");
                String processed = beforeAt + "@...";
                resultList.add(processed);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaCore");
        list.add("List");
        list.add("ArrayList");
        list.add("tran.the.dung@vsi-international.com");
        list.add("dungtt@gmail.com");
        list.add("d@ung@vsi-international.com");
        list.add("VietSoftw@re@vsi-international.com");
        list.add("@@@gmail.com");
        List<String> result = processStrings(list);
        for (String element : result){
            System.out.println(element);
        }
    }
}