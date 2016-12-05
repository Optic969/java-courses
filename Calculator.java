public class Calculator{

public static int metodCalc(int a1, String op, int a2)
{
int res=0;
switch (op)
{
  case "+": res = a1+a2;
  
    break;
  case "-": res = a1-a2;
   
    break;
  case "*": res = a1*a2;
   
    break;
  case "/": res = a1/a2;
    
    break;
}
return res;
}
}
