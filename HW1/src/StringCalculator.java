import java.util.Scanner;

public class StringCalculator {

	// check the number of minus
	public static int checkminus(String s) {
		int i, count = 0;
		for (i = 0; i < s.length(); i++) {
			char numofminus = s.charAt(i);
			if (numofminus == '-') {
				count++;
			}
		}
		return count;
	}

	public static double addition(String s) {
		int strlen = s.length();
		//finding the location of +
		int plusplace = s.indexOf("+");
		String op1 = s.substring(0, plusplace);
		String op2 = s.substring(plusplace + 1, strlen);
		double convertop1 = Double.parseDouble(op1);
		double convertop2 = Double.parseDouble(op2);
		return (convertop1 + convertop2);
	}

	public static double subtraction(String s) {
		int strlen1 = s.length();
		//finding the location of -
		int minusplace = s.indexOf("-");
		int minusplace1 = s.lastIndexOf("-");
		if (minusplace == minusplace1) {
			String op1 = s.substring(0, minusplace);
			String op2 = s.substring(minusplace + 1, strlen1);
			double convertop1 = Double.parseDouble(op1);
			double convertop2 = Double.parseDouble(op2);
			return (convertop1 - convertop2);
		} else {
			String op1 = s.substring(0, minusplace1);
			String op2 = s.substring(minusplace1 + 1, strlen1);
			double convertop1 = Double.parseDouble(op1);
			double convertop2 = Double.parseDouble(op2);
			return (convertop1 - convertop2);
		}
	}

	public static double multiply(String s) {
		int strlen2 = s.length();
		//finding the location of *
		int multiplace = s.indexOf("*");
		String op1 = s.substring(0, multiplace);
		String op2 = s.substring(multiplace + 1, strlen2);
		double convertop1 = Double.parseDouble(op1);
		double convertop2 = Double.parseDouble(op2);
		return (convertop1 * convertop2);
	}

	public static double divide(String s) {
		int strlen3 = s.length();
		//finding the location of /
		int diviplace = s.indexOf("/");
		String op1 = s.substring(0, diviplace);
		String op2 = s.substring(diviplace + 1, strlen3);
		double convertop1 = Double.parseDouble(op1);
		double convertop2 = Double.parseDouble(op2);
		// if divide by 0
		if (convertop2 == 0) {
			return 0;
		} else {
			return (convertop1 / convertop2);
		}
	}

	public static void printans(double ans) {
		System.out.println(ans);
		System.out.println("Type STOP if you want to terminate the program");
	}

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter an equation that you want to solve: ");
			String eq = sc.nextLine();

			int numofmin = checkminus(eq);
			// System.out.println(numofmin);

			boolean operator = eq.contains("+");
			boolean operator1 = eq.contains("*");
			boolean operator2 = eq.contains("/");
			boolean operator3 = eq.contains("-");

			if (numofmin == 0) {
				if (operator == true) {
					double addans = addition(eq);
					printans(addans);
				} else if (operator1 == true) {
					double multians = multiply(eq);
					printans(multians);
				} else if (operator2 == true) {
					double divians = divide(eq);
					if (divians == 0) {
						System.out.println("Math Error");
						continue;
					} else {
						printans(divians);
					}
				} else if (eq.equals("STOP")) {
					break;
				} else {
					System.out.println("NO SUCH OPERATION.");
					continue;
				}
			} else if (numofmin == 1) {
				int minusplace = eq.indexOf("-");
				// System.out.println("Location of minus: "+minusplace);
				if (minusplace == 0) {
					if (operator == true) {
						double addans = addition(eq);
						printans(addans);
					} else if (operator1 == true) {
						double multians = multiply(eq);
						printans(multians);
					} else if (operator2 == true) {
						double divians = divide(eq);
						printans(divians);
					} else if (eq.equals("STOP")) {
						break;
					} else {
						System.out.println("NO SUCH OPERATION.");
						continue;
					}
				} else if (minusplace >= 1) {
					if (operator == true) {
						double addans = addition(eq);
						printans(addans);
					} else if (operator1 == true) {
						double multians = multiply(eq);
						printans(multians);
					} else if (operator2 == true) {
						double divians = divide(eq);
						printans(divians);
					} else if (operator3 == true) {
						double subans = subtraction(eq);
						printans(subans);
					} else if (eq.equals("STOP")) {
						break;
					} else {
						System.out.println("NO SUCH OPERATION.");
						continue;
					}
				}
			} else if (numofmin == 2) {
				int minusplace = eq.indexOf("-");
				// System.out.println("Location of minus: "+minusplace);
				int minusplace1 = eq.lastIndexOf("-");
				// System.out.println("Location of second minus: "+ minusplace1);
				if (minusplace == 0) {
					if (operator == true) {
						double addans = addition(eq);
						printans(addans);
					} else if (operator1 == true) {
						double multians = multiply(eq);
						printans(multians);
					} else if (operator2 == true) {
						double divians = divide(eq);
						printans(divians);
					} else if (operator3 == true) {
						double subans = subtraction(eq);
						printans(subans);
					} else if (eq.equals("STOP")) {
						break;
					} else {
						System.out.println("NO SUCH OPERATION.");
						continue;
					}
				} else {
					int strlen = eq.length();
					String op1 = eq.substring(0, minusplace);
					String op2 = eq.substring(minusplace1, strlen);
					double convertop1 = Double.parseDouble(op1);
					double convertop2 = Double.parseDouble(op2);
					double subans = convertop1 - convertop2;
					printans(subans);
				}
			}
		}
	}
}
