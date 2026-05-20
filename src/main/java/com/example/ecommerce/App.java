package com.example.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.h2.security.SHA256;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);

        String inputString = "s3cr37";
        byte[] key         = inputString.getBytes();

        SHA256.getHMAC(key, message);  // Noncompliant

        //TODO big security flaw

//TODO another big issue
    }
}





