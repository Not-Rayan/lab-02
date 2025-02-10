package cpit305.fcit.kau.edu.sa;
// Name: Rayan Awad Alqarni
// ID: 2136994

import java.util.Scanner;

public class SquareCalcApp {
    // Custom Exception for out of range values


    // Method to calculate the square of a number
    public static int square(int number) throws OutOfRangeException {
        if (number < 0 || number > 100) {
            throw new OutOfRangeException("Error: Number should be between 0 and 100.");
        }
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 100: ");

        try {

            int number = Integer.parseInt(scanner.nextLine());
            int result = square(number);
            System.out.println("Square = " + result);

        }  catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter an integer");
        } catch (IllegalArgumentException e) {

            System.err.println(e.getMessage());
        }catch (OutOfRangeException e) {
            System.err.println(e.getMessage());
        }   catch (Exception e)  {

            System.err.println("Unexpected error! " + e.getMessage());
        }finally {
            scanner.close();
            System.out.println("Thank you for using SquareCalcApp!");
        }
    }
}
