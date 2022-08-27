import java.util.ArrayList;

public class ps1 {
    public void findoccurrence(int[] arr) {
        ArrayList<Integer> ds = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                ds.add(i);
            }
        }
        if (ds.size() == 0) {
            System.out.println("The element is not present");
        }
        System.out.println("The first occurrence is at index: " + ds.get(0));
        System.out.println("The last occurrence is at index: " + ds.get(ds.size() - 1));

    }
    public static void main(String[] args)
    {
        int[] arr={1,2,4,1,3,6,1};
        ps1 p=new ps1();
        p.findoccurrence(arr);
    }
}
