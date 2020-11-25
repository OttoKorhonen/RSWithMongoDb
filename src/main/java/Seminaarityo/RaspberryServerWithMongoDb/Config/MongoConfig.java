package Seminaarityo.RaspberryServerWithMongoDb.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "Seminaarityo.RaspberryServerWithMongoDb.RaspberryRepository")
public class MongoConfig extends AbstractMongoClientConfiguration {

	@Override
	protected String getDatabaseName() {
		return "raspberrydb";
	}

	@Bean
	@Override
	MongoClient mongoClient = new MongoClient("localhost", 27017){
		return new MongoClient("localhost", 27017);
	}
}
