package com.onurgundogdu;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onurgundogdu.model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User("Onur Gündoğdu",30,new Date());
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);

    }
}
