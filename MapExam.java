import java.util.HashMap;
import java.util.Map;

public class MapExam {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name","최윤성");
        map.put("eamil","hhhhpopome12@naver.com");
        map.put("dept","데이터분석과");

        System.out.println("-----------------------------");

        System.out.println("name:"+map.get("name"));
        System.out.println("email:"+map.get("eamil"));
        System.out.println("dept:"+map.get("dept"));

        System.out.println("------------------------------");
    }
}
