package Seminaarityo.RaspberryServerWithMongoDb.Domain;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaspberryRepository extends MongoRepository<Raspberry, String>{
	List<Raspberry>findByLocation(String location);
	Optional<Raspberry> findById(String id);

	Raspberry findById(ObjectId id);
}
