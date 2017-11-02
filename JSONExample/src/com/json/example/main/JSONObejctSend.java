package com.json.example.main;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

@WebServlet("/JSONObjectSend.do")
public class JSONObejctSend extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        JSONObject jsonObject = new JSONObject();
        
        jsonObject.put("name", "kimdaehyeok");
        jsonObject.put("age", "27");
        
        String jsonString = jsonObject.toJSONString();
        
        request.setAttribute("intro", "My introduce : ");
        request.setAttribute("User", jsonString);
        request.setAttribute("UserObject", jsonObject);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/jsp/receiveJSONFromServer.jsp");
        requestDispatcher.forward(request, response);
    }
}
