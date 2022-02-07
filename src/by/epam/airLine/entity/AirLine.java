package by.epam.airLine.entity;

import java.util.Objects;

public class AirLine {
	private String destination;
	private int numberFlight;
	private String typeAircraft;
	private double timeDeparture;
	private String day;

	public AirLine() {

	}

	public AirLine(String destination, int numberFlight, String typeAircraft, double timeDeparture, String day) {
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.typeAircraft = typeAircraft;
		this.timeDeparture = timeDeparture;
		this.day = day;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public void setNumberFlight(int numberFlight) {
		this.numberFlight = numberFlight;
	}

	public String getTypeAircraft() {
		return typeAircraft;
	}

	public void setTypeAircraft(String typeAircraft) {
		this.typeAircraft = typeAircraft;
	}

	public double getTimeDeparture() {
		return timeDeparture;
	}

	public void setTimeDeparture(double timeDeparture) {
		this.timeDeparture = timeDeparture;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, destination, numberFlight, timeDeparture, typeAircraft);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirLine other = (AirLine) obj;
		return Objects.equals(day, other.day) && Objects.equals(destination, other.destination)
				&& numberFlight == other.numberFlight
				&& Double.doubleToLongBits(timeDeparture) == Double.doubleToLongBits(other.timeDeparture)
				&& Objects.equals(typeAircraft, other.typeAircraft);
	}

	@Override
	public String toString() {
		return "AirLine [destination=" + destination + ", numberFlight=" + numberFlight + ", typeAircraft="
				+ typeAircraft + ", timeDeparture=" + timeDeparture + ", day=" + day + "]" + "\r";
	}

}
