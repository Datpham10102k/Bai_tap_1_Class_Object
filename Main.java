import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = input.nextDouble();
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.println("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation eq =  new QuadraticEquation(a,b,c);
        double delta = eq.getDiscriminant();

        if (delta>0){
            System.out.println("The equation has 2 roots: " + eq.getRoot1() + " and " + eq.getRoot2());
        }else if (delta==0) {
            System.out.println("The equation has 1 roots: " + eq.getRoot1());
        }else {
            System.out.println("The equation has 0 roots");
        }
        input.close();
        }
    }