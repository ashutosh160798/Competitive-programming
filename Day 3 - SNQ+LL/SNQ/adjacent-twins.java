import java.util.*;
 
 public class Main {
 	 public static void removeAdjTwins(String s) {
 	     
 	     Stack <Character> st = new Stack<>();
 	     String ans ="";
 	     for(int i=0;i<s.length();i++){
 	         if(!st.empty()&&st.peek()==s.charAt(i)){
 	             st.pop();
 	         }
 	         else{
 	             st.push(s.charAt(i));
 	         }
 	     }
 	     
 	     while(!st.empty()){
 	         ans = st.pop()+ans;
 	     }
 	     System.out.print(ans);
 	     
 	     
 	     
 	 }
 
 
 	 //Dont make changes here
 	 public static void main(String[] args) {
 	 	 // TODO Auto-generated method stub
 	 	 Scanner sc=new Scanner(System.in);
 	 	 String s = sc.next();
 	 	 removeAdjTwins(s);
 	 }
 
 }
