package com.tarento.JDBCDemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyJDBC {
    public static void main(String[] args) throws SQLException {

        Object var1= Enroll();
        System.out.println(var1);

        Object var2= AssessmentsTakenByUser();
        System.out.println(var2);

        Object var3= MarksForEveryAssessment();
        System.out.println(var3);

        Object var4= MaxNumberOfQuestions();
        System.out.println(var4);

    }

    public static Connection connection(){
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assessment_schema", "root", "Welcome@123");
            return connection;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static Object Enroll(){
        try {
            List<Object> result1 = new ArrayList();
            Object p;
            Connection c1 = connection();
            PreparedStatement resultSet = c1.prepareStatement("select * from user");
            ResultSet rs = resultSet.executeQuery();
            while (rs.next()) {
              p = (rs.getString("user_name"));
              result1.add(p);
            }
            return result1;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
     return null;
    }
    public static Object AssessmentsTakenByUser(){
        try {
            List<Object> result2 = new ArrayList();
            Object p=0;
            Connection c1 = connection();
            PreparedStatement resultSet = c1.prepareStatement("select user.user_id, user_name, assessment.assessment_id, assessment_name from user inner join score on user.user_id=score.user_id inner join assessment on score.assessment_id=assessment.assessment_id where user.user_id=1");
            ResultSet rs = resultSet.executeQuery();
            while (rs.next()) {
                p = (rs.getString("user_id")+" "+rs.getString("user_name")+" "+rs.getString("assessment_id")+" "+rs.getString("assessment_name"));
                result2.add(p);

            }
            return result2;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static Object MarksForEveryAssessment(){
        try {
            List<Object> result3 = new ArrayList();
            Object p=0;
            Connection c1 = connection();
            PreparedStatement resultSet = c1.prepareStatement("select user.user_id, user.user_name, assessment.assessment_name,score.score_value from user " +
                    "inner join score on user.user_id=score.user_id inner join assessment " +
                    "on score.assessment_id=assessment.assessment_id where user.user_id=2");
            ResultSet rs = resultSet.executeQuery();
            while (rs.next()) {
                p = (rs.getString("user_id")+" "+rs.getString("user_name")+" "+rs.getString("assessment_name")+" "+rs.getString("score_value"));
                result3.add(p);

            }
            return result3;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
    public static Object MaxNumberOfQuestions(){
        try {
            List<Object> result4 = new ArrayList();
            Object p=0;
            Connection c1 = connection();
            PreparedStatement resultSet = c1.prepareStatement("SELECT assessment_id,assessment_name,max_score,max(no_of_questions) FROM assessment_schema.assessment group by assessment_id");
            ResultSet rs = resultSet.executeQuery();
            while (rs.next()) {
                p = (rs.getString("assessment_id")+" "+rs.getString("assessment_name")+" "+rs.getString("max_score")+" "+rs.getString("no_of_questions"));
                result4.add(p);

            }
            return result4;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

}
