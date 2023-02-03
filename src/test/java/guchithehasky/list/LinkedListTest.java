package guchithehasky.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {

    @DisplayName("Test, add elements and check size.")
    @Test
    public void addAndCheckSize(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Gimli");
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");

        assertEquals(5, list.size());
    }

    @DisplayName("Test, add first element and check size.")
    @Test
    public void addFirstElementAndCheckSize(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");

        list.add("Gimli", 0);
        assertEquals("Gimli", list.get(0));
        assertEquals(5, list.size());
    }

    @DisplayName("Test, add last element and check size.")
    @Test
    public void addMiddleElementAndCheckSize(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");

        list.add("Gimli", 2);
        assertEquals("Gimli", list.get(2));
        assertEquals(5, list.size());
    }

    @DisplayName("Test, remove first element and check size.")
    @Test
    public void removeFirstElementAndCheckSize(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        list.remove(0);

        assertEquals("Gandalf", list.get(0));
        assertEquals(4, list.size());
    }

    @DisplayName("Test, remove last element and check size.")
    @Test
    public void removeLastElementAndCheckSize(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        list.remove(4);

        assertEquals("Frodo", list.get(3));
        assertEquals(4, list.size());
    }

    @DisplayName("Test, remove middle element and check size.")
    @Test
    public void removeMiddleElementAndCheckSize(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        list.remove(2);

        assertEquals("Frodo", list.get(2));
        assertEquals(4, list.size());
    }

    @DisplayName("Test, get first element.")
    @Test
    public void getFirstElement(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        assertEquals("Legolas", list.get(0));
    }

    @DisplayName("Test, get last element.")
    @Test
    public void getLastElement(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        assertEquals("Gimli", list.get(4));
    }

    @DisplayName("Test, get middle element.")
    @Test
    public void getMiddleElement(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        assertEquals("Aragorn", list.get(2));
    }
    @DisplayName("Test, set first element.")
    @Test
    public void setFirstElement(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        list.set("Pippin", 0);
        assertEquals("Pippin", list.get(0));
    }
    @DisplayName("Test, set last element.")
    @Test
    public void setLastElement(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        list.set("Pippin", 4);
        assertEquals("Pippin", list.get(4));
    }

    @DisplayName("Test, set middle element.")
    @Test
    public void setMiddleElement(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        list.set("Pippin", 2);
        assertEquals("Pippin", list.get(2));
    }

    @DisplayName("Test, clear LinkedList.")
    @Test
    public void clear(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Legolas");
        list.add("Gandalf");
        list.add("Aragorn");
        list.add("Frodo");
        list.add("Gimli");

        list.clear();
        assertEquals(0, list.size());
    }
    @DisplayName("Test, is empty List true.")
    @Test
    public void isEmptyTrue(){
        LinkedList<String> list = new LinkedList<>();
        Assertions.assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @DisplayName("Test, is empty List false.")
    @Test
    public void isEmptyFalse(){
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
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
        LinkedList<String> list = new LinkedList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertFalse(list.contains("Pippin"));
    }

    @DisplayName("Test, first index of.")
    @Test
    public void indexOf(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Percival");
        list.add("Percival");
        list.add("Severus");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertEquals(0, list.indexOf("Albus"));
        assertEquals(1, list.indexOf("Percival"));
        assertEquals(4, list.indexOf("Severus"));
        assertEquals(7, list.indexOf("Dumbledore"));
    }

    @DisplayName("Test, last index of.")
    @Test
    public void lastIndexOf(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Albus");
        list.add("Percival");
        list.add("Percival");
        list.add("Percival");
        list.add("Severus");
        list.add("Severus");
        list.add("Brian");
        list.add("Dumbledore");

        assertEquals(0, list.lastIndexOf("Albus"));
        assertEquals(3, list.lastIndexOf("Percival"));
        assertEquals(5, list.lastIndexOf("Severus"));
        assertEquals(7, list.lastIndexOf("Dumbledore"));
    }



}
