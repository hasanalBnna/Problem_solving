
public class solutions {
    public static void main(String[] args) {
        int[] ara= {1,2,30,4,50};
        System.out.println(sum(ara));//1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
        System.out.println(getMax(ara));//2. Largest Element in Array: Find and print the largest element in an array.
        
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
}

