package com.model;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);

			double result = number1 / number2;
			System.out.println("Division is" + result);
		} catch (ArithmeticException exception) {
			System.out.println("Invalid input. It cannot be Zero");
		}

		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Please provide two numbers");
		}

		catch (NumberFormatException exception) {
			System.out.println("Cannot accept String");
		}

		catch (Exception exception) {
			System.out.println("Something Went Wrong");
		}
		finally {
			System.out.println("Inside finally. Closing activities");
		}
		System.out.println("Exiting main");

	}
}
