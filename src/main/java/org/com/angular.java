package org.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cal")
public class angular extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("expression");






































        //        BufferedReader reader = req.getReader();
//        StringBuilder sb = new StringBuilder();
//        String line;
//        while ((line = reader.readLine()) != null) {
//            sb.append(line);
//        }
//        String jsonString = sb.toString();
//
//        // Parse the JSON using Gson library
//        Gson gson = new Gson();
//        ExpressionRequest expressionRequest = gson.fromJson(jsonString, ExpressionRequest.class);
//
//        // Extract the expression from the request
//        String expression = expressionRequest.getExpression();
//
//        // Evaluate the expression
//        double result = evaluateExpression(expression);
//
//        // Create the response
//        //   ExpressionResponse expressionResponse = new ExpressionResponse(result);
//        String jsonResponse = gson.toJson(result);
//
//        // Send the response back to Postman
//        resp.setContentType("application/json");
//        PrintWriter writer = resp.getWriter();
//        writer.write(jsonResponse);
//        writer.flush();
//    }
//
//
//
//
//    private double evaluateExpression(String expression) {
//        // Add your code here to evaluate the expression
//        // For simplicity, let's assume the expression is a simple arithmetic expression
//        expression = expression.replaceAll("\\s+","");
//        // Initialize the result variable to 0
//        double result = 0;
//
//        // Split the input string into an array of operands and operators
//        String[] operands = expression.split("[\\+\\-\\*\\/]");
//
//        // Split the input string into an array of operators
//        String[] operators = expression.split("[0-9]+");
//
//        // Loop through the operands and operators and evaluate the expression
//        for (int i = 0; i < operators.length; i++) {
//            if (i == 0) {
//                result = Double.parseDouble(operands[i]);
//            } else {
//                double operand = Double.parseDouble(operands[i]);
//                switch (operators[i]){
//                    case "+":
//                        result += operand;
//                        break;
//                    case "-":
//                        result -= operand;
//                        break;
//                    case "*":
//                        result *= operand;
//                        break;
//                    case "/":
//                        result /= operand;
//                        break;
//                }
//            }
//        }
//
//        return result;

    }
    }

