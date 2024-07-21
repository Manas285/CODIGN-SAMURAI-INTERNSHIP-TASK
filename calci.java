import java.util.*;
public class calci
{
public static void main(String[] args)
{
calci obj=new calci();
Scanner ob=new Scanner(System.in);
System.out.println("Enter first number :");
float a=ob.nextFloat(); // first number input by user
System.out.println("Enter second number :");
float b=ob.nextFloat(); // second number input by user
System.out.println("Press 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 for division\nPress 5 to exit"); //a menu driven interface for user
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
case 5: System.exit(0); //if user wants to exit from program
	break;
default:
System.out.println("Invalid Input"); //if user enters invalid input such as any character
}}
void sum(float a,float b){ //addition function
System.out.print(a+b);
}
void subtract(float a,float b){
System.out.print((float)Math.abs(a-b)); //subtraction function- Math.abs used to find absolute value of argument passed
}
void product(float a,float b){ //multiplication function
System.out.print(a*b);
}
void divide(float a,float b) //division function 
{
try { // incase any exception arise such as division by zero
float res=a/b;
System.out.print(res);
}
catch (ArithmeticException e) // the occured exception will be caught by catch block
{
System.out.println("exception occured"+e.getMessage());
System.out.println("cannot divide by zero");
}
}}