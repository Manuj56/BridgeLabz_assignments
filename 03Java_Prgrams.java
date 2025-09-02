import java.util.Scanner;

public class Level2Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1 Basic Calculator
        System.out.print("//1 Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);

        //2 Area of Triangle in sq cm and sq in
        System.out.print("//2 Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / (2.54 * 2.54); // convert cm^2 to in^2
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        //3 Side of Square
        System.out.print("//3 Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        //4 Distance in yards & miles from feet
        System.out.print("//4 Enter distance in feet: ");
        double distanceFeet = input.nextDouble();
        double yards = distanceFeet / 3;
        double miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        //5 Total Purchase Price
        System.out.print("//5 Enter unit price: ");
        double unitPrice = input.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        //6 Quotient & Remainder
        System.out.print("//6 Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + num1 + " and " + num2);

        //7 IntOperation
        System.out.print("//7 Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
        System.out.print("Enter value of c: ");
        int c = input.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        //8 DoubleOperation
        System.out.print("//8 Enter value of a: ");
        double da = input.nextDouble();
        System.out.print("Enter value of b: ");
        double db = input.nextDouble();
        System.out.print("Enter value of c: ");
        double dc = input.nextDouble();
        double dresult1 = da + db * dc;
        double dresult2 = da * db + dc;
        double dresult3 = dc + da / db;
        double dresult4 = da % db + dc;
        System.out.println("The results of Double Operations are " + dresult1 + ", " + dresult2 + ", " + dresult3 + ", and " + dresult4);
    }
}
