package studyJava0707;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class lebo {
    public static void main(String[] args){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("lee", 30);
        map.put("kim", 22);
        map.put("park", 25);

        System.out.println("Map : " + map);



        System.out.println("Lee의 나이"+map.get("lee"));

        // Iterator 사용 1 - keySet()
        Iterator<String> keys = map.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println("KEY : " + key); // Key2 , Key1, Key4, Key3, Key5
        }


        List<String> keyList = map.keySet()
                .stream()
                .collect(Collectors.toList());

        List<Object> valueList = map.values()
                .stream()
                .collect(Collectors.toList());

        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);




    }
}
