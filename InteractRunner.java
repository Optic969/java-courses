import java.util.Scanner;

public class InteractRunner 
{
  


public static void main(String[]arg) {
Scanner sc = new Scanner(System.in);
try {
Calculator calc = new Calculator();
String exit = "no";
while (!exit.equals("yes")) {
System.out.println("Eanter first arg : ");
int a1 = sc.nextInt();
System.out.println ("Eanter mark of operation (+,-,*,/ ) : ");
String op = sc.next();
System.out.println("Eanter second arg : ");
int a2 = sc.nextInt();
System.out.println("Result : " + Calculator.metodCalc(a1, op, a2));
System.out.println("Exit : yes/no ");
exit = sc.next();
}
}finally {
sc.close();
}
} 
}