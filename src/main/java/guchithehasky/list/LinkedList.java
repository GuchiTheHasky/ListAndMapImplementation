package guchithehasky.list;

import java.util.Objects;
import java.util.StringJoiner;

public class LinkedList <T> implements List<T>{
    private Node<T> first;
    private Node<T> last;
    private int size;


    @Override
    public void add(T element) {
        add(element, size);
    }

    @Override
    public void add(T element, int index) {
        if (index < 0 && index > size - 1){
            throw new IndexOutOfBoundsException("Index out of bound.");
        }
        Node<T> node = new Node<>(element);
        if (first == null){
            first = last = node;
        }
        else if (index == 0){
            node.next = first;
            first = node;
        }
        else if (index == size - 1){
            last.next = node;
            last = node;
        }
        else {
            Node<T> current = getNodeByIndex(index - 1);
            node.next = current.next;
            current.next = node;
        }
        size++;
    }

    @Override
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement;
        if (index == 0){
            removedElement = first.element;
            first = first.next;
            if (first == null){
                last = null;
            }
        }else {
            Node<T> previous = getNodeByIndex(index - 1);
            removedElement = previous.next.element;
            previous.next = previous.next.next;
            if (index == size - 1){
                last = previous;
            }
        }
        size--;
        return removedElement;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return getNodeByIndex(index).element;
    }

    @Override
    public void set(T element, int index) {
        Objects.checkIndex(index, size);
        Node<T> node = getNodeByIndex(index);
        node.element = element;
    }

    @Override
    public void clear() {
        size = 0;
        first = last = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    @Override
    public int indexOf(T element) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(element)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T element) {
        Node<T> current = first;
        for (int i = 0; i < size; i++) {
            if (current.getElement().equals(element) && i == size - 1 ||
                current.getElement().equals(element) && !current.next.getElement().equals(element)
                ){
                return i;
            }
            current = current.next;
        }
        return -1;
    }
    @Override
    public String toString(){
        StringJoiner joiner = new StringJoiner("," , "{", "}");
        Node<T> current = first;
        while (current != null){
            joiner.add((CharSequence) current);
            current = current.next;
        }
        return joiner.toString();
    }

    private Node<T> getNodeByIndex(int index){
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    static class Node<T>{
        T element;
        Node<T> next;
        Node<T> previous;
        public Node(T element){
            this.element = element;
        }
        public Node(T element, Node<T> next, Node<T> previous){
            this.element = element;
            this.next = next;
            this.previous = previous;
        }

        public Node<T> getPrevious() {
            return previous;
        }

        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
