import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class leetcode_49{

    public static void main(String[] args){

        String str = "sfafgaer";
        char [] chararr = str.toCharArray();
        List<Integer> list = new ArrayList<>();
        list.addAll((Arrays.asList(6,6,7,3,3,4,6,7,7,45,9)));
        String str1 = new String(chararr);
        System.out.println("str1 :" + str1);
        Collections.reverse(list);
        System.out.println(list);

        Deque<Integer> dq = new LinkedList<Integer>();
        dq.addFirst(1);
        dq.addLast(2);
        System.out.println(dq);
        int first = dq.removeFirst();
        System.out.println( "dq:" + dq);
        int last = dq.removeLast();
        

        Deque<String> dq1 = new LinkedList<String>();
        dq1.addLast("For");
        dq1.addLast("Geeks");
        dq1.addFirst("Geeks1");
 

        System.out.println("dq1:" + dq1);
            
        


      
        
        
    }


}