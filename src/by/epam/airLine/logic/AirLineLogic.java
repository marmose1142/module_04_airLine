package by.epam.airLine.logic;

import java.util.Scanner;

import by.epam.airLine.entity.*;

public class AirLineLogic {
	public String enterFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		if (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}
		return sc.nextLine();
	}

	public double enterFromConsole2(String message) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextDouble();
	}

	public AirLineList searchFlightsDestination(AirLineList airLineList, String destination) {
		AirLineList flightsDestination = new AirLineList();
		for (int i = 0; i < airLineList.getAirLines().size(); i++) {
			if (destination.equals(airLineList.getAirLines().get(i).getDestination())) {
				flightsDestination.addAirLine(airLineList.getAirLines().get(i));
			}
		}

		return flightsDestination;
	}

	public AirLineList searchFlightsDayWeek(AirLineList airLineList, String day) {
		AirLineList flightsDayWeek = new AirLineList();
		for (int i = 0; i < airLineList.getAirLines().size(); i++) {
			if (day.equals(airLineList.getAirLines().get(i).getDay())) {
				flightsDayWeek.addAirLine(airLineList.getAirLines().get(i));
			}
		}

		return flightsDayWeek;
	}

	public AirLineList searchDayTimeDeparture(AirLineList airLineList, AirLineLogic airLineLogic, String day,
			double timeDeparture) {
		AirLineList flightsDayTimeDeparture = new AirLineList(
				airLineLogic.searchFlightsDayWeek(airLineList, day).getAirLines());

		for (int i = 0; i < flightsDayTimeDeparture.getAirLines().size(); i++) {
			if (timeDeparture > flightsDayTimeDeparture.getAirLines().get(i).getTimeDeparture()) {
				flightsDayTimeDeparture.getAirLines().remove(i);
			}

		}

		return flightsDayTimeDeparture;
	}

}
