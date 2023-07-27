/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.io.*;
import okhttp3.*;
/**
 *
 * @author braya
 */
public class Fetch {
  public static void main(String []args) throws IOException{
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    Request request = new Request.Builder()
      .url("https://api.apilayer.com/exchangerates_data/symbols")
      .addHeader("apikey", "gghN5dzwgIVO4MYDzbPE9cNcIkbWJojp")
      .build();
    Response response = client.newCall(request).execute();
    System.out.println(response.body().string());
  }
}
