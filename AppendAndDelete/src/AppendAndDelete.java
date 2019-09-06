import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
	You have a string of lowercase English alphabetic letters. 
	You can perform two types of operations on the string:

	Append a lowercase English alphabetic letter to the end of the string.
	Delete the last character in the string. Performing this operation on an empty 
	string results in an empty string.
	
	Given an integer, k, and two strings, s and t, determine whether or not you can 
	convert s to t by performing exactly  of the above operations on s. 
	If it's possible, print Yes. Otherwise, print No.
*/

class AppendAndDelete{
	public static void main(String[] args) {
		// Append and Delete
		String a = "zzzz";
		String b = "zzzzzzz";
	
		System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
		System.out.println(appendAndDelete("aba", "aba", 7));
		System.out.println(appendAndDelete("ashley", "ash", 3));
	
		System.out.println(appendAndDelete(a, b, 4));
		

	}
	
	public static String appendAndDelete(String s, String t, int k) {
		String re = "No";
		if(s.equals(t)) {
			if(s.length() + t.length() + 1 == k) {
				re = "Yes";
			}
			
		}else {
			int minLength = Math.min(s.length(), t.length());
			String sub = "";
			
			for(int i = 0; i < minLength; i++){
				if(s.charAt(i) != t.charAt(i)) {
					sub = s.substring(0, i);
					break;
				}
				if(i + 1 == minLength) {
					sub = s.substring(0, minLength);
				}
			}
			
			System.out.println(sub);
			int a = s.length() - sub.length();
			int b = t.length() - sub.length();
			
			System.out.println(a);
			System.out.println(b);
			
			
			if(a + b <= k) re = "Yes";
		}
		
		
		return re;
	}
}