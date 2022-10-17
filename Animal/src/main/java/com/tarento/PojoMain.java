package com.tarento;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class PojoMain {
    public static void main(String[] args) throws Exception{
        Pojo pojoobj = new Pojo(101, "pathik", "this is demo session",new subpojo("pathik", "cse"));
        ObjectMapper objectMapper = new ObjectMapper();
        String carAsString = objectMapper.writeValueAsString(pojoobj);
        System.out.println(carAsString);
        Pojo pojo= objectMapper.readValue(carAsString, Pojo.class);
        System.out.println(pojo);

    }
}
