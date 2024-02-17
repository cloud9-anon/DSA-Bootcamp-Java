import java.util.Scanner;

public class Tester {

    TODO: Question 1
    public static void main(String[] args) throws Exception {

    int year;

    try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter Year : ");
    year = sc.nextInt();

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    System.out.println(year + " - It is a Leap Year ");
    } else {
    System.out.println("Not a Leap Year");
    }

    }

    TODO:Question 2

    public static int sum(int a, int b) {
    return a + b;
    }
    public static void main(String[] args) throws Exception {
    int num1, num2;

    try (Scanner sc = new Scanner(System.in)) {
    System.out.println(" Enter Two Numbers : ");

    num1 = sc.nextInt();
    num2 = sc.nextInt();

    System.out.println("The Sum is : " + sum(num1, num2));

    }

    }

    TODO:Question 3

    public static void main(String[] args) throws Exception {
    int num1;
    try (Scanner sc = new Scanner(System.in)) {

    System.out.println("Enter Number : ");
    num1 = sc.nextInt();

    for (int i = 1; i <= 10; i++) {
    System.out.println(num1 + " x " + (i) + " = " + (num1 * i));
    }

    }

    }

    TODO:Question 4

    public static int hcf(int a, int b) {

    while (b != 0) {
    int temp = b;
    b = a % b;
    a = temp;
    }
    return a;
    }

    public static int lcm(int a, int b) {
    return (a * b) / hcf(a, b);
    }

    public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
    System.out.println("Enter Two Numbers : ");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    System.out.println("HCF is : " + hcf(num1, num2));
    System.out.println("LCM is : " + lcm(num1, num2));
    }
    }

    TODO:Question 5

    public static int sum_of_inputs(Scanner sc) {

        System.out.println("Enter Inputs : ");

        if (sc.hasNextInt()) {
            int sum = sc.nextInt();
            return sum + sum_of_inputs(sc);

        } else if (sc.next().equalsIgnoreCase("x")) {
            return 0;
        } else {

            return sum_of_inputs(sc);
        }
    }

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {

            int sum = sum_of_inputs(sc);

            System.out.println("The sum is " + sum);
        }
    }
}
