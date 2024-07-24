import java.util.*;
public class task3
{
public static void main(String[] args)
{int z;
Scanner ob=new Scanner(System.in);
do{
System.out.println("Enter test grade and weight in percentage :");
double a=ob.nextDouble();
double b=ob.nextDouble();
double c=a*b;
System.out.println("Enter assignment grade and weight in percentage :");
double e=ob.nextDouble();
double f=ob.nextDouble();
double g=e*f;
System.out.println("Enter quiz grade and weight in percentage :");
double i=ob.nextDouble();
double j=ob.nextDouble();
double k=i*j;
System.out.println("Enter mid term exam grade and weight in percentage :");
double m=ob.nextDouble();
double n=ob.nextDouble();
double o=m*n;
System.out.println("Enter final exam grade and weight in percentage :");
double q=ob.nextDouble();
double r=ob.nextDouble();
double s=q*r;
double total=(c+g+k+o+s)/(b+f+j+n+r);
if(total>=90.0&&total<=100.0)
System.out.print("Final grade : A\n");
else if(total>=75.0&&total<90.0)
System.out.print("Final grade : B\n");
else if(total>=60.0&&total<75.0)
System.out.print("Final grade : C\n");
else if(total>=50.0&&total<60.0)
System.out.print("Final grade : D\n");
else
System.out.print("Final grade : F\n");
System.out.println("\nWant to continue ? press 1 for Yes or 0 for No :");
z=ob.nextInt();
}
while(z!=0);
}}