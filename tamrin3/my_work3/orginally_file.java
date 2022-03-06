

public class orginally_file{
    public static void main(String[] args){
        w3 work=new w3();
        String[] Name=new String[3];
        int i;
        Name[1]="ahmad";
        Name[2]="mino fam";
        Name[0]="ajvand";
        for(i=0;i<Name.length;i++){
            work.student(Name[i]);
            work.empolyee(Name[i]);
            work.teacher(Name[i]);
        }

    }

}