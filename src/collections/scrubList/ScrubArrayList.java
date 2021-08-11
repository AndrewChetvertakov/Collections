package collections.scrubList;

import java.util.*;
//implements List<E>
public class ScrubArrayList<E> {

//    private static final int DEFAULT_CAPACITY = 10;
public static void main(String[] args) {

    Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4));


    List<Integer> list = new ArrayList<>(set);
    int[] something = new int[100];

    int a = 10;
    int b = 5;
    System.out.println((a = b) != 0);



    int[] something2 = {1,2,3,4,5,6,7,8,9,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    int[] somethingdsa =                 {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
}

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements = new Object[DEFAULT_CAPACITY];

    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private static final Object[] EMPTY_ELEMENTDATA = {};

    private int size;

    public ScrubArrayList(int defaultCapacity){
        if(defaultCapacity > 0){
            this.elements = new Object[defaultCapacity];
        }else if(defaultCapacity==0){this.elements= EMPTY_ELEMENTDATA;
        }else{
            throw new IllegalArgumentException("Wrong data: " +defaultCapacity);
        }
    }

    public ScrubArrayList(){
        this.elements = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    public void ArrayList(Collection<? extends E> c) {
    elements = c.toArray();
    if((size = elements.length) !=0 ){
        if(elements.getClass() != Object[].class){
            elements = Arrays.copyOf(elements, size, Object[].class);
        }
    }else{
        this.elements = EMPTY_ELEMENTDATA;
    }

    }




    public int size() {
        return size;
    }


    public boolean isEmpty() {

        return size==0;
    }


    public boolean contains(Object o) {
//        come back for size vs length
        for (int i = 0; i < elements.length; i++) {
         if(o.equals(elements[i])) return true;
        }
        return false;
    }


    public Iterator<E> iterator() {
        return null;
    }


    public Object[] toArray() {
        return elements;
    }


    public <T> T[] toArray(T[] a) {
        return null;
    }


    public boolean add(E e) {
        char[] pew ={'a', 'b', 'c', 'd', 0};

        return false;
    }


    public boolean remove(Object o) {
        return false;
    }


    public boolean containsAll(Collection<?> c) {
        return false;
    }


    public boolean addAll(Collection<? extends E> c) {
        return false;
    }


    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }


    public boolean removeAll(Collection<?> c) {
        return false;
    }


    public boolean retainAll(Collection<?> c) {
        return false;
    }


    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }


    public E get(int index) {
        return null;
    }


    public E set(int index, E element) {
        return null;
    }


    public void add(int index, E element) {

    }


    public E remove(int index) {
        return null;
    }


    public int indexOf(Object o) {
        return 0;
    }


    public int lastIndexOf(Object o) {
        return 0;
    }


    public ListIterator<E> listIterator() {
        return null;
    }


    public ListIterator<E> listIterator(int index) {
        return null;
    }


    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }





}
