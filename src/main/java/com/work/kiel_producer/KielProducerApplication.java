package com.work.kiel_producer;

import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

// import org.apache.commons.logging.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.work.kiel_producer.producer.HelloProducer;

@SpringBootApplication
public class KielProducerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(KielProducerApplication.class, args);
    }

    @Autowired
    private HelloProducer producer;

    @Override
    public void run(String... args) throws Exception {

		Logger logger = Logger.getLogger("Here");
		logger.info("Got Here");
        producer.sendHello(" Kolawole Ajayi ");
    }

}
