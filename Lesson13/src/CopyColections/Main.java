package CopyColections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Main {


    public static void main(String[] args) {

    }

    static <T, M extends T> void copy(Collection<M> t, Collection<M> m) {
        for (Iterator<M> i = m.iterator(); i.hasNext();) {
            M o = i.next();
            t.add(o);
        }
    }

    static void swap(List<?> list, int i, int j) {
        swapImpl(list, i, j);
    }

    static <T> void swapImpl(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    static <T extends Comparable<? super T>> T max(Collection<T> c) {
        T max = null;
        Iterator<T> iterator = c.iterator();
        if (iterator.hasNext()) max = iterator.next();

        while (iterator.hasNext()) {
            T tmp = iterator.next();
            if (max.compareTo(tmp) < 0) max = tmp;
        }
        return max;
    }

    static class Test implements Comparable<Object> {

        @Override
        public int compareTo(Object o) {

            return 1;
        }
    }
}
