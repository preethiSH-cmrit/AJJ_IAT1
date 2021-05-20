
package ajj.iat1;
import java.util.*;

public class arrayListAverage {
    
    public arrayListAverage() {
           ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(10); list.add(20); list.add(30);
        list.add(40);
        list.add(50);
        double sum = 0;
        for (int i : list)
            {
            sum += i;
            }
        double average = sum / list.size();
        System.out.println("Average = " + average);
        }

}
