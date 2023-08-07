package com.poc.dataflow.springcloudstream.sink.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poc.dataflow.springcloudstream.sink.domain.Product;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
@Slf4j
public class KafkaConfiguration {


    @Bean
    public Consumer<Product> productConsumer(){

        //Do something with product
        return (product) -> log.info("Consumer Received : " + product);
    }

}
