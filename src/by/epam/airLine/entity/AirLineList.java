package by.epam.airLine.entity;

import java.util.ArrayList;
import java.util.List;

public class AirLineList {
	List<AirLine> airLines = new ArrayList<>();

	public AirLineList() {

	}

	public AirLineList(List<AirLine> airLines) {
		this.airLines = airLines;
	}

	public void addAirLine(AirLine airLine) {
		if (airLines == null) {
			airLines = new ArrayList<>();
		}
		airLines.add(airLine);
	}

	public List<AirLine> getAirLines() {
		return airLines;
	}

	public void setAirLines(List<AirLine> airLines) {
		this.airLines = airLines;
	}

	@Override
	public String toString() {
		return "AirLineList [airLines=" + airLines + "]";
	}

}
