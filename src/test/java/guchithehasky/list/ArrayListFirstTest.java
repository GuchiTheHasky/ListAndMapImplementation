package guchithehasky.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListFirstTest {
    @Test
    public void add(){
        ArrayList<String> list = new ArrayList<>();
        list.add("S");
        list.add("O");
        list.add("S");
        assertEquals(3, list.size());
    }



    @Test
    public void addByIndex1(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("O");
        list.add("S");
        list.add("First", 0);
        assertEquals("First", list.get(0));
    }

    @Test
    public void addByIndex2(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("O");
        list.add("Last");
        list.add("First", 0);
        assertEquals("Last", list.get(list.size() - 1));
    }

    @Test
    public void remove1(){
        ArrayList<String> list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");
        list.remove(0);
        assertEquals("Element", list.get(0));
    }

    @Test
    public void remove2(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");
        list.remove(0);
        assertEquals(2, list.size());
    }

    @Test
    public void get(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");
        assertEquals("Element", list.get(1));
    }

    @Test
    public void set(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");
        list.set("First", 0);
        assertEquals("First", list.get(0));
    }

    @Test
    public void clear(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");

        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    public void size(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");

        assertEquals(3, list.size());
    }

    @Test
    public void isEmptyTrue(){
        ArrayList list = new ArrayList<>();

        assertEquals(true, list.isEmpty());
    }

    @Test
    public void isEmptyFalse(){
        ArrayList list = new ArrayList<>();
        list.add("False");
        assertEquals(false, list.isEmpty());
    }

    @Test
    public void containsTrue(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");

        assertEquals(true, list.contains("Element"));
    }

    @Test
    public void containsFalse(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");

        assertEquals(false, list.contains("False"));
    }

    @Test
    public void indexOf(){
        ArrayList list = new ArrayList<>();
        list.add("S");
        list.add("Element");
        list.add("S");

        assertEquals(0, list.indexOf("S"));
    }

    @Test
    public void lastIndexOf(){
        ArrayList list = new ArrayList<>();
        list.add("Car");
        list.add("Element");
        list.add("Car");

        assertEquals(2, list.lastIndexOf("Car"));
    }

}
