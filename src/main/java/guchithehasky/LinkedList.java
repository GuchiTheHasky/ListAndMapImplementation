package guchithehasky;

public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data)
    {
        Node newNode = new Node(data);
        newNode.next = null;
        if (list.head == null) {
            list.head = newNode;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("\nLinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public static LinkedList deleteByValue(LinkedList list, int value) {
        Node currNode = list.head, prev = null;
        if (currNode != null && currNode.data == value) {
            list.head = currNode.next;
            System.out.println(value + " found and deleted");
            return list;
        }
        while (currNode != null && currNode.data != value) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(value + " found and deleted");
        }
        if (currNode == null) {
            System.out.println(value + " not found");
        }
        return list;
    }

    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node currNode = list.head, prev = null;
        if (index == 0 && currNode != null) {
            list.head = currNode.next;
            System.out.println(
                    index + " position element deleted");
            return list;
        }

        int counter = 0;

        while (currNode != null) {
            if (counter == index) {
                prev.next = currNode.next;
                System.out.println(
                        index + " position element deleted");
                break;
            }
            else {
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        if (currNode == null) {
            System.out.println(
                    index + " position element not found");
        }
        return list;
    }

}
