import java.util.Scanner;
class vstatic{
    static int a=1;     //static variable
    static              //static block
{
    System.out.println("Inside static block\n");
}
    static void meth(int x){           //static method
        System.out.print("x = "+x);
        System.out.println("a = "+a);

    }
    public static void main(String args[]){
       meth(24);
    }
}
