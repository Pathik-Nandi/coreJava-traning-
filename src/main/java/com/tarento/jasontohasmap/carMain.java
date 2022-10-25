package com.tarento.jasontohasmap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class carMain {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        File file=new File("/home/pathiknandi/ProjectData/pathik/src/main/java/com/tarento/jasontohasmap/car.txt");


        ArrayList<Map> map = new ArrayList<>();

        System.out.println("Enter number of data you want:");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("Enter Car Name");
            String name=sc.next();

            System.out.println("Enter Car price:");
            int price=sc.nextInt();

            System.out.println("Enter the car color:");
            String color= sc.next();
            map.add(new Map(name,price,color));

        }

        // ---------converting Arraylist to jasonArray-----------------------------
        /*JSONArray jsonArray = new JSONArray();
        for (int i=0; i < car.size(); i++) {
            jsonArray.add(car.get(i));
        }
        System.out.println(jsonArray); */

        //-----------converting to Array to jasonObject------------------
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
//        String JSONObject = gson.toJson(car);
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(map);
        System.out.println("--------------Coverting the arrayList to Gason formate------------ ");
        System.out.println(prettyJson);

        File file1=new File("/home/pathiknandi/ProjectData/pathik/src/main/java/com/tarento/jasontohasmap/car1.txt");
        try {
            if (file1.createNewFile()){
                System.out.println("File created"+file1.createNewFile());
            }else {
                System.out.println("File already exit");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter file2 = new FileWriter("/home/pathiknandi/ProjectData/pathik/src/main/java/com/tarento/jasontohasmap/car1.txt")) {
            //We can write any JSONArray or JSONObject instance to the file
            file2.write(prettyJson);
            file2.flush();
            System.out.println("\n ----------------------Reading the jason file to HasMap---------------\n ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        File fileObj = new File("/home/pathiknandi/ProjectData/pathik/src/main/java/com/tarento/jasontohasmap/car.txt");
        Scanner myReader = new Scanner(fileObj);
        while (myReader.hasNextLine()) {
            String studentJsonData = myReader.nextLine();
            try {
//                 Map<String,Integer> studentMapData = mapper.readValue(studentJsonData, Map.class);
                 HashMap<String,Object> userdata= mapper.readValue(studentJsonData, new TypeReference<HashMap<String, Object>>() {
                });
                System.out.println(userdata);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

