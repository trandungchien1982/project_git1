package app.airline.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class FlightService
 */
@Stateless
@LocalBean
public class FlightService {

	private Integer id = 12345;
	private String from = "Los Angeles";
	private String to = "London";
	private Integer price = 400;
	private Integer numOfSeats = 250;
	private String airplanModel = "Boeing 707";

	/**
	 * Default constructor.
	 */
	public FlightService() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(Integer numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getAirplanModel() {
		return airplanModel;
	}

	public void setAirplanModel(String airplanModel) {
		this.airplanModel = airplanModel;
	}

	@Override
	public String toString() {
		return "FlightService [id=" + id + ", from=" + from + ", to=" + to + ", price=" + price + ", numOfSeats="
				+ numOfSeats + ", airplanModel=" + airplanModel + "]";
	}

}
