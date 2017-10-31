package com.json.example.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@WebServlet("/JSONArray.do")
public class JSONArrayServer extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String jsonData = request.getParameter("param");
        
        JSONParser parser = new JSONParser();
        
        Object object = null;
        
        try
        {
            object = parser.parse(jsonData);
        }
        catch (ParseException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        JSONObject jsonObject = (JSONObject) object;
        
        System.out.println("* get jsonData : " + jsonData);
        System.out.println("* get Name : " + jsonObject.get("name"));
        System.out.println("* get age : " + jsonObject.get("age"));
        System.out.println("* get cars : " + jsonObject.get("cars"));
        System.out.println();
       
        JSONArray jsonArray = (JSONArray) jsonObject.get("cars");
        
        for (int i = 0; i < jsonArray.size(); i++)
        {
            JSONObject jsonObj = (JSONObject) jsonArray.get(i);
            System.out.println("************************");
            System.out.println("Full JSON : " + jsonObj);
            System.out.println("Get Name : " + jsonObj.get("name"));
            System.out.println("Get Models : " + jsonObj.get("models"));
            System.out.println("************************");
            System.out.println();
        }
        
        
    }
}
