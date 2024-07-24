import java.util.*;
public class task3
{
public static void main(String[] args)
{int z;
Scanner ob=new Scanner(System.in);
do{
System.out.println("Enter test grade and weight in percentage :");
double a=ob.nextDouble(); //input obtained grade in test 
double b=ob.nextDouble(); //input weight of test marks
double c=a*b; //calculate weighted grade in test
System.out.println("Enter assignment grade and weight in percentage :");
double e=ob.nextDouble(); //input obtained grade in assignment 
double f=ob.nextDouble(); //input weight of assignment marks
double g=e*f; //calculate weighted grade in assignment
System.out.println("Enter quiz grade and weight in percentage :");
double i=ob.nextDouble(); //input obtained grade in quiz
double j=ob.nextDouble(); //input weight of quiz marks
double k=i*j; //calculate weighted grade in quiz
System.out.println("Enter mid term exam grade and weight in percentage :");
double m=ob.nextDouble(); //input obtained grade in mid term exam
double n=ob.nextDouble(); //input weight of mid term exam marks
double o=m*n; //calculate weighted grade in mid term exam
System.out.println("Enter final exam grade and weight in percentage :");
double q=ob.nextDouble(); //input obtained grade in final exam
double r=ob.nextDouble(); //input weight of final exam marks
double s=q*r; //calculate weighted grade in final exam
double total=(c+g+k+o+s)/(b+f+j+n+r); //calculate final marks in percentage of all components of course
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
z=ob.nextInt(); //input choice of user to continue or not
}
while(z!=0);
}}
