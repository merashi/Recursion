package main;

public class Recursion {
static int factorial(int number) {
   if(number==1){
       return 1;
   }
   else{
       return number * factorial(--number);
   }
}
static int fabonacci(int num){
    if(num == 0){
        return 0;
    }
    else if(num == 1){
        return 1;
    }
    else {
        return fabonacci(num-1)+fabonacci(num-2);
    }
}
    public static void main(String[] args) {
   int c=0;
        System.out.println(factorial(4));
        for (int i = 0; i < 5; i++) {
            System.out.println(fabonacci(c));
            c++;
        }
    }
}
