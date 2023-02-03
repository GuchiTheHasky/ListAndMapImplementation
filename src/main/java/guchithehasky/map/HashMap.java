package guchithehasky.map;

public class HashMap<K, V> {
    public static final int ARRAY_SIZE = 16;
    private Node<K, V>[] nodeList = new Node[ARRAY_SIZE];

    private long getHashCode(K key) {
        String keyString = key.toString();
        return keyString.hashCode();
    }

    private int getIndex(long hashCode){
        return Math.toIntExact(hashCode % ARRAY_SIZE); //
    }

    public void put(K key, V value){
        long hashCode = this.getHashCode(key);
        int index = this.getIndex(hashCode);
        if (index > ARRAY_SIZE){
            throw new IndexOutOfBoundsException("Error, invalid key.");
        }
        if (this.nodeList[index] != null){
            Node<K, V> existingNode = this.nodeList[index];
            while (existingNode.getNext() != null){
                existingNode = existingNode.getNext();
            }
            Node<K, V> newNode = new Node<>();
            newNode.setKey(key);
            newNode.setValue(value);
            newNode.setHashCode(hashCode);

            existingNode.setNext(newNode);
        }
        else {
            Node<K, V> newNode = new Node<>();
            newNode.setKey(key);
            newNode.setValue(value);
            newNode.setHashCode(hashCode);
            this.nodeList[index] = newNode;
        }

    }

    public void printHashMap(){
        System.out.println("Map: ");
        int index = 0;
        while (index < ARRAY_SIZE){
            Node<K, V> node = this.nodeList[index];
            if (node != null){
                int listIndex = 0;
                while (node != null){

                    System.out.print(node.getKey().toString() + " -> ");
                    System.out.println(node.getValue().toString());
                    node = node.getNext();
                    listIndex++;
                }
                System.out.println();
            }
            index++;
        }
    }

    public V get(K key){

        int index = 0;
        while (index < ARRAY_SIZE){
            Node<K, V> node = this.nodeList[index];
            if (node != null){
                int listIndex = 0;
                while (node != null){
                    if (node.getKey().toString().equals(key.toString())){
                        return node.getValue();
                    }
                    node = node.getNext();
                    listIndex++;
                }
            }
            index++;
        }
        return null;
    }

    public K getFirst(V value){
        int index = 0;
        while (index < ARRAY_SIZE){
            Node<K, V> node = this.nodeList[index];
            if (node != null){
                int listIndex = 0;
                while (node != null){
                    if (node.getValue().toString().equals(value.toString())){
                        return node.getKey();
                    }
                    node = node.getNext();
                    listIndex++;
                }
            }
            index++;
        }
        return null;
    }

    public K getLast(V value){
        int index = 0;
        K keyOne = null;
        while (index < ARRAY_SIZE){
            Node<K, V> node = this.nodeList[index];
            if (node != null){
                int listIndex = 0;
                while (node != null){
                    if (node.getValue().toString().equals(value.toString())){
                        keyOne = node.getKey();
                    }
                    node = node.getNext();
                    listIndex++;
                }
            }
            index++;
        }
        return keyOne;
    }

    public K getByValueAndId(V value, int id){
        int index = 0;
        int counter = 0;
        K keyOne = null;
        while (index < ARRAY_SIZE){
            Node<K, V> node = this.nodeList[index];
            if (node != null){
                int listIndex = 0;
                while (node != null){
                    if (node.getValue().toString().equals(value.toString())){
                        keyOne = node.getKey();
                        counter++;
                    }

                    if (id == counter){
                        return keyOne;
                    }
                    node = node.getNext();
                    listIndex++;
                }
            }
            index++;
        }
        return keyOne;
    }

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(11, "Guchi");
        map.put(22, "Dog");
        map.put(44, "Dog");
        map.put(55, "Dog");
        map.put(66, "Dog");
        map.put(77, "Dog");
        map.put(88, "Car");

        System.out.println(map.getByValueAndId("Dog", 1));

    }











}

