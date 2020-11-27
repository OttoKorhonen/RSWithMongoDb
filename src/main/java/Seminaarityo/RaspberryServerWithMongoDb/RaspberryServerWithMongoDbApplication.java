package Seminaarityo.RaspberryServerWithMongoDb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import Seminaarityo.RaspberryServerWithMongoDb.Domain.Raspberry;
import Seminaarityo.RaspberryServerWithMongoDb.Domain.RaspberryRepository;

@EnableMongoRepositories(basePackageClasses = RaspberryRepository.class)
@SpringBootApplication
public class RaspberryServerWithMongoDbApplication implements CommandLineRunner{
	
	@Autowired
	private RaspberryRepository raspRepo;

	public static void main(String[] args) {
		SpringApplication.run(RaspberryServerWithMongoDbApplication.class, args);
		
	}
		@Override
		public void run(String... args) throws Exception {
			
			//raspRepo.deleteAll();
			
			for(Raspberry raspberry : raspRepo.findAll()) {
				System.out.println(raspberry);
			}
		}

}
