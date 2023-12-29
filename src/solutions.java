import java.io.PrintStream;
import java.util.HashSet;

public class solutions {
    public solutions() {
    }

    public static void main(String[] args) {
        int[] ara = new int[]{1, 2, 30, 4, 50};
        System.out.println(sum(ara));//1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
        System.out.println(getMax(ara));//2. Largest Element in Array: Find and print the largest element in an array.

        for(int i = 0; i < ara.length; ++i) {//3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)
            if (ara[i] % 2 == 0) {
                System.out.println(ara[i] + " is even");
            } else {
                System.out.println(ara[i] + " is odd");
            }
        }

        reverse(ara);//4. Reverse an Array: Reverse the elements of an array.
        int num = 5;//5. Factorial Calculation: Write a program to calculate the factorial of a given number.********* + recursive solution.
        long factorial = 1L;

        for(int i = 1; i <= num; ++i) {
            factorial *= (long)i;
        }

        System.out.println("Factorial: " + factorial);
        String str = "level";//6. Palindrome Check: Check if a given string is a palindrome. (use char string)
        boolean isPalindrome = true;

        for(int i = 0; i < str.length() / 2; ++i) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is palindrome: " + isPalindrome);
        int num2 = 7;//7. Prime Number Check: Determine whether a given number is prime.
        boolean isPrime = true;
        if (num2 <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; (double)i <= Math.sqrt((double)num2); ++i) {
                if (num2 % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println("Is prime: " + isPrime);
        int N = 10;//8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.******** + recursive solution.
        generateFibonacci(N);
        generateRecursiveFibonacci(N);
        int[] arr = new int[]{1, 2, 3, 4, 5};//9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)
        int key = 3;
        PrintStream var10000 = System.out;
        boolean var10001 = linearSearch(arr, key);
        var10000.println("Element found: " + var10001);
        int[] arr2 = new int[]{1, 2, 3, 4, 5};//10. Binary Search: Implement binary search for a sorted array.
        int key2 = 3;
        var10000 = System.out;
        int var29 = binarySearch(arr2, key2);
        var10000.println("Element found at index: " + var29);
        int[] arr3 = new int[]{1, 2, 3, 2, 1};//11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)
        findDuplicates(arr3);
        String str2 = "Hello, World!";//12. Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)
        countVowelsAndConsonants(str2);
        printMultiplicationTable(2);//13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
        int[][] mat1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};//14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)
        int[][] mat2 = new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] result = addMatrices(mat1, mat2);

        for(int i = 0; i < result.length; ++i) {
            for(int j = 0; j < result[0].length; ++j) {
                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        int[] arr4 = new int[]{1, 2, 3, 4, 5};//15. Calculate Average: Calculate the average of elements in an array.
        System.out.println("Average: " + calculateAverage(arr4));
        int year = 2000;//16. Leap Year Check: Determine whether a given year is a leap year.
        System.out.println("Is " + year + " a leap year? " + isLeapYear(year));
        int size = 5;//17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)
        printPattern(size);
        String str3 = "apple";//18. String Reversal: Reverse a given string without using built-in functions. apple, elppa
        System.out.println("Reversed String: " + reverseString(str3));
        int num3 = 153;//19. Armstrong Number: Check if a number is an Armstrong number.
        System.out.println("Is " + num3 + " an Armstrong number? " + isArmstrong(num3));
        int[] arr5 = new int[]{15, 8, 10, 30, 5, 1, 14};//20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.
        System.out.println("Minimum value: " + findMin(arr5));
        System.out.println("Maximum value: " + findMax(arr5));
    }

    public static int sum(int[] ara) {
        int sum = 0;

        for(int i = 0; i < ara.length; ++i) {
            sum += ara[i];
        }

        return sum;
    }

    public static int getMax(int[] ara) {
        int max = ara[0];

        for(int i = 0; i < ara.length; ++i) {
            if (ara[i] > max) {
                max = ara[i];
            }
        }

        return max;
    }

    public static void reverse(int[] ara) {
        for(int i = ara.length - 1; i >= 0; --i) {
            System.out.print(ara[i] + " ");
        }

    }

    public static void generateFibonacci(int n) {
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci Series (Iterative):");

        for(int i = 0; i < n; ++i) {
            System.out.print("" + first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static int recursiveFibonacci(int n) {
        return n <= 1 ? n : recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void generateRecursiveFibonacci(int n) {
        System.out.println("Fibonacci Series (Recursive):");

        for(int i = 0; i < n; ++i) {
            System.out.print(recursiveFibonacci(i) + " ");
        }

        System.out.println();
    }

    public static boolean linearSearch(int[] arr, int key) {
        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] == key) {
                return true;
            }
        }

        return false;
    }

    public static int binarySearch(int[] arr2, int key2) {
        int start = 0;
        int end = arr2.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr2[mid] == key2) {
                return mid;
            }

            if (arr2[mid] < key2) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void findDuplicates(int[] arr3) {
        HashSet<Integer> set = new HashSet();

        for(int i = 0; i < arr3.length; ++i) {
            if (set.contains(arr3[i])) {
                System.out.print(arr3[i] + " ");
            } else {
                set.add(arr3[i]);
            }
        }

        System.out.println();
    }

    public static void countVowelsAndConsonants(String str2) {
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < str2.length(); ++i) {
            char c = Character.toLowerCase(str2.charAt(i));
            if (c >= 'a' && c <= 'z') {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                    ++consonants;
                } else {
                    ++vowels;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void printMultiplicationTable(int number) {
        System.out.println("Multiplication Table for " + number);

        for(int i = 1; i <= 10; ++i) {
            System.out.println("" + number + " x " + i + " = " + number * i);
        }

    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int[][] result = new int[mat1.length][mat1[0].length];

        for(int i = 0; i < mat1.length; ++i) {
            for(int j = 0; j < mat1[0].length; ++j) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return result;
    }

    public static double calculateAverage(int[] arr4) {
        int sum = 0;

        for(int i = 0; i < arr4.length; ++i) {
            sum += arr4[i];
        }

        return (double)sum / (double)arr4.length;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void printPattern(int size) {
        for(int i = 1; i <= size; ++i) {
            int j;
            for(j = i; j < size; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= 2 * i - 1; ++j) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static String reverseString(String str3) {
        String reversed = "";

        for(int i = str3.length() - 1; i >= 0; --i) {
            reversed = reversed + str3.charAt(i);
        }

        return reversed;
    }

    public static boolean isArmstrong(int num3) {
        int sum = 0;
        int temp = num3;

        int digits;
        for(digits = 0; temp != 0; temp /= 10) {
            ++digits;
        }

        for(temp = num3; temp != 0; temp /= 10) {
            int remainder = temp % 10;
            sum = (int)((double)sum + Math.pow((double)remainder, (double)digits));
        }

        return sum == num3;
    }

    public static int findMin(int[] arr5) {
        int min = arr5[0];

        for(int i = 1; i < arr5.length; ++i) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }

        return min;
    }

    public static int findMax(int[] arr5) {
        int max = arr5[0];

        for(int i = 1; i < arr5.length; ++i) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
        }

        return max;
    }
}
