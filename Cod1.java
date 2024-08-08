import java.util.*;
public class Cod1 {
    static int el1(int a){
    if(a<=21)
    {
      return 21-2;
    }
    else
  {
    return (a-21)*2;
  }
    }
public static void main(String[]args)
{
 Scanner el=new Scanner(System.in);
 System.out.println("enter the number");
 int a=el.nextInt();
 System.out.println(el1(a));
}
}