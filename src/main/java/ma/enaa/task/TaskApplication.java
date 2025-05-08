package ma.enaa.task;

import ma.enaa.task.entities.Product;
import ma.enaa.task.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TaskApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {

        SpringApplication.run(TaskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("idriss","informatique",99.1,new Date()));
        productRepository.save(new Product("Ali","pc",111.3,new Date()));
        productRepository.save(new Product("ahemd","SVT",919.1,new Date()));

    }
}
