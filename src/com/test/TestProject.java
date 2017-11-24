package com.test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TestProject extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		
		
System.out.println("inside the get slots method");
		
		String response = "";
		URL urlValue = new URL("https://my.setmore.com/slots/v1/" + companyKey);
		
		HttpURLConnection connection  = (HttpURLConnection) urlValue.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");	 
        connection.setDoOutput(true);
		
		 DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
		   // wr.write(inputValues.getBytes());
			wr.flush();
			wr.close();
		
		
		System.out.println("after hitting the get slots " + urlValue);
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		
			String inputLine;

			while ((inputLine = in.readLine()) != null) {
				response += inputLine;
			
			System.out.println("response is " + response);
				
			}
		
		return response;	
		
		
	
		
		
		
		
	}
}
