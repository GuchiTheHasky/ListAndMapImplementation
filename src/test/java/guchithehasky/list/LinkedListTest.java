package guchithehasky.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class LinkedListTest {

    @Test
    public void insert(){
        LinkedListFirst list = new LinkedListFirst();
        list.insert(list, 123);
        list.insert(list, 321);
        list.insert(list, 888);

        ArrayList<Integer> listInt = list.getAllValues(list);
        int result = listInt.get(2);

        assertEquals(888, result);
    }

    @Test
    public void deleteByIndex(){
        LinkedListFirst list = new LinkedListFirst();
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 8);

        list.deleteAtPosition(list, 2);
        ArrayList<Integer> listInt = list.getAllValues(list);
        int result = 0;
        for (int i = 0; i < listInt.size(); i++){
            result += listInt.get(i);
        }
        assertEquals(5, result);
    }

    @Test
    public void deleteByIndexTwo(){
        LinkedListFirst list = new LinkedListFirst();
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 8);

        list.deleteAtPosition(list, 2);
        ArrayList<Integer> listInt = list.getAllValues(list);
        int result = listInt.size();

        assertEquals(2, result);

    }

    @Test
    public void deleteByValue(){
        LinkedListFirst list = new LinkedListFirst();
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 8);

        list.deleteByValue(list, 2);

        ArrayList<Integer> listInt = list.getAllValues(list);
        int result = listInt.get(0);
        assertEquals(3, result);
    }


}
