import java.util.*;

class D13_arr_intersection2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] nums2 = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = scn.nextInt();
        }
        int[] res = intersect(nums1, nums2);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }

    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input 2 arrays and m, n as lengths.
    // It should return required output.
    public static int[] intersect(int[] arr1, int[] arr2) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set2.add(arr2[i]);
        }
        Iterator<Integer>itr=set1.iterator();
        while (itr.hasNext()){
            int a =itr.next();
            if(set2.contains(a)){
                ans.add(a);
            }
        }
        int[] arr = new int[ans.size()];

        for(int i = 0; i < ans.size(); i++) {
            if (ans.get(i) != null) {
                arr[i] = ans.get(i);
            }
        }
        return arr;
    }
}