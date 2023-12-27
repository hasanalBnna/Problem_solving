
public class solutions {
    public static void main(String[] args) {
        int[] ara= {1,2,30,4,50};
        System.out.println(sum(ara));//1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
}
    public static int sum(int[] ara){
        int sum = 0;
        int i;
        for(i = 0; i< ara.length; i++){
            sum= sum+ara[i];
        }
        return sum;
    }
}

