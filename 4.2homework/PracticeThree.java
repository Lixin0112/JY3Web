import java.util.*;
public class PracticeThree{
 /*
 �������� ʵ�� 2 ���������㣺
y = f��x�� = x%3
y = f��x�� = x++
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("�������Ա���x(����)��");
      int x=sc.nextInt();
      int y1=f1(x);
      int y2=f2(x);
      System.out.println("����y=f(x)=x%3��ֵΪ��"+y1);
      System.out.println("����y=f(x)=x++��ֵΪ��"+y2); 
    }
    public static int f1(int a){
    
   return (a%3);
   
    }

    public static int f2(int a){
    
    return(a+1);
    }




}