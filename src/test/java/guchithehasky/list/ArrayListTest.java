package guchithehasky.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @DisplayName("Test add some elements in list, check size.")
    @Test
    public void addElements(){
        ArrayList<String> list = new ArrayList<>();
        list.add("S");
        list.add("O");
        list.add("S");
        assertEquals(3, list.size());
    }

    @DisplayName("Test add an element under the first index, to the array with values.")
    @Test
    public void addElementInFirstIndex(){
        ArrayList<String> list = new ArrayList<>();
        list.add("W");
        list.add("O");
        list.add("W");
        list.add("S", 0);
        assertEquals("S", list.get(0));
        assertEquals(4, list.size());
    }
    @DisplayName("Test add an element in the middle of list.")
    @Test
    public void addElementByIndex(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Scooby");
        list.add("doo");
        list.add("dooby", 1);
        assertEquals("dooby", list.get(1));
    }


    @DisplayName("Test, remove first element from list.")
    @Test
    public void removeFirstElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Severus");
        list.add("Albus");
        list.add("Percival");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Dumbledore");
        list.remove(0);
        assertEquals("Albus", list.get(0));
    }

    @DisplayName("Test, remove last element from list.")
    @Test
    public void removeLastElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Dumbledore");
        list.add("Severus");
        list.remove(5);
        assertEquals("Dumbledore", list.get(4));
    }

    @DisplayName("Test, remove last element from list.")
    @Test
    public void removeMiddleElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Dumbledore");
        list.remove(2);
        assertEquals("Wulfric", list.get(2));
    }


    @DisplayName("Test, get first element from list.")
    @Test
    public void getFirstElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Dumbledore");
        assertEquals("Albus", list.get(0));
    }
    @DisplayName("Test, get last element from list.")
    @Test
    public void getLastElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Dumbledore");
        assertEquals("Dumbledore", list.get(4));
    }
    @DisplayName("Test, get middle element from list.")
    @Test
    public void getMiddleElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Dumbledore");
        assertEquals("Wulfric", list.get(2));
    }

    @DisplayName("Test, set first element in list.")
    @Test
    public void setFirstElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Harry");
        list.add("Percival");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Dumbledore");

        list.set("Albus", 0);
        assertEquals("Albus", list.get(0));
    }
    @DisplayName("Test, set last element in list.")
    @Test
    public void setLastElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Wulfric");
        list.add("Brian");
        list.add("Potter");

        list.set("Dumbledore", 4);
        assertEquals("Dumbledore", list.get(4));
    }
    @DisplayName("Test, set middle element in list.")
    @Test
    public void setMiddleElement(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        list.add("Wulfric", 2);
        assertEquals("Wulfric", list.get(2));
    }

    @DisplayName("Test, delete all elements, size == 0.")
    @Test
    public void clearAllElements(){
        ArrayList <String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        list.clear();
        assertEquals(0, list.size());
        Assertions.assertTrue(list.isEmpty());

    }

    @DisplayName("Test, size after add.")
    @Test
    public void checkSize(){
        ArrayList <String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertEquals(5, list.size());
    }

    @DisplayName("Test, is empty List true.")
    @Test
    public void isEmptyTrue(){
        ArrayList <String> list = new ArrayList<>();
        Assertions.assertTrue(list.isEmpty());
    }

    @DisplayName("Test, is empty List false.")
    @Test
    public void isEmptyFalse(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");
        Assertions.assertFalse(list.isEmpty());
    }

    @DisplayName("Test, is List contains element true.")
    @Test
    public void containsTrue(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertTrue(list.contains("Percival"));
    }

    @DisplayName("Test, is List contains element false.")
    @Test
    public void containsFalse(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertFalse(list.contains("Potter"));
    }

    @DisplayName("Test, get first index of.")
    @Test
    public void indexOf(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertEquals(0, list.indexOf("Albus"));
        assertEquals(1, list.indexOf("Percival"));
        assertEquals(5, list.indexOf("Dumbledore"));
    }

    @DisplayName("Test, get last index of.")
    @Test
    public void lastIndexOf(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertEquals(0, list.lastIndexOf("Albus"));
        assertEquals(2, list.lastIndexOf("Percival"));
        assertEquals(5, list.lastIndexOf("Dumbledore"));
    }

}
