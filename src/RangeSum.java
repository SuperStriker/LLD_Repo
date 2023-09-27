import java.util.ArrayList;
import java.util.List;

public class RangeSum {
    static int[] st;
    public static void main(String[]  args){
        System.out.println("hello");
        int n = 6;
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        arr.add(2);
        arr.add(-2);
        arr.add(4);
        arr.add(5);

        st = new  int[4*n];

        int st_idx = 1;
        int start = 0, end = n-1;

        buildSegTree(st_idx,arr,start,end);
        System.out.println(st);
      
        System.out.println("Query is 0 index based");
        System.out.println("query 2,4 " + query(2,4,st_idx,start,end));
        System.out.println("query 1,4 " +query(1,4,st_idx,start,end));
        System.out.println("query 3,3 " +query(3,3,st_idx,start,end));

        
    }
static int query(int qs, int qe, int st_idx,int start, int end){
    if(qs > end || qe < start) return 0;
    if (start >= qs && end <= qe) return st[st_idx];

    int mid = start + (end - start)/2;
    int lsum = query(qs, qe, 2*st_idx, start, mid);
    int rsum = query(qs, qe, 2*st_idx+1,mid+1 , end);
    return lsum+rsum;
}
static void  buildSegTree(int st_idx,List<Integer> arr,int start, int end){
    if(start > end) return;
    if (start == end) {
        st[st_idx] = arr.get(start);
    }
    int mid = start + (end - start)/2;
    buildSegTree(2*st_idx, arr, start, mid);
    buildSegTree(2*st_idx+1, arr, mid+1, end);
    st[st_idx] = st[2*st_idx] + st[2*st_idx+1];


}
static void updateNode(int st_idx,int start, int end, int pos, int newValue){
    if(start > pos || end < pos) return ;
    if(start == end){
        st[st_idx] = newValue;
        return;
    }
    int mid = start + (end - start)/2;
    updateNode(2*st_idx, start, mid, pos, newValue);
    updateNode(2*st_idx+1, mid+1, end, pos, newValue);
    st[st_idx] = st[2*st_idx] + st[2*st_idx+1];
}
}
