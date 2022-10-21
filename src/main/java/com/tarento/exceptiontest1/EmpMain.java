package com.tarento.exceptiontest1;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmpMain {
    public static void main(String[] args) throws Exception{

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File myObj = new File("employees.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                String carAsString = objectMapper.writeValueAsString(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        List<Employee> listOfStrings
                = new ArrayList<>();
        Scanner sc= new Scanner(new File("/home/pathiknandi/ProjectData/pathik/employees.txt"));
        while (sc.hasNextLine()){
            String line =sc.nextLine();
            listOfStrings.add(objectMapper.readValue(line,Employee.class));
        }

        System.out.println("Before soting:"+listOfStrings);

        Collections.sort(listOfStrings);
        System.out.println("After sorting:"+listOfStrings);
    }
}