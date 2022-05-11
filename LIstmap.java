import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LIstmap {

    public static void main(String[] args) {

        List<Map<String, String>> lIst = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name","최윤성");
        map.put("email","hhhhpopome12@naver.com");
        map.put("addr","서울");
        map.put("dept","데이터분석과");

        lIst.add(map);

        map = new HashMap<>();

        map.put("name","도우너");
        map.put("email","douneo@naver.com");
        map.put("addr","서울 쌍문동");
        map.put("dept","깐따삐아성");

        lIst.add(map);

        map = null;

        int listsize= lIst.size();

        for(int i=0;i<listsize;i++) {

            Map rmap = lIst.get(i);
            System.out.println("name:"+rmap.get("name"));
            System.out.println("email:"+rmap.get("email"));
            System.out.println("addr:"+rmap.get("addr"));
            System.out.println("dept:"+rmap.get("dept"));
            System.out.println("-------------------------------");
        }
    }
}
