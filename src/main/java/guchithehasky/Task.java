//package guchithehasky;
//
//import java.util.StringJoiner;
//
//public class Task implements List{
//    private Object[] objects;
//    private int size;
//
//    public Task(){
//        this.objects = new Object[10];
//    }
//
//    @Override
//    public void add(Object value){
//        add(value, size);
//    }
//    @Override
//    public void add(Object value, int index){
//        if (index > size - 1 || index < 0){
//            throw new IndexOutOfBoundsException("Error, wrong index");
//        }
//        else if (size == objects.length){
//            upListSize();
//        }
//        for (int i = size; i > index; i--){   //??
//            objects[i] = objects[i - 1];
//        }
//        objects[index] = value;
//        size++;
//    }
//    @Override
//    public void delete(int index){ //!!!
//        if (index > size - 1 || index < 0){
//            throw new IndexOutOfBoundsException("Error, wrong index");
//        }
//        for (int i = index; i < objects.length - 1 /*size - 1*/; i++){
//            objects[i] = objects[i + 1];
//        }
//        size--;
//    }
//    @Override
//    public Object get(int index){
//        if (index > size - 1 || index < 0){
//            throw new IndexOutOfBoundsException("Error, wrong index");
//        }
//        return objects[index];
//    }
//    @Override
//    public Object set(Object obj, int index){
//        if (index > size - 1 || index < 0){
//            throw new IndexOutOfBoundsException("Error, wrong index");
//        }
//        return objects[index] = obj;
//    }
//    @Override
//    public void clear(){
//        for (int i = 0; i < size; i++) {
//            objects[i] = null;
//        }
//        size = 0;
//    }
//    @Override
//    public int size(){
//        return size;
//    }
//    @Override
//    public boolean isEmpty(){
//        return size == 0;
//    }
//    @Override
//    public boolean contains(Object obj){ //+++
//        return indexOf(obj) != -1;
//    }
//    @Override
//    public int indexOf(Object obj){ // !!!ереї можуть бути нали
//        for (int i = 0; i < size; i++) {
//            if (objects[i].equals(obj)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    @Override
//    public int lastIndexOf(Object obj){
//        for (int i = size - 1; i >= 0; i--) {
//            if (objects[i].equals(obj)){
//                return i;
//            }
//        }
//        return -1;
//    }
//    @Override
//    public String toString(){
//        StringJoiner joiner = new StringJoiner("," , "{", "}");
//        for (int i = 0; i < size; i++) {
//            joiner.add(objects[i].toString());
//        }
//        return joiner.toString();
//    }
//
//    private void upListSize(){
//        Object[] tempObjects = new Object[objects.length * 2];
//        for (int i = 0; i < objects.length; i++) {
//            tempObjects[i] = objects.length;
//        }
//        objects = tempObjects;
//    }
//
//
//
//
//
//}
