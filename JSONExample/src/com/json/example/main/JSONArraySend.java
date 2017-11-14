package com.json.example.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/JSONArraySend.do")
public class JSONArraySend extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        JSONArray jsonArray = new JSONArray();
        
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name", "kimdaehyeok");
        jsonObject1.put("gender", "man");
        
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name", "amy");
        jsonObject2.put("gender", "woman");
        
        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);
        
//        jsonArray.toJSONString();

        response.setContentType("application/json");
        request.setAttribute("users", jsonArray);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/jsp/receiveJSONArrayFromServer.jsp");
        requestDispatcher.forward(request, response);
    }
}
