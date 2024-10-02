package app;

public class MainHomeWork06 {


    public static void main(String[] args){

        int sum = 0;

        for (int num = 1; num <= 6; num ++ ){
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d\n", num, num,sum);
        }
        System.out.println("________________________");
        System.out.println("Sum of numbers is " + sum);


    }

}
