import java.util.Scanner;
import java.util.Locale;

public class Hello {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    int numen, a=0, b=0, c=0;

    System.out.println("Digite um valor positivo e natural: ");
    numen = sc.nextInt();

while(c!=numen){
a=(a+1);
b=(b+1);

c=(a*b);


}

System.out.println("A raiz de "+numen+" é: "+a);
    sc.close();
  }
}
    


