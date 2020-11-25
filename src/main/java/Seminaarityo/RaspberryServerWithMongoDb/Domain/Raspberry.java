package Seminaarityo.RaspberryServerWithMongoDb.Domain;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;

@Document(collection = "raspberries")
public class Raspberry {

	@Id
	private ObjectId id;
	private String location;
	private String latitude;
	private String longitude;
	private String imageUrl;
	
	private List<TimeStamp>timeStamp;

	public Raspberry() {
		super();
	}

	public Raspberry(ObjectId id, String location, String latitude, String longitude, String imageUrl,
			List<TimeStamp> timeStamp) {
		super();
		this.id = id;
		this.location = location;
		this.latitude = latitude;
		this.longitude = longitude;
		this.imageUrl = imageUrl;
		this.timeStamp = timeStamp;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId objectId) {
		this.id = objectId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public List<TimeStamp> getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(List<TimeStamp> timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "Raspberry [id=" + id + ", location=" + location + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", imageUrl=" + imageUrl + ", timeStamp=" + timeStamp + "]";
	}
	
	
}
