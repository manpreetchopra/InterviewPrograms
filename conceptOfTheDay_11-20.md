## concept_of_the_day
### 11. How to perform matrix operations in java?

code : 
11.1 Creation Of Matrix In Java
```java
	public class MatrixCreation
	{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Rows");
        
        int row = sc.nextInt();
        
        System.out.println("Enter The Number Of Columns");
        
        int cols = sc.nextInt();
        
        //defining 2D array to hold matrix data
        
        int[][] matrix = new int[row][cols];
        
        System.out.println("Enter Matrix Data");
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Your Matrix is : ");
        
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            
            System.out.println();
        }
    }
	}
```

1.2 Matrix Addition In Java
```java
    import java.util.Scanner;
    public class MatrixAddition
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter The Number Of Rows");
            
            int row = sc.nextInt();
            
            System.out.println("Enter The Number Of Columns");
            
            int cols = sc.nextInt();
            
            int[][] matrix1 = new int[row][cols];
            
            int[][] matrix2 = new int[row][cols];
            
            int[][] sum = new int[row][cols];
            
            System.out.println("Enter The Data For First Matrix :");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Enter The Data For Second Matrix :");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("First Matrix = ");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    System.out.print(matrix1[i][j]+"\t");
                }
                
                System.out.println();
            }
            
            System.out.println("Second Matrix = ");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    System.out.print(matrix2[i][j]+"\t");
                }
                
                System.out.println();
            }
            
            System.out.println("Sum = ");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    
                    System.out.print(sum[i][j]+"\t");
                }
                
                System.out.println();
            }
        }
    }
```

1.3 Matrix Subtraction In Java :
```java
    import java.util.Scanner;
    public class MatrixSubtraction
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter The Number Of Rows");
            
            int row = sc.nextInt();
            
            System.out.println("Enter The Number Of Columns");
            
            int cols = sc.nextInt();
            
            int[][] matrix1 = new int[row][cols];
            
            int[][] matrix2 = new int[row][cols];
            
            int[][] sub = new int[row][cols];
            
            System.out.println("Enter The Data For First Matrix :");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Enter The Data For Second Matrix :");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("First Matrix = ");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    System.out.print(matrix1[i][j]+"\t");
                }
                
                System.out.println();
            }
            
            System.out.println("Second Matrix = ");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    System.out.print(matrix2[i][j]+"\t");
                }
                
                System.out.println();
            }
            
            System.out.println("Subtraction = ");
            
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    sub[i][j] = matrix1[i][j] - matrix2[i][j];
                    
                    System.out.print(sub[i][j]+"\t");
                }
                
                System.out.println();
            }
        }
    }
```

1.4 Matrix Multiplication In Java :
```java
    import java.util.Scanner;
    public class MatrixMultiplication
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter The Number Of Rows In First Matrix");
            
            int rowsInFirst = sc.nextInt();
            
            System.out.println("Enter The Number Of Columns In First Matrix / Rows In Second Matrix");
            
            int colsInFirstRowsInSecond = sc.nextInt();
            
            System.out.println("Enter The Number Of Columns In Second Matrix");
            
            int colsInSecond = sc.nextInt();
            
            int[][] matrix1 = new int[rowsInFirst][colsInFirstRowsInSecond];
            
            int[][] matrix2 = new int[colsInFirstRowsInSecond][colsInSecond];
            
            int[][] product = new int[rowsInFirst][colsInSecond];
            
            System.out.println("Enter The Data For First Matrix :");
            
            for (int i = 0; i < rowsInFirst; i++)
            {
                for (int j = 0; j < colsInFirstRowsInSecond; j++)
                {
                    matrix1[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Enter The Data For Second Matrix :");
            
            for (int i = 0; i < colsInFirstRowsInSecond; i++)
            {
                for (int j = 0; j < colsInSecond; j++)
                {
                    matrix2[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("First Matrix = ");
            
            for (int i = 0; i < rowsInFirst; i++)
            {
                for (int j = 0; j < colsInFirstRowsInSecond; j++)
                {
                    System.out.print(matrix1[i][j]+"\t");
                }
                
                System.out.println();
            }
            
            System.out.println("Second Matrix = ");
            
            for (int i = 0; i < colsInFirstRowsInSecond; i++)
            {
                for (int j = 0; j < colsInSecond; j++)
                {
                    System.out.print(matrix2[i][j]+"\t");
                }
                
                System.out.println();
            }
            
            System.out.println("Product = ");
            
            for (int i = 0; i < rowsInFirst; i++)
            {
                for (int j = 0; j < colsInSecond; j++)
                {
                    for (int k = 0; k < colsInFirstRowsInSecond; k++)
                    {
                        product[i][j] +=  matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            
            for (int i = 0; i < rowsInFirst; i++)
            {
                for (int j = 0; j < colsInSecond; j++)
                {
                    System.out.print(product[i][j]+"\t");
                }
                
                System.out.println();
            }
        }
    }
```

1.5 Transpose Of A Matrix
```java
    import java.util.Scanner;
    public class MatrixTranspose
    {
        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter The Number Of Rows");
            
            int rows = sc.nextInt();
            
            System.out.println("Enter The Number Of Columns");
            
            int cols = sc.nextInt();
            
            int[][] matrix = new int[rows][cols];
        
            int[][] transpose = new int[cols][rows];
            
            System.out.println("Enter The Data For Matrix :");
            
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    matrix[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Your Matrix is :");
            
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
                
                System.out.println();
            }
            
            System.out.println("Transpose of Matrix is :");
            
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    transpose[j][i] = matrix[i][j];
                }
            }
            
            for (int i = 0; i < cols; i++)
            {
                for (int j = 0; j < rows; j++)
                {
                    System.out.print(transpose[i][j]+"\t");
                }
                
                System.out.println();
            }
        }
    }
```
---

### 12. How to count occurrences of each character in a string in java?

code : 
```java
    class EachCharCountInString
    {
        static void characterCount(String inputString)
        {
            //Creating a HashMap containing char as a key and occurrences as  a value
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
            //Printing the charCountMap
            System.out.println(charCountMap);
        }
        public static void main(String[] args)
        {
           characterCount("Java J2EE Java JSP J2EE");
           characterCount("All Is Well");
           characterCount("Done And Gone");
        }
    }
```
---

### 13.  How to find largest number less than a given number and without a given digit?

code : 
```java
    public class LargestNumber
    {
        static int getLLessThanN(int number, int digit)
        {
            //Converting digit to char
            char c = Integer.toString(digit).charAt(0);
            //Decrementing number & checking whether it contains digit
            for (int i = number; i > 0; --i)
            {
                if(Integer.toString(i).indexOf(c) == -1)
                {
                    //If 'i' doesn't contain 'c'
                    return i;
                }
            }
            return -1;
        }
        public static void main(String[] args)
        {
            System.out.println(getLLessThanN(123, 2));
            System.out.println(getLLessThanN(4582, 5));
            System.out.println(getLLessThanN(98512, 5));
            System.out.println(getLLessThanN(548624, 8));
        }
    }
```
---

### 14. How to find all pairs of elements in an array whose sum is equal to given number?

code : 
```java
    public class PairsOfElementsInArray
    {
        static void findThePairs(int inputArray[], int inputNumber)
        {
            System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
            for (int i = 0; i < inputArray.length; i++)
            {
                for (int j = i+1; j < inputArray.length; j++)
                {
                    if(inputArray[i]+inputArray[j] == inputNumber)
                    {
                        System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                    }
                }
            }
        }
        public static void main(String[] args)
        {
            findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
            findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
            findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
            findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
        }
    }
```

Alternative  : 
```java
    public class PairsOfElementsInArray
    {
        static void findThePairs(int inputArray[], int inputNumber)
        {
            //Sorting the given array
            Arrays.sort(inputArray);
            System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
            //Initializing i to first index
            int i = 0;
            //Initializing j to last index
            int j = inputArray.length-1;
            //Till i crosses j, perform the following task
            while (i < j)
            {
                //If inputArray[i]+inputArray[j] is equal to inputNumber
                if(inputArray[i]+inputArray[j] == inputNumber)
                {
                    //then Print inputArray[i] and inputArray[j]
                    System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
                    //Increment i
                    i++;
                    //Decrement j
                    j--;
                }
                //If inputArray[i]+inputArray[j] is smaller than inputNumber
                else if (inputArray[i]+inputArray[j] < inputNumber)
                {
                    //then increment i
                    i++;
                }
                //If inputArray[i]+inputArray[j] is greater than inputNumber
                else if (inputArray[i]+inputArray[j] > inputNumber)
                {
                    //then decrement j
                    j--;
                }
            }
        }
        public static void main(String[] args)
        {
            findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
            findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
            findThePairs(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
            findThePairs(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
        }
    }
```
---

### 15) How to find continuous sub array whose sum is equal to given number?

code : 
```java
    import java.util.Arrays;
    public class SubArrayWhoseSumIsNumber
    {
        static void findSubArray(int[] inputArray, int inputNumber)
        {
            //Initializing sum with the first element of the inputArray
            int sum = inputArray[0];
            //Initializing starting point with 0
            int start = 0;
            //Iterating through inputArray starting from second element
            for (int i = 1; i < inputArray.length; i++)
            {
                //Adding inputArray[i] to the current 'sum'
                sum = sum + inputArray[i];
                //If sum is greater than inputNumber then following loop is executed until
                //sum becomes either smaller than or equal to inputNumber
                while(sum > inputNumber && start <= i-1)
                {
                    //Removing starting elements from the 'sum'
                    sum = sum - inputArray[start];
                    //Incrementing start by 1
                    start++;
                }
                //If 'sum' is equal to 'inputNumber' then printing the sub array
                if(sum == inputNumber)
                {
                    System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
                    for (int j = start; j <= i; j++)
                    {
                        System.out.print(inputArray[j]+" ");
                    }
                    System.out.println();
                }
            }
        }
        public static void main(String[] args)
        {
            findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
            findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);
            findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
        }
    }
```	
Alternate : 
```java
	import java.util.Arrays;

	public class SubArrayWhoseSumIsNumber
	{
	static void findSubArray(int[] inputArray, int inputNumber)
	{
		//Initializing 'sum' to 0

		int sum = 0;

		//Iterating through 'inputArray'

		for (int i = 0; i < inputArray.length; i++)
		{
			//Assigning inputArray[i] to 'sum'

			sum = inputArray[i];

			for (int j = i+1; j < inputArray.length; j++)
			{
				//Adding inputArray[j] to 'sum'

				sum = sum + inputArray[j];

				//If 'sum' is equal to 'inputNumber' then printing the sub array

				if(sum == inputNumber)
				{
					System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");

					for (int k = i; k <= j; k++)
					{
						System.out.print(inputArray[k]+" ");
					}

					System.out.println();
				}

				//if 'sum' is smaller than 'inputNumber', continue the loop

				else if (sum < inputNumber)
				{
					continue;
				}

				//if 'sum' is greater than 'inputNumber', then break the loop

				else if (sum > inputNumber)
				{
					break;
				}
			}
		}
	}

	public static void main(String[] args)
	{
		findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);

		findSubArray(new int[]{12, 5, 31, 13, 21, 8}, 49);

		findSubArray(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
	}
	}
```
---

### 16) How to remove duplicate elements from ArrayList in java?

code : 

16.1 : Removing Duplicate Elements From ArrayList Using HashSet
```java
    import java.util.ArrayList;
    import java.util.HashSet;
    public class MainClass
    {
        public static void main(String[] args)
        {
            //Constructing An ArrayList
            ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
            listWithDuplicateElements.add("JAVA");
            listWithDuplicateElements.add("J2EE");
            listWithDuplicateElements.add("JSP");
            listWithDuplicateElements.add("SERVLETS");
            listWithDuplicateElements.add("JAVA");
            listWithDuplicateElements.add("STRUTS");
            listWithDuplicateElements.add("JSP");
            //Printing listWithDuplicateElements
            System.out.print("ArrayList With Duplicate Elements :");
            System.out.println(listWithDuplicateElements);
            //Constructing HashSet using listWithDuplicateElements
            HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
            //Constructing listWithoutDuplicateElements using set
            ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
            //Printing listWithoutDuplicateElements
            System.out.print("ArrayList After Removing Duplicate Elements :");
            System.out.println(listWithoutDuplicateElements);
        }
    }
```	

16.2 Removing Duplicate Elements From ArrayList Using LinkedHashSet
```java
    import java.util.ArrayList;
    import java.util.LinkedHashSet;
    public class MainClass
    {
        public static void main(String[] args)
        {
            //Constructing An ArrayList
            ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
            listWithDuplicateElements.add("JAVA");
            listWithDuplicateElements.add("J2EE");
            listWithDuplicateElements.add("JSP");
            listWithDuplicateElements.add("SERVLETS");
            listWithDuplicateElements.add("JAVA");
            listWithDuplicateElements.add("STRUTS");
            listWithDuplicateElements.add("JSP");
            //Printing listWithDuplicateElements
            System.out.print("ArrayList With Duplicate Elements :");
            System.out.println(listWithDuplicateElements);
            //Constructing LinkedHashSet using listWithDuplicateElements
            LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
            //Constructing listWithoutDuplicateElements using set
            ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
            //Printing listWithoutDuplicateElements
            System.out.print("ArrayList After Removing Duplicate Elements :");
            System.out.println(listWithoutDuplicateElements);
        }
    }
```
---

### 17. How to check whether given number is binary or not?

code : 
```java
    public class MainClass
    {
        static void isBinaryOrNot(int number)
        {
            boolean isBinary = true;
            int copyOfNumber = number;
            while (copyOfNumber != 0)
            {
                int temp = copyOfNumber%10;   //Gives last digit of the number
                if(temp > 1)
                {
                    isBinary = false;
                    break;
                }
                else
                {
                    copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
                }
            }
            if (isBinary)
            {
                System.out.println(number+" is a binary number");
            }
            else
            {
                System.out.println(number+" is not a binary number");
            }
        }
        public static void main(String[] args)
        {
            isBinaryOrNot(128956);
            isBinaryOrNot((101110));
            isBinaryOrNot((42578));
            isBinaryOrNot((10110101));
        }
    }
```
---

### 18. How to check whether one string is a rotation of another in java?
```java
    public class MainClass
    {
        public static void main(String[] args)
        {
            String s1 = "JavaJ2eeStrutsHibernate";
            String s2 = "StrutsHibernateJavaJ2ee";
            //Step 1
            if(s1.length() != s2.length())
            {
                System.out.println("s2 is not rotated version of s1");
            }
            else
            {
                //Step 2
                String s3 = s1 + s1;
                //Step 3
                if(s3.contains(s2))
                {
                    System.out.println("s2 is a rotated version of s1");
                }
                else
                {
                    System.out.println("s2 is not rotated version of s1");
                }
            }
        }
    }
```
---

### 19. How to find intersection of two arrays in java? or Write a java program to find common elements between two arrays?

code : 

19.1) Using Iterative Method
```java
    class CommonElements
    {
        public static void main(String[] args)
        {
            String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
            String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
            HashSet<String> set = new HashSet<String>();
            for (int i = 0; i < s1.length; i++)
            {
                for (int j = 0; j < s2.length; j++)
                {
                    if(s1[i].equals(s2[j]))
                    {
                        set.add(s1[i]);
                    }
                }
            }
            System.out.println(set);     //OUTPUT : [THREE, FOUR, FIVE]
        }
    }	
```

19.2) Using retainAll() Method :
```java
    class CommonElements
    {
        public static void main(String[] args)
        {
            Integer[] i1 = {1, 2, 3, 4, 5, 4};
            Integer[] i2 = {3, 4, 5, 6, 7, 4};
            HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
            HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
            set1.retainAll(set2);
            System.out.println(set1);     //Output : [3, 4, 5]
        }
    }
```
---

### 20.  How to check whether user input is number or not in java?

code : 
```java
    boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
```

Below is the program which checks whether mobile number entered by user has 10 digits only.
```java
    class Utility
    {
        static boolean numberOrNot(String input)
        {
            try
            {
                Integer.parseInt(input);
            }
            catch(NumberFormatException ex)
            {
                return false;
            }
            return true;
        }
    }
    public class CheckMobileNumber
    {
        public static void main(String[] args)
        {
            System.out.println("Enter your mobile number");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if(Utility.numberOrNot(input) && (input.length() == 10))
            {
                System.out.println("Good!!! You have entered valid mobile number");
            }
            else
            {
                System.out.println("Sorry!!!! You have entered invalid mobile number. Try again...");
            }
        }
    }
```
---