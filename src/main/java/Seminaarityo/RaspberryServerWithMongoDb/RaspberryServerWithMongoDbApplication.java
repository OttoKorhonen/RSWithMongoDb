package Seminaarityo.RaspberryServerWithMongoDb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

@SpringBootApplication
public class RaspberryServerWithMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(RaspberryServerWithMongoDbApplication.class, args);
		MongoClient mongoClient = MongoClients.create();

		
		//MongoClient mongoClient = new MongoClient("localhost", 27017);
//		MongoClient mongoClient = MongoClients.create();
//		//MongoClient mongoClient = new MongoClient("localhost", 27017);
//		MongoDatabase MongoDataBase = mongoClient.getDatabase("raspberrydb");
//		System.out.print("Application good to go!");
//		mongoClient.listDatabaseNames();
//		MongoDataBase.listCollectionNames();
//		
	}

}
