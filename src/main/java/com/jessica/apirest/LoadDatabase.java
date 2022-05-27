package com.jessica.apirest;

import com.jessica.apirest.entities.Employee;
import com.jessica.apirest.entities.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
//            log.info("Preloading " + repository.save(new Employee("Jessica Aquino", "Data scientist")));
//            log.info("Preloading " + repository.save(new Employee("Andrea Torrez", "Analyst")));
            log.info("Preloading " + employeeRepository.save(new Employee("Jessica", "Aquino", "Data scientist")));
            log.info("Preloading " + employeeRepository.save(new Employee("Andrea", "Torrez", "Analyst")));
            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });

        };
    }
}
