import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class D8_find_duplicate_in_system {
    // -----------------------------------------------------
    // This is a functional problem. Only this function has to be written.
    // This function takes as input the head of the linked list.
    // It should return the head of the modified list.

    public static ArrayList<ArrayList<String>> findDuplicate(String[] paths) {

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        LinkedHashMap<String,ArrayList<String>> map = new LinkedHashMap<>();
        for (String path : paths) {
            String[] arr = path.split(" ");
            for(int i=1;i<arr.length;i++){
                String s=arr[i];
                String key = s.substring(s.indexOf("(")+1,s.indexOf(")"));
                if(map.containsKey(key)){
                    ArrayList<String> arrayList = map.get(key);
                    arrayList.add(arr[0]+"/"+s.substring(0,s.indexOf("(")));
                    map.put(key,arrayList);
                }else{
                    ArrayList<String> arrayList =new ArrayList<>();
                    arrayList.add(arr[0]+"/"+s.substring(0,s.indexOf("(")));
                    map.put(key,arrayList);
                }
            }
        }
        ArrayList<String> keySorted = new ArrayList<>(map.keySet());
        Collections.sort(keySorted);
        for(String key: keySorted){
            ans.add(map.get(key));
        }
        return ans;

    }

    // -----------------------------------------------------

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] paths = new String[n];

        for (int i = 0; i < n; i++) {
            paths[i] = br.readLine();
        }
        ArrayList<ArrayList<String>> ans = findDuplicate(paths);
        for (ArrayList<String> val : ans) {
            Collections.sort(val);
        }

        for (ArrayList<String> val : ans) {
            System.out.println(val);
        }
    }
}