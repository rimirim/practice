package Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Test> test = new HashMap<>();

        test.put(1, new Test());
        // key값 2에 new Test() 객체가 저장
        test.put(2, new Test());
        test.put(3, new Test());

        System.out.println(test);

        test.remove(2);

        System.out.println("remove() 이후: " + test);

        test.put(3, new Test());

        // get()을 통해 특정 key값의 내용물을 가져올 수 있다.
        System.out.println("put() 이후 test.get(3): " + test.get(3));
        
        for (Map.Entry<Integer, Test> t: test.entrySet()) {
            // getKey()는 key 값을 획득
            Integer key = t.getKey();
            // getValue()는 말 그대로 value 값을 획득
            Test value = t.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
