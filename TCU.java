package TCU;

import java.util.Scanner;

public class TCU {
	static void creditsziya() {
		System.out.println(
				"Made by Ziya Bahçeci for educational purposes. For contact use ziya.bahceci@bahcesehir.edu.tr");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the temperature units converter!");
		System.out.println("Absolute zero equals: 0K, -273.15C, -459.67F and 0R");
		for (int x = 0; 0 < 9999; x++) {
			System.out.println("Choose the unit to convert (needs to be above absolute zero)");
			System.out.println(
					"1 for Kelvin, 2 for Celcius, 3 for Fahrenheit, 4 for Rankine, any integer else for credits");

			int Temperature = new Scanner(System.in).nextInt();
			switch (Temperature) {
			case 1:
				System.out.println("Choose unit to be converted into");
				System.out.println("1 for Celcius, 2 for Fahrenheit, 3 for Rankine");
				int kelvinTo = new Scanner(System.in).nextInt();
				switch (kelvinTo) {

				case 1:
					System.out.println("Kelvin to Celcius");
					double KC;
					System.out.println("Enter amount of temperature in Kelvin (decimal)");
					Scanner kelvinToCelcius = new Scanner(System.in);
					double KtC = kelvinToCelcius.nextDouble();
					KC = KtC - 273.15;
					if (KtC >= 0) {
						System.out.println(KtC + " Kelvins equal " + KC + " Celcius.");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 2:
					System.out.println("Kelvin to Fahrenheit");
					float KF;
					System.out.println("Enter amount of temperature in Kelvin (decimal)");
					Scanner kelvinToFahrenheit = new Scanner(System.in);
					float KtF = kelvinToFahrenheit.nextFloat();
					KF = (float) 9 / 5 * (KtF - 273) + 32;
					if (KtF >= 0) {
						System.out.println(KtF + " Kelvins Equal " + KF + " Fahrenheit");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 3:
					System.out.println("Kelvin to Rankine");
					double KR;
					System.out.println("Enter amount of temperature in Kelvin (decimal)");
					Scanner kelvinToRankine = new Scanner(System.in);
					double KtR = kelvinToRankine.nextDouble();
					KR = KtR * 1.8;
					if (KtR >= 0) {
						System.out.println(KtR + " Kelvins equal " + KR + " Rankine");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}
				default:
					System.out.println("Wrong Imput");
					break;

				}
				break; // end of Kelvin

			case 2:
				System.out.println("Choose unit to be converted into");
				System.out.println("1 for Kelvin, 2 for Fahrenheit, 3 for Rankine");
				int celciusTo = new Scanner(System.in).nextInt();
				switch (celciusTo) {
				case 1:
					System.out.println("Celcius to Kelvin");
					double CK;
					System.out.println("Enter amount of temperature in Celcius (decimal)");
					Scanner celciusToKelvin = new Scanner(System.in);
					double CtK = celciusToKelvin.nextDouble();
					CK = CtK + 273.15;
					if (CtK >= -273.15) {
						System.out.println(CtK + " Celcius equal " + CK + " Kelvins");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 2:
					System.out.println("Celcius to Fahrenheit");
					float CF;
					System.out.println("Enter amount of temperature in Celcius (decimal)");
					Scanner celciusToFahrenheit = new Scanner(System.in);
					float CtF = celciusToFahrenheit.nextFloat();
					CF = (float) (18 * CtF / 10) + 32;
					if (CtF >= -273.15) {
						System.out.println(CtF + " Celcius equal " + CF + " Fahrenheit");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 3:
					System.out.println("Celcius to Rankine");
					double CR;
					System.out.println("Enter amount of temperature in Celcius (decimal)");
					Scanner celciusToRankine = new Scanner(System.in);
					double CtR = celciusToRankine.nextDouble();
					CR = 1.8 * CtR + 491.67;
					if (CtR >= -273.15) {
						System.out.println(CtR + " Celcius equal " + CR + " Rankine");
						break;
					} else {

					}
					System.out.println("Please enter a value bigger than the absolute zero");
					break;

				default:
					System.out.println("Wrong Imput");
					break;

				}
				break; // end or Celcius

			case 3:
				System.out.println("Choose unit to be converted into");
				System.out.println("1 for Kelvin, 2 for Celcius, 3 for Rankine");
				int fahrenheitTo = new Scanner(System.in).nextInt();
				switch (fahrenheitTo) {
				case 1:
					System.out.println("Fahrenheit to Kelvin");
					double FK;
					System.out.println("Enter amount of temperature in Fahrenheit (decimal)");
					Scanner fahrenheitToKelvin = new Scanner(System.in);
					double FtK = fahrenheitToKelvin.nextDouble();
					FK = ((FtK - 32) / 1.8) + 273;
					if (FtK >= -459.67) {
						System.out.println(FtK + " Fahrenheits equal " + FK + " Kelvins");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 2:
					System.out.println("Fahrenheit to Celcius");
					double FC;
					System.out.println("Enter amount of temperature in Fahrenheit (decimal)");
					Scanner fahrenheitToCelcius = new Scanner(System.in);
					double FtC = fahrenheitToCelcius.nextDouble();
					FC = ((FtC - 32) / 1.8);
					if (FtC >= -459.67) {
						System.out.println(FtC + " Fahrenheits equal " + FC + " Celcius");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 3:
					System.out.println("Fahrenheit to Rankine");
					double FR;
					System.out.println("Enter amount of temperature in Fahrenheit (decimal)");
					Scanner fahrenheitToRankine = new Scanner(System.in);
					double FtR = fahrenheitToRankine.nextDouble();
					FR = FtR + 459.67;
					if (FtR >= -459.67) {
						System.out.println(FtR + " Fahrenheits equal " + FR + " Rankine");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}
				default:
					System.out.println("Wrong Input");
					break;

				}
				break; // end of fahrenheit

			case 4:
				System.out.println("Choose unit to be converted into");
				System.out.println("1 for Kelvin, 2 for Celcius, 3 for Fahrenheit");
				int rankineTo = new Scanner(System.in).nextInt();
				switch (rankineTo) {

				case 1:
					System.out.println("Rankine to Kelvin");
					double RK;
					System.out.println("Enter amount of temperature in Rankine (decimal)");
					Scanner rankineToKelvin = new Scanner(System.in);
					double RtK = rankineToKelvin.nextDouble();
					RK = RtK / 1.8;
					if (RtK >= 0) {
						System.out.println(RtK + " Rankine equal " + RK + " Kelvins");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 2:
					System.out.println("Rankine to Celcius");
					double RC;
					System.out.println("Enter amount of temperature in Rankine (decimal)");
					Scanner rankineToCelcius = new Scanner(System.in);
					double RtC = rankineToCelcius.nextDouble();
					RC = (RtC - 491.67) * 0.55555555;
					if (RtC >= 0) {
						System.out.println(RtC + " Rankines equal " + RC + " Celcius");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				case 3:
					System.out.println("Rankine to Fahrenheit");
					double RF;
					System.out.println("Enter amount of temperature in Rankine (decimal)");
					Scanner rankineToFahrenheit = new Scanner(System.in);
					double RtF = rankineToFahrenheit.nextDouble();
					RF = RtF - 459.67;
					if (RtF >= 0) {
						System.out.println(RtF + " Rankines equal " + RF + " Fahrenheits");
						break;
					} else {
						System.out.println("Please enter a value bigger than the absolute zero");
						break;
					}

				default:
					System.out.println("Wrong Input");
					break;

				}
				break; // end of Rankine

			default:
				creditsziya();
				break;
			} // end of case 1-4
		} // end of for loop
	} // end of main

}
