
public class solutions {
    public static void main(String[] args) {
        int[] ara= {1,2,30,4,50};
        System.out.println(sum(ara));//1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
        System.out.println(getMax(ara));//2. Largest Element in Array: Find and print the largest element in an array.
        for (int i = 0; i < ara.length; i++) {//3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)
            if (ara[i] % 2 == 0) {
                System.out.println(ara[i] + " is even");
            } else
                System.out.println(ara[i] + " is odd");
        }
        reverse(ara);//4. Reverse an Array: Reverse the elements of an array.
}
    public static int sum(int[] ara){
        int sum = 0;
        int i;
        for(i = 0; i< ara.length; i++){
            sum= sum+ara[i];
        }
        return sum;
    }
    public static int getMax(int[] ara){
        int max = ara[0];
        for(int i=0;i<ara.length;i++){
            if(ara[i] > max){
                max = ara[i];
            }
        }
        return max;
    }
    public static void reverse(int[] ara) {
        for(int i=ara.length-1;i>=0;i--) {
            System.out.print(ara[i] + " ");
        }
    }
}

