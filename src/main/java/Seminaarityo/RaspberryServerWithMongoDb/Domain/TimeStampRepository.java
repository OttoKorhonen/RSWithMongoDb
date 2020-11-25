package Seminaarityo.RaspberryServerWithMongoDb.Domain;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface TimeStampRepository extends MongoRepository<TimeStamp, String>{
	List<TimeStamp>findByTimeStamp(String timeStamp);
	
}
