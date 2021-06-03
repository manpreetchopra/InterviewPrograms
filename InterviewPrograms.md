# <center>Interview Programs(javaconceptoftheday)</center>

### 1) Java Program To Reverse A String
Solution : 
```Java
package com.java.programs;

/**
 * Java program to reverse a string
 * @author macho
 *
 */
public class ReverseString_1 {

	public static void main(String[] args) {
		String str = "MyJava";
		System.out.println(reverseUsingStringBuffer(str));
		System.out.println(iterativeMethod(str));
		System.out.println(recursiveMethod(str));
	}
	
	/*
	 * Using StringBuffer's inbuilt method
	 */
	public static String reverseUsingStringBuffer(String str) {
		StringBuffer sbf= new StringBuffer(str);
		sbf.reverse();
		return sbf.toString();
	}

	/*
	 * Using Iterative approach
	 */
	public static String iterativeMethod(String str) {

		String reversed = new String();
		for(int i = str.length()-1;i>=0;i--) {
			reversed+=str.charAt(i);
		}

		return reversed;
	}

	/*
	 * Using Recursive approach
	 */
	public static String recursiveMethod(String str) {
		if(str==null || str.length()<=1) {
			return str;
		}

		return recursiveMethod(str.substring(1))+str.charAt(0);
	}
}

```

### 2) Remove White Spaces from String
Solution : 
```Java
package com.java.programs;

import java.util.Scanner;

/**
 * Java Program To Remove White Spaces From String 
 * @author macho
 *
 */
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pease enter a sting : ");
		String inputString = sc.nextLine();
		System.out.println(usingInbuiltMethods(inputString));
		System.out.println(withoutInbuiltMethods(inputString));
	}

	
	public static String usingInbuiltMethods (String str) {
		return (str.replaceAll("\\s+", ""));
	}

	public static String withoutInbuiltMethods(String str) {
		String cleanedStr = new String();

		char[] charArray = str.toCharArray();

		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]!=' ' && charArray[i]!='\t') {
				cleanedStr+=charArray[i];
			}
		}
		return cleanedStr; 
	}

}
```


```Java
private static void findDuplicatesUsingBruteForce(int[] inputArray)
	{
	for (int i = 0; i < inputArray.length; i++) 
	{
		for (int j = i+1; j < inputArray.length; j++) 
		{
			if(inputArray[i] == inputArray[j])
			{
				System.out.println("Duplicate Element : "+inputArray[i]);
			}
		}
	}
	}
```