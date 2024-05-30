import java.text.DecimalFormat;
import java.util.Scanner;
class gradecalci
{
    static double grade1(int m1,int m2,int m3,int m4,int m5)
    {
        double grade;
        grade=((m1+m2+m3+m4+m5)/500.00)*100;
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks obtained in five subject out of 100");
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        int m4=sc.nextInt();
        int m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        double grade =grade1(m1,m2,m3,m4,m5);
        char gr=' ';
        DecimalFormat df=new DecimalFormat("#.00");
       if(grade>=75.00 && grade<=100.00)
       { gr='A';
           System.out.println("TOTAL MARKS"+" "+ " average percentage"+" "+" GRADE");
           System.out.print(total+" "+df.format(grade) + " "+ gr);
       }
       
        else if(grade>=50.00 && grade<75.00)
        { gr='B';
            System.out.println("TOTAL MARKS"+" "+ " average percentage"+" "+" GRADE");
            System.out.print(total+"    "+df.format(grade) + "   "+ gr);
        }
        else if(grade>=39.00 && grade<50.00)
        { gr='C';
            System.out.println("TOTAL MARKS"+" "+ " average percentage"+" "+" GRADE");
            System.out.print(total+" "+df.format(grade)+ " "+ gr);
        }
        else if(grade>=28.00 && grade<39.00)
        { gr='D';
            System.out.println("TOTAL MARKS"+" "+ " average percentage"+" "+" GRADE");
            System.out.print(total+" "+df.format(grade) + " "+ gr);
        }
        else {
           gr='f';
           System.out.println("TOTAL MARKS"+" "+ " average percentage"+" "+" GRADE");
           System.out.print(total+" "+df.format(grade) + " "+ gr);
       }

    }
}