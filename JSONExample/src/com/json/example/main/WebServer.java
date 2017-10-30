package com.json.example.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@WebServlet("/main.do")
public class WebServer extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
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
        
        System.out.println("get jsonData : " + jsonData);
        System.out.println("get Name : " + jsonObject.get("name") );
        System.out.println("get age : " + jsonObject.get("age") );
        System.out.println("get city : " + jsonObject.get("city") );
    }
}
