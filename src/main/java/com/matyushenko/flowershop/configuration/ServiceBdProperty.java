package com.matyushenko.flowershop.configuration;

import lombok.Data;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ServiceBdProperty {

    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://localhost:5432/my_db?useSSL=false";
    private String username = "postgres";
    private String password = "1234";

}
