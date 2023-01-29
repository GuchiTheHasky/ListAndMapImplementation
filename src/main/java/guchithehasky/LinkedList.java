package guchithehasky;

public class LinkedList<T> implements LinkList {

    private Node<T> firstElement;
    private Node<T> lastElement;
    private int size;

    public LinkedList(){
        lastElement = new Node<>(null, firstElement, null);
        firstElement = new Node<T>(null, null, lastElement);
    }

    @Override
    public void addInEnd(Object type) {
        Node<T> previous = lastElement;
        lastElement.setCurrentElement((T) type);
        lastElement = new Node<>(null, previous, null);
        previous.setNextElement(lastElement);
        size++;
    }

    @Override
    public void addInStart(Object type) {
        Node<T> next = firstElement;
        firstElement.setCurrentElement((T)type);
        firstElement = new Node<>(null, null, next);
        next.setPreviousElement(firstElement);
        size++;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        Node<T> temp = firstElement.getNextElement();
        for (int i = 0; i < index; i++) { //size
            temp = getNext(temp);
        }
        return temp;
    }
    private Node<T> getNext(Node<T> node){
        return node.getNextElement(); //??
    }


    private class Node<T> {
        private T currentElement;
        private Node<T> previousElement;
        private Node<T> nextElement;

        private Node(T currentElement, Node<T> previousElement, Node<T> nextElement){
            this.currentElement = currentElement;
            this.previousElement = previousElement;
            this.nextElement = nextElement;
        }

        public T getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(T currentElement) {
            this.currentElement = currentElement;
        }

        public Node<T> getPreviousElement() {
            return previousElement;
        }

        public void setPreviousElement(Node<T> previousElement) {
            this.previousElement = previousElement;
        }

        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }
    }
}
