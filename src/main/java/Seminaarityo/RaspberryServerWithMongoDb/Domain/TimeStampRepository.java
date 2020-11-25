package Seminaarityo.RaspberryServerWithMongoDb.Domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TimeStampRepository extends MongoRepository<TimeStamp, String>{
	//List<TimeStamp>findByTimeStamp(String timeStamp);
	
}
