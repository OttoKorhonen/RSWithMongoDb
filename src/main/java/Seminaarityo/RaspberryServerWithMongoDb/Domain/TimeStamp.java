package Seminaarityo.RaspberryServerWithMongoDb.Domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "timestamps")
public class TimeStamp {

	@Id
	private String dateId;
	private String timeStamp;
	
	private Raspberry refDateRasp;

	public TimeStamp() {
		super();
		
	}

	public TimeStamp(String dateId, String timeStamp, Raspberry refDateRasp) {
		super();
		this.dateId = dateId;
		this.timeStamp = timeStamp;
		this.refDateRasp = refDateRasp;
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

	public Raspberry getRefDateRasp() {
		return refDateRasp;
	}

	public void setRefDateRasp(Raspberry refDateRasp) {
		this.refDateRasp = refDateRasp;
	}

	@Override
	public String toString() {
		return "TimeStamp [dateId=" + dateId + ", timeStamp=" + timeStamp + ", refDateRasp=" + refDateRasp + "]";
	}
	
	
}
