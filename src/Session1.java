import java.util.Scanner;

public class Session1 {

    //main method
    public static void main(String[] args) {
        System.out.println("Hello FE's");

        //different data types

        int a1 = 1;
        byte a2 = 30;
        long a3 = 39273929l;
        double a4 = 78.932;
        float a5 = 892.39f;

        System.out.println(a2);

        // if conditions
        if(a1>4){
            System.out.println("Yes");
        }
        else if(a1<2){
            System.out.println("Lesser");
        }
        else if(a1<1){
            System.out.println("Lesser 1");
        }
        else {
            System.out.println("No");
        }

        //boolean check
        boolean a6 = true;
        if(a6){
            System.out.printf("yes true");
        }

        //break statement
        for(int i=1; i<=10;i++){
            if(i>5){
                break;
            }
            System.out.println(i);
        }

        // 1d array
        int b1[] = {1,2,3,4,5};
        System.out.println(b1[4]);

        for (int i = 0;i<5;i++){
            System.out.println(b1[i]);
        }

        // 2d array
        int c1[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //System.out.println(c1[1][2]);

        for(int i=0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(" " + c1[i][j]);
            }
            System.out.println();
        }

        //function calling
        System.out.println(add(12,63));

        //input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input");
        int s1 = sc.nextInt();
        System.out.println("Input is " + s1);
    }

    //method/function
    public static int add(int a1, int a2){
        return a1+a2;
    }

}
