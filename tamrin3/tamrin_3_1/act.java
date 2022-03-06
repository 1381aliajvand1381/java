package tamrin3.tamrin_3_1;

public class act {
    int x,y;
    public act(){    
    }
    public act(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    int multiplaction(int x,int y){
        return x*y;
    }
    int adittion(int x,int y){
        return x+y;
    }
    double division(int x,int y){
        return x/y;
    }
    int subtraction(int x,int y){
        return x-y;
    }
}
