package TUC;

import java.util.Scanner;

public class TUCMain {

	static void celciusTo() {
		double celciusToKelvin, celciusToFahrenheit, celciusToRankine;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to convert to Kelvin, 2 to convert to Fahrenheit and  3 to convert to Rankine.");
		int fromCelcius = sc.nextInt();

		if (fromCelcius == 1) {
			System.out.println("Please enter Celcius value:");
			double celciusValue = sc.nextDouble();
			if (celciusValue >= -273.15) {
				celciusToKelvin = celciusValue + 273.15;
				System.out.println("The kelvin value is: " + celciusToKelvin);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}

		} else if (fromCelcius == 2) {
			System.out.println("Please enter Celcius value:");
			double celciusValue = sc.nextDouble();
			if (celciusValue >= -273.15) {
				celciusToFahrenheit = (18 * celciusValue / 10) + 32;
				System.out.println("The Fahrenheit value is: " + celciusToFahrenheit);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}

		} else if (fromCelcius == 3) {
			System.out.println("Please enter Celcius value:");
			double celciusValue = sc.nextDouble();
			if (celciusValue >= -273.15) {
				celciusToRankine = 1.8 * celciusValue + 491.67;
				System.out.println("The Rankine value is: " + celciusToRankine);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}

		} else {
			System.out.println("Please enter a valid number.");
		}
	}

	static void kelvinTo() {
		double kelvinToCelcius, kelvinToFahrenheit, kelvinToRankine;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to convert to Celcius, 2 to convert to Fahrenheit and 3 to convert to Rankine.");
		int fromKelvin = sc.nextInt();

		if (fromKelvin == 1) {
			System.out.println("Please enter Kelvin value:");
			double kelvinValue = sc.nextDouble();
			if (kelvinValue >= 0) {
				kelvinToCelcius = kelvinValue - 273.15;
				System.out.println("The Celcius value is: " + kelvinToCelcius);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		}

		else if (fromKelvin == 2) {
			System.out.println("Please enter Kelvin value: ");
			double kelvinValue = sc.nextDouble();
			if (kelvinValue >= 0) {
				kelvinToFahrenheit = 1.8 * (kelvinValue - 273) + 31.73;
				System.out.println("Fahrenheit value is: " + kelvinToFahrenheit);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		}

		else if (fromKelvin == 3) {
			System.out.println("Please enter Kelvin value: ");
			double kelvinValue = sc.nextDouble();
			if (kelvinValue >= 0) {
				kelvinToRankine = kelvinValue * 1.8;
				System.out.println("Rankine value is: " + kelvinToRankine);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		} else {
			System.out.println("Please enter a valid number.");
		}
	}

	static void fahrenheitTo() {
		double fahrenheitToCelcius, fahrenheitToKelvin, fahrenheitToRankine;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to convert to Celcius, 2 to convert to Kelvin and 3 to convert to Rankine.");
		int fromFahrenheit = sc.nextInt();

		if (fromFahrenheit == 1) {
			System.out.println("Please enter Fahrenheit value:");
			double fahrenheitValue = sc.nextDouble();
			if (fahrenheitValue >= -459.67) {
				fahrenheitToCelcius = (fahrenheitValue - 32) / 1.8;
				System.out.println("Celcius value is: " + fahrenheitToCelcius);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		}

		else if (fromFahrenheit == 2) {
			System.out.println("Please enter Fahrenheit value:");
			double fahrenheitValue = sc.nextDouble();
			if (fahrenheitValue >= -459.67) {
				fahrenheitToKelvin = ((fahrenheitValue - 32) / 1.8) + 273;
				System.out.println("Kelvin value is: " + fahrenheitToKelvin);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		}

		else if (fromFahrenheit == 3) {
			System.out.println("Please enter Fahrenheit value:");
			double fahrenheitValue = sc.nextDouble();
			if (fahrenheitValue >= -459.67) {
				fahrenheitToRankine = fahrenheitValue + 459.67;
				System.out.println("Rankine value is: " + fahrenheitToRankine);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		}

		else {
			System.out.println("Please enter a valid number.");
		}
	}

	static void rankineTo() {
		double rankineToCelcius, rankineToKelvin, rankineToFahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to convert to Celcius, 2 to convert to Kelvin and  3 to convert to Fahrenheit.");
		int fromRankine = sc.nextInt();

		if (fromRankine == 1) {
			System.out.println("Please enter Rankine value");
			double rankineValue = sc.nextDouble();
			if (rankineValue >= 0) {
				rankineToCelcius = (rankineValue - 491.67) * 0.55555555;
				System.out.println("Celcius value is: " + rankineToCelcius);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		} else if (fromRankine == 2) {
			System.out.println("Please enter Rankine value");
			double rankineValue = sc.nextDouble();
			if (rankineValue >= 0) {
				rankineToKelvin = rankineValue * 1.8;
				System.out.println("Kelvin value is: " + rankineToKelvin);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
			}
		}

		else if (fromRankine == 3) {
			System.out.println("Please enter Rankine value");
			double rankineValue = sc.nextDouble();
			if (rankineValue >= 0) {
				rankineToFahrenheit = rankineValue - 459.67;
				System.out.println("Fahrenheit value is: " + rankineToFahrenheit);
			} else {
				System.out.println("Please enter a value higher than absolute zero.");

			}
		}
		else {
			System.out.println("Please enter a valid number.");
		}
	}

	public static void main(String[] args) {
			System.out.println("Welcome to Temperature Units Converter!");
		
			while (true) {
			Scanner funcScan = new Scanner(System.in);

			System.out.println("Enter 1 to convert from Celcius, 2 for Kelvin, 3 for Fahrenheit and 4 for Rankine,"
					+ " any other number to exit the program.");

			int unitTo = funcScan.nextInt();
			switch (unitTo) {
			case 1:
				celciusTo();
				break;
			case 2:
				kelvinTo();
				break;
			case 3:
				fahrenheitTo();
				break;
			case 4:
				rankineTo();
				break;
			default:
				System.out.println("Please enter a valid number.");
				break;
			}
		}

	}
}
