package Seminaarityo.RaspberryServerWithMongoDb.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "timestamps")
public class TimeStamp {

	@Id
	private String dateId;
	private String timeStamp;
	private int foundDevices;

	public TimeStamp() {
		super();
	}

	public TimeStamp(String dateId, String timeStamp, int foundDevices) {
		super();
		this.dateId = dateId;
		this.timeStamp = timeStamp;
		this.foundDevices = foundDevices;
	}

	public String getDateId() {
		return dateId;
	}

	public void setDateId(String dateId) {
		this.dateId = dateId;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public int getFoundDevices() {
		return foundDevices;
	}

	public void setFoundDevices(int foundDevices) {
		this.foundDevices = foundDevices;
	}

	@Override
	public String toString() {
		return "TimeStamp [dateId=" + dateId + ", timeStamp=" + timeStamp + "]";
	}
	
	
}
