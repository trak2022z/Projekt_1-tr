import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Scanner scana = new Scanner(System.in);
    System.out.println("Witaj w kalkulatorze figur plaskich, wybierz figure:");
    System.out.println("1.Kwadrat \r\n2.Prostokąt\r\n3.Koło \r\n4.Trojkat");
    int z = scan.nextInt();

    switch (z){
      case 1:
      {
        System.out.println("Wybrales kwadrat, podaj jego bok:");
        double a = scana.nextDouble();
        double pole = a*a;
        double przekatna = Math.sqrt(2)*a;
        System.out.println("Parametry:");
        System.out.println("Pole: "+pole);
        System.out.println("Przekatna: "+przekatna);
      }break;
        
      case 2:
      {
          System.out.println("Wybrales prostokat, podaj jego bok a:");
        double a = scana.nextDouble();
        System.out.println("Podaj bok b:");
        double b = scana.nextDouble();
        double pole1 = a*b;
        double przekatna1 = Math.sqrt((a*a)+(b*b));
        System.out.println("Parametry:");
        System.out.println("Pole: "+pole1);
        System.out.println("Przekatna: "+przekatna1);
      }break;
        case 3:
      {
          System.out.println("Wybrales koło, podaj promień:");
        double r = scana.nextDouble();
        double pole2 = Math.PI*r*r ;
        double obwod = Math.PI*2*r ;
        System.out.println("Parametry:");
        System.out.println("Pole: "+pole2);
        System.out.println("Obwod: "+obwod);
      }break;
        case 4:
      {
          System.out.println("Wybrales trojkat, podaj rodzaj:\r\n1.Prostokatny\r\n2.Rownoboczny");
        int x =scan.nextInt();
        if(x==1)
        {
          System.out.println("Podaj 1 przyprostokatna");
          double a = scana.nextDouble();
          System.out.println("Podaj 2 przyprostokatna");
          double b = scana.nextDouble();
          double przeciwp = Math.sqrt((a*a)+(b*b));
          double pole3 = a*b*0.5;
          double kata = Math.toDegrees(Math.asin(a/przeciwp));
          double katb = Math.toDegrees(Math.asin(b/przeciwp));
          System.out.println("Pole: "+pole3);
          System.out.println("Przeciwprostokatna: "+przeciwp);
          System.out.println("Kat alfa: "+kata);
          System.out.println("Kat beta: "+katb);
        }
      
        if(x==2)
        {System.out.println("Podaj bok");
          double bok = scana.nextDouble();
         double h = (bok*Math.sqrt(3))/2;
         double r = h/3;
         double R = r*2;
         double pole4= bok*h*0.5;
          System.out.println("Wysokość: "+h);
          System.out.println("Promien okregu wpisanego: "+r);
          System.out.println("Promien okregu opisanego: "+R);
          System.out.println("Pole: "+pole4);
        }
      }break;
    }
  }
}