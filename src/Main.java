import java.util.Scanner;

/*
*@Author Emircan Aktas - 31.Dec.2022
 */
public class Main {
    static int method(int tempNumber, int number) {

        if (tempNumber > 0) {
            System.out.print(tempNumber + " ");
            tempNumber -= 5;
            return method(tempNumber, number);
        }
        return method2(tempNumber, number);


    }

    static int method2(int tempNumber, int number) {
        if (tempNumber <= number) {
            System.out.print(tempNumber + " ");
            tempNumber += 5;
            return method2(tempNumber, number);
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = inp.nextInt();
            int tempNumber = number;
            method(tempNumber, number);
            System.out.println();

        } while (number > 0);
    }
}