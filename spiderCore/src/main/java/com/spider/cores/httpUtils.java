package com.spider.cores;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpUtils {

	
	public static String Get(String webUrl) throws Exception{
        URL url = new URL(webUrl);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.setDoOutput(true);  
        http.setDoInput(true);  
        http.setRequestMethod("POST");  
        http.connect();  
        OutputStreamWriter out = new OutputStreamWriter(http.getOutputStream(), "UTF-8"); 
        
        String input = "name=flr&nowpage=1&pagesize=10"; 
         
        out.append(input);  
        out.flush();  
        out.close();  
        int length = (int) http.getContentLength();
        System.out.println(length);
         BufferedReader reader = new BufferedReader(new InputStreamReader(http.getInputStream()));
         String line;
         StringBuffer buffer = new StringBuffer();
         while ((line = reader.readLine()) != null) {
             buffer.append(line);
         }
         reader.close();
         http.disconnect();
         
         return buffer.toString();
	}
}
