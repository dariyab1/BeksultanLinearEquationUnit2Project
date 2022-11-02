import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!\nEnter coordinate 1:");
        String coordinates1 = input.nextLine();
        int place = coordinates1.indexOf(",");
        String one = coordinates1.substring(1, place);
        String two = coordinates1.substring(place + 1, (coordinates1.length() - 1));
        int x1 = Integer.parseInt(one);
        int y1 = Integer.parseInt(two);
        System.out.println("Enter coordinate 2:");
        String coordinates2 = input.nextLine();
        int place2 = coordinates2.indexOf(",");
        String three = coordinates2.substring(1, place2);
        String four = coordinates2.substring(place2 + 1, (coordinates2.length() - 1));
        int x2 = Integer.parseInt(three);
        int y2 = Integer.parseInt(four);

        if (x1==x2){
            System.out.println("These points are on a vertical line: x="+x1);
            System.exit(0);
        }

        LinearEquation myEquation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(myEquation.lineInfo());
        System.out.println("Enter a value for x:");
        double newX=input.nextDouble();
        System.out.println(myEquation.coordinateForX(newX));
    }
}


