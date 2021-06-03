## concept_of_the_day
### 1) How to reverse a string in java?
Code : 

1.1. using StringBuffer 

```java
        StringBuffer sbf = new StringBuffer("MyJava");
        System.out.println(sbf.reverse());    //Output : avaJyM
```

1.2. Using iterative method
```java	    
    String str = "MyJava";
    char[] strArray = str.toCharArray();
    for (int i = strArray.length - 1; i >= 0; i--)
    {
        System.out.print(strArray[i]);     //Output : avaJyM
    }
```

1.3. Using recursive method.
```java	    
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
```
All in 1
```java
    public class ReverseTheString
    {
        public static void main(String[] args)
        {
            String str = "MyJava";
            //1. Using StringBuffer Class
            StringBuffer sbf = new StringBuffer(str);
            System.out.println(sbf.reverse());    //Output : avaJyM
            //2. Using iterative method
            char[] strArray = str.toCharArray();
            for (int i = strArray.length - 1; i >= 0; i--)
            {
                System.out.print(strArray[i]);    //Output : avaJyM
            }
            System.out.println();
            //3. Using Recursive Method
            System.out.println(recursiveMethod(str));    //Output : avaJyM
        }
        //Recursive method to reverse string
        static String recursiveMethod(String str)
        {
             if ((null == str) || (str.length() <= 1))
             {
                    return str;
             }
             return recursiveMethod(str.substring(1)) + str.charAt(0);
        }
    }
```
---
### 2. Pyramid -- skipped
---

### 3. How do you remove all white spaces from a string in java?

code : 
```java
    import java.util.Scanner;
    public class RemoveWhiteSpaces 
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter input string to be cleaned from white spaces...!");
            
            String inputString = sc.nextLine();
            
            String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
            
            System.out.println("Input String : "+inputString);
            
            System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
            
            sc.close();
        }
    }
```
Without Using Built-In Methods?
```java
	import java.util.Scanner;
    public class RemoveWhiteSpaces 
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter input string to be cleaned from white spaces...!");
            
            String inputString = sc.nextLine();
            
            char[] charArray = inputString.toCharArray();
            
            String stringWithoutSpaces = "";
            
            for (int i = 0; i < charArray.length; i++) 
            {
                if ( (charArray[i] != ' ') && (charArray[i] != '\t') )
                {
                    stringWithoutSpaces = stringWithoutSpaces + charArray[i];
                }
            }
            
            System.out.println("Input String : "+inputString);
            
            System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
            
            sc.close();
        }
    }
```
---

### 4. How to find duplicate characters in a string in java?

code :

```java
class DuplicateCharactersInString
{
    static void duplicateCharCount(String inputString)
    {
        //Creating a HashMap containing char as key and it's occurrences as value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();
        //checking each char of strArray
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
        //Getting a Set containing all keys of charCountMap
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters In "+inputString);
        //Iterating through Set 'charsInString'
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }
    public static void main(String[] args)
    {
       duplicateCharCount("JavaJ2EE");
       duplicateCharCount("Fresh Fish");
       duplicateCharCount("Better Butter");
    }
}
```
---

### 5. How do you check the equality of two arrays in java?
5.1) Iterative Method :
```java
    public class EqualityOfTwoArrays
    {
        public static void main(String[] args)
        {    
            int[] arrayOne = {2, 5, 1, 7, 4};
            
            int[] arrayTwo = {2, 5, 1, 7, 4};
            
            boolean equalOrNot = true;
            
            if(arrayOne.length == arrayTwo.length)
            {
                for (int i = 0; i < arrayOne.length; i++)
                {
                    if(arrayOne[i] != arrayTwo[i])
                    {
                        equalOrNot = false;
                    }
                }
            }
            else
            {
                equalOrNot = false;
            }
            
            if (equalOrNot)
            {
                System.out.println("Two Arrays Are Equal");
            }
            else
            {
                System.out.println("Two Arrays Are Not equal");
            }
        }
    }
```

5.2) Using Arrays.equals() Method : (same order)
```java
	class EqualityOfTwoArrays
    {
        public static void main(String[] args)
        {
            String[] s1 = {"java", "j2ee", "struts", "hibernate"};
            String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
            String[] s3 = {"java", "j2ee", "struts", "hibernate"};
            System.out.println(Arrays.equals(s1, s2));        //Output : false
            System.out.println(Arrays.equals(s1, s3));      //Output : true
        }
    }
```

(diff order)
```java
	class EqualityOfTwoArrays
    {
        public static void main(String[] args)
        {
            String[] s1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
            String[] s2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
            Arrays.sort(s1);
            Arrays.sort(s2);
            System.out.println(Arrays.equals(s1, s2));       //Output : true
        }
    }
```
	
5.3) Using Arrays.deepEquals() Method :

```java
    public class EqualityOfTwoArrays
    {
        public static void main(String[] args)
        {    
            String[][] s1 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
            String[][] s2 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };
            System.out.println(Arrays.deepEquals(s1, s2));     //Output : true
            
            //Calling equals() method on same arrays will return false
            
            System.out.println(Arrays.equals(s1, s2));        //Output : false
            
            //That's why use deepEquals() method to compare multidimensional arrays
        }
    }
```
---

### 6) Anagram program in java

code : 

6.1.Anagram Program In Java Using sort() and equals() Methods
```java
	public class AnagramProgram
    {
        static void isAnagram(String s1, String s2)
        {
            //Removing all white spaces from s1 and s2
            String copyOfs1 = s1.replaceAll("\\s", "");
            String copyOfs2 = s2.replaceAll("\\s", "");
            //Initially setting status as true
            boolean status = true;
            if(copyOfs1.length() != copyOfs2.length())
            {
                //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
                status = false;
            }
            else
            {
                //Changing the case of characters of both copyOfs1 and copyOfs2 and converting them to char array
                char[] s1Array = copyOfs1.toLowerCase().toCharArray();
                char[] s2Array = copyOfs2.toLowerCase().toCharArray();
                //Sorting both s1Array and s2Array
                Arrays.sort(s1Array);
                Arrays.sort(s2Array);
                //Checking whether s1Array and s2Array are equal
                status = Arrays.equals(s1Array, s2Array);
            }
            //Output
            if(status)
            {
                System.out.println(s1+" and "+s2+" are anagrams");
            }
            else
            {
                System.out.println(s1+" and "+s2+" are not anagrams");
            }
        }
        public static void main(String[] args)
        {
            isAnagram("Mother In Law", "Hitler Woman");
            isAnagram("keEp", "peeK");
            isAnagram("SiLeNt CAT", "LisTen AcT");
            isAnagram("Debit Card", "Bad Credit");
            isAnagram("School MASTER", "The ClassROOM");
            isAnagram("DORMITORY", "Dirty Room");
            isAnagram("ASTRONOMERS", "NO MORE STARS");
            isAnagram("Toss", "Shot");
            isAnagram("joy", "enjoy");
        }
    }
```

6.2. Anagram Program In Java Using Iterative Method
```java
	public class AnagramProgram
    {
        static void isAnagram(String s1, String s2)
        {
            //Removing white spaces from s1 and s2 and changing case to lower
            String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
            String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
            //Initially setting status as true
            boolean status = true;
            if(copyOfs1.length() != copyOfs2.length())
            {
                //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
                status = false;
            }
            else
            {
                //Converting copyOfs1 to char array
                char[] s1ToArray = copyOfs1.toCharArray();
                //Checking whether each character of s1ToArray is present in copyOfs2
                for (char c : s1ToArray)
                {
                    int index = copyOfs2.indexOf(c);
                    if(index != -1)
                    {
                        //If character is present in copyOfs2, removing that char from copyOfs2
                        copyOfs2 = copyOfs2.substring(0, index)+copyOfs2.substring(index+1, copyOfs2.length());
                    }
                    else
                    {
                        //If character is not present in copyOfs2, setting status as false and breaking the loop
                        status = false;
                        break;
                    }
                }
            }
            //Output
            if(status)
            {
                System.out.println(s1+" and "+s2+" are anagrams");
            }
            else
            {
                System.out.println(s1+" and "+s2+" are not anagrams");
            }
        }
        public static void main(String[] args)
        {
            isAnagram("Mother In Law", "Hitler Woman");
            isAnagram("keEp", "peeK");
            isAnagram("SiLeNt CAT", "LisTen AcT");
            isAnagram("Debit Card", "Bad Credit");
            isAnagram("School MASTER", "The ClassROOM");
            isAnagram("DORMITORY", "Dirty Room");
            isAnagram("ASTRONOMERS", "NO MORE STARS");
            isAnagram("Toss", "Shot");
            isAnagram("joy", "enjoy");
        }
    }
```

6.3. Anagram Program In Java Using StringBuilder
```java
	public class AnagramProgram
    {
        static void isAnagram(String s1, String s2)
        {
            //Removing white spaces from s1 and s2 and converting case to lower
            String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
            String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
            //Initially setting status as true
            boolean status = true;
            if(copyOfs1.length() != copyOfs2.length())
            {
                //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
                status = false;
            }
            else
            {
                //Converting copyOfs1 to char array
                char[] s1Array = copyOfs1.toCharArray();
                //Constructing StringBuilder from copyOfs2
                StringBuilder sb = new StringBuilder(copyOfs2);
                //Checking whether each character of s1Array is present in sb
                for (char c : s1Array)
                {
                    int index = sb.indexOf(""+c);
                    if (index != -1)
                    {
                        //If present, removing that character from sb
                        sb = sb.deleteCharAt(index);
                    }
                    else
                    {
                        //If not present, setting status as false and breaking the loop
                        status = false;
                        break;
                    }
                }
            }
            //Output
            if(status)
            {
                System.out.println(s1+" and "+s2+" are anagrams");
            }
            else
            {
                System.out.println(s1+" and "+s2+" are not anagrams");
            }
        }
        public static void main(String[] args)
        {
            isAnagram("Mother In Law", "Hitler Woman");
            isAnagram("keEp", "peeK");
            isAnagram("SiLeNt CAT", "LisTen AcT");
            isAnagram("Debit Card", "Bad Credit");
            isAnagram("School MASTER", "The ClassROOM");
            isAnagram("DORMITORY", "Dirty Room");
            isAnagram("ASTRONOMERS", "NO MORE STARS");
            isAnagram("Toss", "Shot");
            isAnagram("joy", "enjoy");
        }
    }
```
	
6.4. Anagram Program In Java Using HashMap
```java
	public class AnagramProgram
    {
        static void isAnagram(String s1, String s2)
        {
            //Removing white spaces from s1 and s2 and converting case to lower case
            String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
            String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
            //Initially setting status as true
            boolean status = true;
            if(copyOfs1.length() != copyOfs2.length())
            {
                //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length
                status = false;
            }
            else
            {
                //Constructing a map containing character as a key and character occurrences as a value
                HashMap<Character, Integer> map = new HashMap<Character, Integer>();
                for (int i = 0; i < copyOfs1.length(); i++)
                {
                    //Getting char from copyOfs1
                    char charAsKey = copyOfs1.charAt(i);
                    //Initializing char count to 0
                    int charCountAsValue = 0;
                    //Checking whether map contains this char
                    if(map.containsKey(charAsKey))
                    {
                        //If contains, retrieving it's count
                        charCountAsValue = map.get(charAsKey);
                    }
                    //Putting char and it's count to map with pre-incrementing char count
                    map.put(charAsKey, ++charCountAsValue);
                    //Getting char from copyOfs2
                    charAsKey = copyOfs2.charAt(i);
                    //Initializing char count to 0
                    charCountAsValue = 0;
                    //Checking whether map contains this char
                    if(map.containsKey(charAsKey))
                    {
                        //If contains, retrieving it's count
                        charCountAsValue = map.get(charAsKey);
                    }
                    //Putting char and it's count to map with pre-decrementing char count
                    map.put(charAsKey, --charCountAsValue);
                }
                //Checking each character and it's count
                for (int value : map.values())
                {
                    if(value != 0)
                    {
                        //If character count is not equal to 0, then setting status as false
                        status = false;
                    }
                }
            }
            //Output
            if(status)
            {
                System.out.println(s1+" and "+s2+" are anagrams");
            }
            else
            {
                System.out.println(s1+" and "+s2+" are not anagrams");
            }
        }
        public static void main(String[] args)
        {
            isAnagram("Mother In Law", "Hitler Woman");
            isAnagram("keEp", "peeK");
            isAnagram("SiLeNt CAT", "LisTen AcT");
            isAnagram("Debit Card", "Bad Credit");
            isAnagram("School MASTER", "The ClassROOM");
            isAnagram("DORMITORY", "Dirty Room");
            isAnagram("ASTRONOMERS", "NO MORE STARS");
            isAnagram("Toss", "Shot");
            isAnagram("joy", "enjoy");
        }
    }
```
---

### 7.Armstrong number program in java

code : 

```java
public class MainClass
{
	static void checkArmstrongNumber(int number)
	{
		int copyOfNumber = number;

		int noOfDigits = String.valueOf(number).length();

		int sum = 0;

		while (copyOfNumber != 0)
		{
			int lastDigit = copyOfNumber % 10;

			int lastDigitToThePowerOfNoOfDigits = 1;

			for(int i = 0; i < noOfDigits; i++)
			{
				lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
			}

			sum = sum + lastDigitToThePowerOfNoOfDigits;

			copyOfNumber = copyOfNumber / 10;
		}

		if (sum == number)
		{
			System.out.println(number+" is an armstrong number");
		}
		else
		{
			System.out.println(number+" is not an armstrong number");
		}
	}

    public static void main(String[] args)
    {
        checkArmstrongNumber(153);

        checkArmstrongNumber(371);

        checkArmstrongNumber(9474);

        checkArmstrongNumber(54748);

        checkArmstrongNumber(407);

        checkArmstrongNumber(1674);
    }
}
```
---

### 8) How to find duplicate elements in an array?

code : 

8.1 Using Brute Force method
```java
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

8.2 Using Sorting
```java
	private static void findDuplicatesUsingSorting(int[] inputArray)
	{
	Arrays.sort(inputArray);
		
	for (int i = 0; i < inputArray.length-1; i++)
	{
		if(inputArray[i] == inputArray[i+1])
		{
			System.out.println("Duplicate Element :" + inputArray[i]);
		}
	}
	}
```

8.3 Using HashSet
```java
	private static void findDuplicatesUsingHashSet(int[] inputArray)
	{
	HashSet<Integer> set = new HashSet<Integer>();
		
	for (int element : inputArray) 
	{
		if( ! set.add(element))
		{
			System.out.println("Duplicate Element : "+element);
		}
	}
	}
```

8.4 Using HashMap
```java
	private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
            
        for (int element : inputArray) 
        {    
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }
            
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
            
        for (Entry<Integer, Integer> entry : entrySet) 
        {                
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
```

8.5 Using Java 8 Streams
```java
    private static void findDuplicatesUsingJava8(int[] inputArray) 
    {    
        Set<Integer> uniqueElements = new HashSet<>();
            
        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                                                .filter(i -> !uniqueElements.add(i))
                                                .boxed()
                                                .collect(Collectors.toSet());
            
        System.out.println(duplicateElements);
    }
```

All in 1 : 
```java
	public class DuplicatesInArray 
	{
    //Method 1 : Brute Force Method
    
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
    
    //Method 2 : Sorting Method
    
    private static void findDuplicatesUsingSorting(int[] inputArray)
    {
        Arrays.sort(inputArray);
        
        for (int i = 0; i < inputArray.length-1; i++)
        {
            if(inputArray[i] == inputArray[i+1])
            {
                System.out.println("Duplicate Element : " + inputArray[i]);
            }
        }
    }
    
    //Method 3 : Using HashSet
    
    private static void findDuplicatesUsingHashSet(int[] inputArray)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int element : inputArray) 
        {
            if( ! set.add(element))
            {
                System.out.println("Duplicate Element : "+element);
            }
        }
    }
    
    //Method 4 : Using HashMap
    
    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int element : inputArray) 
        {    
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }
        
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        
        for (Entry<Integer, Integer> entry : entrySet) 
        {                
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
    
    //Method 5 : Using Java 8 Streams
    
    private static void findDuplicatesUsingJava8(int[] inputArray) 
    {    
        Set<Integer> uniqueElements = new HashSet<>();
        
        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                                                .filter(i -> !uniqueElements.add(i))
                                                .boxed()
                                                .collect(Collectors.toSet());
        
        System.out.println(duplicateElements);
    }
    
    public static void main(String[] args) 
    {
        int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
    
        System.out.println("======Duplicates Using Brute Force======");
        
        findDuplicatesUsingBruteForce(inputArray);
        
        System.out.println("======Duplicates Using Sorting======");
        
        findDuplicatesUsingSorting(inputArray);
        
        System.out.println("======Duplicates Using HashSet======");
        
        findDuplicatesUsingHashSet(inputArray);
        System.out.println("======Duplicates Using HashMap======");
        
        findDuplicatesUsingHashMap(inputArray);
        
        System.out.println("======Duplicates Using Java 8 Streams======");
        
        findDuplicatesUsingJava8(inputArray);
    }
	}
```
---

### 9. How to find sum of all digits of a number in java?

code : 

9.1 Iterative method
```java
    public class MainClass
    {
        static void sumOfAllDigits(int inputNumber)
        {
            //Creating a copy of input number
            int copyOfInputNumber = inputNumber;
            //Initializing sum to 0
            int sum = 0;
            while (copyOfInputNumber != 0)
            {
                //Getting last digit of the input number
                int lastDigit = copyOfInputNumber%10;
                //Adding last digit to sum
                sum = sum + lastDigit;
                //Removing last digit from the input number
                copyOfInputNumber = copyOfInputNumber/10;
            }
            //Printing sum
            System.out.println("Sum Of All Digits In "+inputNumber+" = "+sum);
        }
        public static void main(String[] args)
        {
            sumOfAllDigits(47862);
            sumOfAllDigits(416872);
            sumOfAllDigits(5674283);
            sumOfAllDigits(475496215);
        }
    }
```

9.2 Recursive method
```java
    public class MainClass
    {
        //Initializing sum to 0
        int sum = 0;
        //Recursive function to calculate sum of all digits of a number
        int sumOfAllDigits(int inputNumber)
        {
            if(inputNumber == 0)
            {
                //if input number is 0, returning sum
                return sum;
            }
            else
            {
                //Getting last digit of input number
                int lastDigit = inputNumber%10;
                //Adding last digit to sum
                sum = sum + lastDigit;
                //Removing last digit from input number
                inputNumber = inputNumber/10;
                //Calling the function recursively
                sumOfAllDigits(inputNumber);
            }
            return sum;
        }
        public static void main(String[] args)
        {
            MainClass mainClass = new MainClass();
            System.out.println(mainClass.sumOfAllDigits(416872));
        }
    }
```
---

### 10) How to find second largest number in an integer array?

code : 
```java
    public class MainClass
    {
        static int secondLargest(int[] input)
        {
            int firstLargest, secondLargest;
            //Checking first two elements of input array
            if(input[0] > input[1])
            {
                //If first element is greater than second element
                firstLargest = input[0];
                secondLargest = input[1];
            }
            else
            {
                //If second element is greater than first element
                firstLargest = input[1];
                secondLargest = input[0];
            }
            //Checking remaining elements of input array
            for (int i = 2; i < input.length; i++)
            {
                if(input[i] > firstLargest)
                {
                    //If element at 'i' is greater than 'firstLargest'
                    secondLargest = firstLargest;
                    firstLargest = input[i];
                }
                else if (input[i] < firstLargest && input[i] > secondLargest)
                {
                    //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
                    secondLargest = input[i];
                }
            }
            return secondLargest;
        }
        public static void main(String[] args)
        {
            System.out.println(secondLargest(new int[] {45, 51, 28, 75, 49, 42}));
            System.out.println(secondLargest(new int[] {985, 521, 975, 831, 479, 861}));
            System.out.println(secondLargest(new int[] {9459, 9575, 5692, 1305, 1942, 9012}));
            System.out.println(secondLargest(new int[] {47498, 14526, 74562, 42681, 75283, 45796}));
        }
    }
```
---

	