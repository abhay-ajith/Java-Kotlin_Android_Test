import java.util.Scanner;
interface CalcIf{
    void add(int i, int j);
    void sub(int i, int j);
    void mul(int i, int j);
    void div(int i, int j);

}
abstract class CalcAb implements CalcIf{
    public void add(int i,int j){
        System.out.println(i+j);
    }
    public void sub(int i,int j){
        System.out.println(i-j);
    }
    public void mul(int i,int j){
        System.out.println(i*j);
    }
    public void div(int i,int j){
        if(j!=0){
        System.out.println(i/j);
        }
        else{
            System.out.println("NOt Valid");;
        }
    }

}
class Calc extends CalcAb{
    static Scanner getvalues= new Scanner(System.in);
    
    private int i;
    private int j;
    Calc(){
        getUserInput();
        add(i,j);
        sub(i,j);
        mul(i,j);
        div(i,j);
    }
    public void getUserInput(){
        System.out.print("Enter The First Number  ");
        i=getvalues.nextInt();
        System.out.print("Enter The First Number  ");
        j=getvalues.nextInt();
    }
}
public class OopCalc {
    public static void main(String[] args){
        Calc ob =new Calc();
    }    
}
