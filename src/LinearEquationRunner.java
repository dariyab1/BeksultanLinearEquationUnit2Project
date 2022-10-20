import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        LinearEquation myEquation = new LinearEquation(-1,5,3,10);
        System.out.println(myEquation.slope());
        System.out.println(myEquation.equation());
    }
}
