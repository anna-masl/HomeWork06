package app;

public class MainHomeWork06 {
    static int sum;

    public static void main(String[] args){

        int num = 1;

        for (; num <= 6; num ++ ){
            sum += num;
            System.out.printf("%d) Num is %d, sum is %d\n", num, num,sum);
        }
        System.out.println("________________________");
        System.out.println("Sum of numbers is " + sum);


    }

}
