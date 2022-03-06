package tamrin3.tamrin_3_1;

import java.util.Scanner;

public class asli {
    public static void main(String args[]) {
        Scanner my_input=new Scanner(System.in);
        int x,y;
        System.out.print("enter x number:\t");
        x=my_input.nextInt();
        System.out.print("enter y number:\t");
        y=my_input.nextInt();
        act my_function=new act();
        System.out.println("x+y:\t"+my_function.adittion(x, y));
        System.out.println("x-y:\t"+my_function.subtraction(x, y));
        System.out.println("x*y:\t"+my_function.multiplaction(x, y));
        System.out.println("x/y:\t"+my_function.division(x, y));
    }
}
