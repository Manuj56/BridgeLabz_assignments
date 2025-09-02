import java.util.Scanner;

public class Level1Practice {
    public static void main(String[] args) {

        //1 Age of Harry
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;
        System.out.println("//1 Harry's age in 2024 is " + age);

        //2 Sam’s Average in PCM
        int maths = 94, physics = 95, chemistry = 96;
        double avg = (maths + physics + chemistry) / 3.0;
        System.out.println("//2 Sam’s average mark in PCM is " + avg);

        //3 Kilometer to Miles
        double km1 = 10.8;
        double miles1 = km1 / 1.6;
        System.out.println("//3 The distance " + km1 + " km in miles is " + miles1);

        //4 Profit & Profit %
        int costPrice = 129, sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercent = (profit * 100.0) / costPrice;
        System.out.println("//4 The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);

        //5 Divide Pens
        int pens = 14, students = 3;
        int perStudent = pens / students;
        int remaining = pens % students;
        System.out.println("//5 The Pen Per Student is " + perStudent + " and the remaining pen not distributed is " + remaining);

        //6 Discount on Fee
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("//6 The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        //7 Volume of Earth
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("//7 The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);

        //8 Km to Miles (User Input)
        Scanner input = new Scanner(System.in);
        System.out.print("//8 Enter distance in km: ");
        double km = input.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        //9 Discount with User Input
        System.out.print("//9 Enter Student Fee: ");
        double fee2 = input.nextDouble();
        System.out.print("Enter Discount Percent: ");
        double discountPercent2 = input.nextDouble();
        double discount2 = (fee2 * discountPercent2) / 100;
        double finalFee2 = fee2 - discount2;
        System.out.println("The discount amount is INR " + discount2 + " and final discounted fee is INR " + finalFee2);

        //10 Height Conversion
        System.out.print("//10 Enter height in cm: ");
        double cm = input.nextDouble();
        double inches = cm / 2.54;
        int feetPart = (int) (inches / 12);
        double inchPart = inches % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feetPart + " and inches is " + inchPart);

        //11 Calculator
        System.out.print("//11 Enter first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();
        double add = number1 + number2;
        double sub = number1 - number2;
        double mul = number1 * number2;
        double div = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is " + add + ", " + sub + ", " + mul + ", and " + div);

        //12 Area of Triangle
        System.out.print("//12 Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; // 1 sq inch = 6.4516 sq cm
        System.out.println("The area of triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters");

        //13 Side of Square
        System.out.print("//13 Enter perimeter of square: ");
        double perimeter = input.nextDouble();
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        //14 Distance Conversion Feet -> Yards & Miles
        System.out.print("//14 Enter distance in feet: ");
        double distanceFeet = input.nextDouble();
        double yards = distanceFeet / 3;
        double miles2 = yards / 1760;
        System.out.println("The distance in feet is " + distanceFeet + " while in yards is " + yards + " and in miles is " + miles2);
    }
}
