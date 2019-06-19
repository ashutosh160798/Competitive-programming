import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class D11_subdomain_visit_count {

    public static List<String> subdomainVisits(String[] cpdomains) {

        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String str = cpdomains[i];
            int count = Integer.parseInt(str.substring(0,str.indexOf(" ")));
            str = str.substring(str.indexOf(" ")+1);
            while(str.indexOf(".")!=-1){
                map.put(str,map.getOrDefault(str,0)+count);
                str = str.substring(str.indexOf(".")+1);
            }
            map.put(str,map.getOrDefault(str,0)+count);
            str = str.substring(str.indexOf(".")+1);
        }
        List<String> ans = new ArrayList<>();
        for(String str : map.keySet()){
            ans.add(map.get(str)+" "+str);
        }
        return ans;
    }

    //Don't make any changes here
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] cpd = new String[n];
        for (int i = 0; i < cpd.length; i++) {
            cpd[i] = s.nextLine();
        }
        List<String> ans = subdomainVisits(cpd);
        Collections.sort(ans);
        System.out.println(ans);
    }

}