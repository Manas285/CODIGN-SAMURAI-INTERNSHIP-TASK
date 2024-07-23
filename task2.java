import java.util.*;
public class task2
{
public static void main(String[] args)
{int c;
task2 obj=new task2();
Scanner ob=new Scanner(System.in);
do{
System.out.println("Enter first number :");
float a=ob.nextFloat(); // first number input by user
System.out.println("Enter second number :");
float b=ob.nextFloat(); // second number input by user
System.out.println("Press 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 for division"); //a menu driven interface for user
int ch=ob.nextInt(); //will take input selected by user to perfrom desire opration
switch(ch){
case 1: obj.sum(a,b); //calling sum function to add both numbers
	break;
case 2: obj.subtract(a,b); //calling subtract function to subtract both numbers
	break;
case 3: obj.product(a,b); //calling product function to multiply both numbers
	break;
case 4: obj.divide(a,b); //calling divide function for division of both numbers
	break;
default:
System.out.println("Invalid Input--select from the options provided"); //if user press wrong button 
}
System.out.println("\nWant to continue ? press 1 for Yes and 0 for No :");
c=ob.nextInt();
}
while(c!=0);
}
void sum(float a,float b){ //addition function
System.out.print("Result :"+(a+b));
}
void subtract(float a,float b){
System.out.print("Result :"+(float)Math.abs(a-b)); //subtraction function- Math.abs used to find absolute value of argument passed
}
void product(float a,float b){ //multiplication function
System.out.print("Result :"+(a*b));
}
void divide(float a,float b) //division function 
{
try { // incase any exception arise such as division by zero
float res=a/b;
System.out.print("Result :"+res);
}
catch (ArithmeticException e) // the occured exception will be caught by catch block
{
System.out.println("exception occured"+e.getMessage());
System.out.println("cannot divide by zero");
}
}}
