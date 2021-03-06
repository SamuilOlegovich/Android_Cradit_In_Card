package com.fastloan.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;




public class DownloadStringDataApi implements Runnable {

    @Override
    public void run() {
        try {
            URL obj = new URL(DataExchange.getUrlApi());
            HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer response = new StringBuffer();
            String inputLine;

            while ((inputLine = in.readLine()) != null) { response.append(inputLine); }

            if (response != null && in != null && response.length() > 100) {
                DataExchange.setStringDataApi(response.toString());
            }

            in.close();
            connection.disconnect();
        } catch (Exception e) { }
    }
}
