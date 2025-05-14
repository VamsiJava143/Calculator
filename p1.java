import java.util.*;
class p1
{
 public static void main(String ar[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Rows:");
  int row=sc.nextInt();
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<row;j++)
   {
    System.out.print(" * ");
   }
   System.out.println();
  }
 }
}