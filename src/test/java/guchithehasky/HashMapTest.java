package guchithehasky;

import guchithehasky.map.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapTest {
    @Test
    public void put(){
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Guchi");
        map.put(2, "Dog");
        map.put(3, "Hasky");
        String result = map.get(2);
        assertEquals("Dog", result);
    }

    @Test
    public void getFirstKey(){
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Guchi");
        map.put(2, "Dog");
        map.put(4, "Dog");
        map.put(3, "Hasky");
        int result = map.getFirst("Dog");
        assertEquals(2, result);
    }

    @Test
    public void getLastKey(){
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Guchi");
        map.put(2, "Dog");
        map.put(55, "Dog");
        map.put(4, "Dog");
        map.put(3, "Hasky");
        int result = map.getLast("Dog");
        assertEquals(4, result);
    }

    @Test
    public void getByValueAndId(){
        HashMap<Integer, String> map = new HashMap();
        map.put(1, "Guchi");
        map.put(2, "Dog");
        map.put(3, "Dog");
        map.put(4, "Dog");
        map.put(5, "Dog");
        map.put(6, "Dog");
        map.put(7, "Dog");
        map.put(8, "Hasky");

        int result = map.getByValueAndId("Dog", 4);
        assertEquals(5, result);
    }




}
