package Seminaarityo.RaspberryServerWithMongoDb.Domain.Web;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Seminaarityo.RaspberryServerWithMongoDb.Domain.Raspberry;
import Seminaarityo.RaspberryServerWithMongoDb.Domain.RaspberryRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/raspberrydb")
public class RestApiController {

	@Autowired
	RaspberryRepository raspRepo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Raspberry> getAllRaspberries() {
		return raspRepo.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Raspberry getRaspberryByLocation(@PathVariable("id") ObjectId id) {
		return raspRepo.findById(id);
	}

	@RequestMapping(value = "/raspberries/{objectId}", method = RequestMethod.PUT)
	Raspberry modifyRaspberryById(@PathVariable ObjectId id, @RequestBody Raspberry raspberry) {
		return raspRepo.findById(id);
			
		//raspRepo.save(raspberry);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Raspberry createRaspberry(@RequestBody Raspberry raspberry) {
		raspberry.setId(ObjectId.get());
		raspRepo.save(raspberry);
		return raspberry;
	}

}
