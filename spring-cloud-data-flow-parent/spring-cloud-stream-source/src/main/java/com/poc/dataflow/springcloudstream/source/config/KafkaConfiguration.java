package com.poc.dataflow.springcloudstream.source.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poc.dataflow.springcloudstream.source.Product;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Configuration
@Slf4j
public class KafkaConfiguration {

    Random random = new Random();

    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1L,"Milk", 1));
    }

    @Bean
    public Supplier<Flux<Product>> sendProduct(){

        return () -> Flux.interval(Duration.ofSeconds(5))
                .map(value -> productList
                        .get((int)((Math.abs(productList.size() - 1)) * Math.random()))).log();
    }

}
