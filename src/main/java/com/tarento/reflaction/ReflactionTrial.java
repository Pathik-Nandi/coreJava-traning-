package com.tarento.reflaction;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflactionTrial {
        public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
            // Create Class object for MetaData.class
            MetaData metaData = new MetaData();
            Class ClassObjVar = metaData.getClass();

            // Get the metadata of all the fields of the class MetaData
            Field[] field1= ClassObjVar.getDeclaredFields();

            // Print name, datatype, access modifiers and values of the variable of the specified class
            for(Field field : field1) {
                System.out.println("Variable name : "+field.getName());
                System.out.println("Datatypes of the variable :"+field.getType());

                int AccessModifiers = field.getModifiers();
                System.out.println("Access Modifiers of the variable : "+ Modifier.toString(AccessModifiers));
                System.out.println("Value of the variable : "+field.get(ClassObjVar));
                System.out.println();
                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *") ;
            }
        }
}
