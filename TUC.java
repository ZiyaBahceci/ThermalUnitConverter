package TUC;

import java.util.Scanner;

public class TUCMain2 {
	 static double celciusTo(double fromCelcius) {
		double celciusToKelvin, celciusToFahrenheit, celciusToRankine;
		Scanner sc = new Scanner(System.in);

		if (fromCelcius == 1) {
			System.out.println("Please enter Celcius value:");
			double celciusValue = sc.nextDouble();
			if (celciusValue >= -273.15) {
				celciusToKelvin = celciusValue + 273.15;
				return celciusToKelvin;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}

		} else if (fromCelcius == 2) {
			System.out.println("Please enter Celcius value:");
			double celciusValue = sc.nextDouble();
			if (celciusValue >= -273.15) {
				celciusToFahrenheit = (18 * celciusValue / 10) + 32;
				return celciusToFahrenheit;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}

		} else if (fromCelcius == 3) {
			System.out.println("Please enter Celcius value:");
			double celciusValue = sc.nextDouble();
			if (celciusValue >= -273.15) {
				celciusToRankine = 1.8 * celciusValue + 491.67;
				return celciusToRankine;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}

		} else {
			System.out.println("Please enter a valid number.");
			return 0;
		}
	}

	static double kelvinTo(double fromKelvin) {
		double kelvinToCelcius, kelvinToFahrenheit, kelvinToRankine;
		Scanner sc = new Scanner(System.in);
		
		if (fromKelvin == 1) {
			System.out.println("Please enter Kelvin value:");
			double kelvinValue = sc.nextDouble();
			if (kelvinValue >= 0) {
				kelvinToCelcius = kelvinValue - 273.15;
				return kelvinToCelcius;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		}

		else if (fromKelvin == 2) {
			System.out.println("Please enter Kelvin value: ");
			double kelvinValue = sc.nextDouble();
			if (kelvinValue >= 0) {
				kelvinToFahrenheit = 1.8 * (kelvinValue - 273) + 31.73;
				return kelvinToFahrenheit;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;	
			}
		}

		else if (fromKelvin == 3) {
			System.out.println("Please enter Kelvin value: ");
			double kelvinValue = sc.nextDouble();
			if (kelvinValue >= 0) {
				kelvinToRankine = kelvinValue * 1.8;
				return kelvinToRankine;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		} else {
			System.out.println("Please enter a valid number.");
			return 0;
		}
	}

	static double fahrenheitTo(double fromFahrenheit) {
		double fahrenheitToCelcius, fahrenheitToKelvin, fahrenheitToRankine;
		Scanner sc = new Scanner(System.in);


		if (fromFahrenheit == 1) {
			System.out.println("Please enter Fahrenheit value:");
			double fahrenheitValue = sc.nextDouble();
			if (fahrenheitValue >= -459.67) {
				fahrenheitToCelcius = (fahrenheitValue - 32) / 1.8;
				return fahrenheitToCelcius;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		}

		else if (fromFahrenheit == 2) {
			System.out.println("Please enter Fahrenheit value:");
			double fahrenheitValue = sc.nextDouble();
			if (fahrenheitValue >= -459.67) {
				fahrenheitToKelvin = ((fahrenheitValue - 32) / 1.8) + 273;
				return fahrenheitToKelvin;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		}

		else if (fromFahrenheit == 3) {
			System.out.println("Please enter Fahrenheit value:");
			double fahrenheitValue = sc.nextDouble();
			if (fahrenheitValue >= -459.67) {
				fahrenheitToRankine = fahrenheitValue + 459.67;
				return fahrenheitToRankine;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		}

		else {
			System.out.println("Please enter a valid number.");
			return 0;
		}
	}

	static double rankineTo(double fromRankine) {
		double rankineToCelcius, rankineToKelvin, rankineToFahrenheit;
		Scanner sc = new Scanner(System.in);


		if (fromRankine == 1) {
			System.out.println("Please enter Rankine value");
			double rankineValue = sc.nextDouble();
			if (rankineValue >= 0) {
				rankineToCelcius = (rankineValue - 491.67) * 0.55555555;
				return rankineToCelcius;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		} else if (fromRankine == 2) {
			System.out.println("Please enter Rankine value");
			double rankineValue = sc.nextDouble();
			if (rankineValue >= 0) {
				rankineToKelvin = rankineValue * 1.8;
				return rankineToKelvin;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		}

		else if (fromRankine == 3) {
			System.out.println("Please enter Rankine value");
			double rankineValue = sc.nextDouble();
			if (rankineValue >= 0) {
				rankineToFahrenheit = rankineValue - 459.67;
				return rankineToFahrenheit;
			} else {
				System.out.println("Please enter a value higher than absolute zero.");
				return 0;
			}
		}
		else {
			System.out.println("Please enter a valid number.");
			return 0;
		}
	}

	public static void main(String[] args) {
			System.out.println("Welcome to Temperature Units Converter!");
			Scanner sc = new Scanner(System.in);
			boolean loop = true;
			while (loop) {
			Scanner funcScan = new Scanner(System.in);

			System.out.println("Enter 1 to convert from Celcius, 2 for Kelvin, 3 for Fahrenheit and 4 for Rankine,"
					+ " 5 for details and manual, any other number to exit the program.");

			int unitTo = funcScan.nextInt();
			switch (unitTo) {
			case 1:
				System.out.println("Enter 1 to convert to Kelvin, 2 to convert to Fahrenheit and  3 to convert to Rankine.");
				Double fromCelcius = sc.nextDouble();
				Double x = celciusTo(fromCelcius); 
				System.out.println("The conversion is " + x + " .");
				break;
			case 2:
				System.out.println("Enter 1 to convert to Celcius, 2 to convert to Fahrenheit and  3 to convert to Rankine.");
				Double fromKelvin = sc.nextDouble();
				Double y = kelvinTo(fromKelvin); 
				System.out.println("The conversion is " + y + " .");
				break;
			case 3:
				System.out.println("Enter 1 to convert to Celcius, 2 to convert to Kelvin and  3 to convert to Rankine.");
				Double fromFahrenheit = sc.nextDouble();
				Double z = fahrenheitTo(fromFahrenheit); 
				System.out.println("The conversion is " + z + " .");
				break;
			case 4:
				System.out.println("Enter 1 to convert to Celcius, 2 to convert to Kelvin and  3 to convert to Fahrenheit.");
				Double fromRankine = sc.nextDouble();
				Double t = rankineTo(fromRankine); 
				System.out.println("The conversion is " + t + " .");
				break;
			case 5:
				System.out.println("This app was made by Ziya Bahçeci for educational purposes. You can use ziya2.bahceci@hotmail.com"
						+ " for contact. \nAbsolute zero points are -273.15 for Celcius, 0 for Kelvin, -459.67 for Fahrenheit and"
						+ " 0 for Rankine, please enter values higher than absolute zero to get a correct convertion.");
				
				break;
			default:
				System.out.println("Exiting...");
				loop = false;
				break;
			}
		}

	}
}
