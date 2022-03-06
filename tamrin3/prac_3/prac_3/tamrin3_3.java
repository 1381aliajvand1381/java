package tamrin3.prac_3;

import java.util.Scanner;

public class tamrin3_3 {
    public static void main(String args[]){
        int my_num=(new Scanner(System.in)).nextInt();
        my_class3_3 Myinteger=new my_class3_3();
        if(Myinteger.isEven(my_num)=="even"){
            System.out.println("even");
        }
        else if(Myinteger.isOdd(my_num)=="odd"){
            System.out.println("odd");
        }
        if(Myinteger.isZero(my_num)=="zero"){
            System.out.println("zero");
        }
        else if(Myinteger.isPosetive(my_num)=="posetive"){
            System.out.println("posetive");
        }
        else if(Myinteger.isNegative(my_num)=="negative"){
            System.out.println("negative");
        }
    }
}
