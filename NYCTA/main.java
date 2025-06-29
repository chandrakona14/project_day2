class calculator {
   int add (int a, int b){
    return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
        }
   }
public class main{
   public static void main (String[]args){
      calculator calc= new calculator();
      System.out.println("sum of 2 numbers: " + calc.add(10, 20));
      System.out.println("Sum of 3 numbers: " + calc.add(20,25,30));

   }
}


