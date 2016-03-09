import java.io.*;
import java.util.*;
class TestClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String s[]=new String[n];
		for (int i = 0; i < n; i++) {
			s[i]=sc.next();
		}
		int ans=countAnagram(s);
		System.out.println(ans);
	}
	public static int countAnagram(String[] str){
		int anagramCount=0;
		Map<String, Integer> hm = new HashMap<String,Integer>();
		for (int i = 0; i < str.length; i++){
			int count=0;
			if (!hm.containsKey(sorted(str[i]))){
			    hm.put(sorted(str[i]), 1);
			}
			else	hm.put(sorted(str[i]), hm.get(sorted(str[i])) + 1);
		}
		for(String s: hm.keySet()){
			int temp=hm.get(s);
			if(anagramCount < temp){
				anagramCount = temp;
			}
		}
		return anagramCount;
	}
	public static String sorted(String s){
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return(new String(c));
	}
}
