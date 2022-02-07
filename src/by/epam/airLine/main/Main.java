package by.epam.airLine.main;

import by.epam.airLine.entity.AirLine;
import by.epam.airLine.entity.AirLineList;
import by.epam.airLine.logic.AirLineLogic;
import by.epam.airLine.view.*;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString.Создать второй класс агрегирующий массив типа Airline, с подходящими конструктарами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Airline:пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a)список рейсов для заданного пункта назначения;
 * б)список рейсов для заданного дня недели.
 * в)список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Main {

	public static void main(String[] args) {
		AirLineList airLineList = new AirLineList();
		airLineList.addAirLine(new AirLine("new york-moscow", 123, "boeing", 12.42, "monday"));
		airLineList.addAirLine(new AirLine("london-moscow", 122, "boeing", 2.42, "sunday"));
		airLineList.addAirLine(new AirLine("paris-moscow", 124, "boeing", 17.42, "monday"));
		airLineList.addAirLine(new AirLine("minsk-moscow", 121, "boeing", 18.42, "sunday"));
		airLineList.addAirLine(new AirLine("new york-moscow", 120, "boeing", 1.42, "monday"));
		AirLineView airLineView = new AirLineView();
		AirLineLogic airLineLogic = new AirLineLogic();

		airLineView.printAirLineView(airLineList);
		airLineView.printAirLineView(airLineLogic.searchFlightsDestination(airLineList,
				airLineLogic.enterFromConsole("Please, enter your destination")));
		airLineView.printAirLineView(airLineLogic.searchFlightsDayWeek(airLineList,
				airLineLogic.enterFromConsole("Please, enter your day")));

		airLineView.printAirLineView(airLineLogic.searchDayTimeDeparture(airLineList, airLineLogic,
				airLineLogic.enterFromConsole("Please, enter your day"),
				airLineLogic.enterFromConsole2("Please, enter your time")));

	}

}
