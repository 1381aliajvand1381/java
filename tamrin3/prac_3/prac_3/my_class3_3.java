package tamrin3.prac_3;

public class my_class3_3 {
    int a;
    public my_class3_3(){}
    public my_class3_3(int a){
        this.a=a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }
    String isEven(int k){
        if(k%2==0){
            return("even");
        }
        return null;
    }
    String isOdd(int k){
        if(k%2==1){
            return("odd");
        }
        return null;
    }
    String isPosetive(int k){
        if(k>0){
            return("posetive");
        }
        return null;
    }
    String isNegative(int k){
        if(k<0){
            return("negative");
        }
        return null;
    }
    String isZero(int k){
        if(k==0){
            return("zero");
        }
        return null;
    }
    
    
}
