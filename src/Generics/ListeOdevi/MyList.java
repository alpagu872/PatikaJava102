package Generics.ListeOdevi;

public class MyList<T> {

    Object[] list;
    private int count = 0;
    private int endIdx = count;


    public MyList() {
        this.list = (T[]) new Object[10];
    }

    public MyList(int capacity) {
        this.list = (T[]) new Object[capacity];
    }

    public int size() {
        return count;
    }

    public int getCapacity() {
        return list.length;
    }

    public void add(T data) {
        if (list.length <= count) {
            Object[] tempList = (T[]) new Object[2 * list.length];
            for (int i = 0; i < list.length; i++) {
                tempList[i] = list[i];
            }
            list = tempList;
        }
        list[endIdx--] = data;
        count++;
    }

    public T get(int index) {
        return (T) list[index];
    }

    public void remove(int index) {
        if (index < 0 || list.length <= index)
            return;


        Object[] tempList = (T[]) new Object[getCapacity()];

        for (int i = 0; i < list.length; i++) {
            if (i == index) continue;
            if (index < i) tempList[i - 1] = list[i];
            else tempList[i] = list[i];

        }
        list = tempList;
        count--;
        endIdx--;
    }

    public void set(int index, T data) {
        if (index < 0 || list.length <= index) return;
        list[index] = data;
    }


}
