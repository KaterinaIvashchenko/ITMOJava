package MaxCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);

        int max = max(nums);

        System.out.println(max);
        
        List<Test> tests = new ArrayList<>();
        tests.add(new Test());
        tests.add(new Test());
        Test maxT = max(tests);
        
    }

    static <T extends Comparable<? super T>> T max(Collection<T> c) {
        T max = null;
        Iterator<T> iterator = c.iterator();
        if (iterator.hasNext()) max = iterator.next();

        while (iterator.hasNext()) {
            T tmp = iterator.next();
            if(max.compareTo(tmp) < 0) max = tmp;
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
