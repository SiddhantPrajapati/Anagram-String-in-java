//find strings are anagram or not
import java.util.*; 
   import java.util.Scanner;
public class AnagramString {  
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :");
		String s1 = sc.nextLine();
		System.out.println("Enter Second String :");
		String s2 = sc.nextLine();
		int [] ar1 = new int [s1.length()];
		int [] ar2 = new int [s2.length()];
		if(s1.length() != s2.length()) {
			System.out.println("Strings are not Anagram.");
		}
		else {
		String x = s1.toLowerCase();
		String y = s2.toLowerCase();
		for(int i = 0 ; i < x.length() ; i++ ) {
			ar1[i] = (int)x.charAt(i);
		}
		for(int i = 0 ; i < x.length() ; i++ ) {
			ar2[i] = (int)y.charAt(i);
		}
		int no = 0;
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for(int i = 0 ; i < x.length() ; i++) {
			if(ar1[i] == ar2[i]) {
				no++;
			}
		}	
		if(no == x.length()) {
			System.out.println("Strings are Anagram.");
		}
		else {
			System.out.println("Strings are not Anagram.");
		}
		}
    }
}  