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
        
        System.out.println(jsonData);
        
//        JSONParser parser = new JSONParser();
//        
//        Object obj = null;
//
//        try
//        {
//            obj = parser.parse(jsonData);
//        }
//        catch (ParseException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        
//        JSONObject jsonObj = (JSONObject) obj;
//        
//        System.out.println("get Name : " + jsonObj.get("name") );
    }
}
