import java.util.*;
public class PracticeSeven{
 /*
����������P1(x1,y1)��P2(x2,y2)֮��ľ���

int i = 1;
boolean b = 3+4>4||5!=6 &&7>8+ ++i
a.�﷨���� b.true c ������� d.���д��� e.false

�������ݣ� ���ݽ�����ѧ���ݣ���ɣ� �û��ڿ���̨������������������㵽�ֹ��� 
Ҫ�� 1.˰�ʣ�Baidu�� 2.���գ�Baidu �������ʵ�11%�� ����һ�� 3.����һ�������ó����ֵ�Ǯ
 */
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
  System.out.println("����˳������P1��ĺ�����x1��������y1(�ûس�����):");
int x1=sc.nextInt();
int y1=sc.nextInt();
 System.out.println("����˳������P2��ĺ�����x2��������y2(�ûس�����):");
int x2=sc.nextInt();
int y2=sc.nextInt();
 System.out.println("P1��P2�ľ���Ϊ:"+Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
int i=1;
boolean b = 3+4>4||5!=6 &&7>8+ ++i;
System.out.println(b);




    }
}