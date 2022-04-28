import java.util.LinkedList;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("최윤성");
        list.add("김현수");
        list.add("황빈");
        list.add("한재원");
        list.add("한민우");

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 :" + list.get(i));
        }
    }
}
