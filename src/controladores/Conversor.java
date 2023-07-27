/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import java.io.*;
import static javax.swing.JOptionPane.showMessageDialog;
import okhttp3.*;
import org.json.JSONObject;

/**
 *
 * @author braya
 */

public class Conversor {
      
     public static JSONObject url(double valor, String origen, String destino) throws JSONException, FileNotFoundException, IOException{
        String org = null;
        String des = null;
         org.json.simple.JSONObject symbols = Tipos.Data();
        Iterator<Map.Entry<String, String>> iterator = symbols.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                     if(entry.getValue().equals(origen)){
                      des = entry.getKey();
                     }
                     if(entry.getValue().equals(destino)){
                      org = entry.getKey();
                     }
                     if(org!=null && des!=null ){break;}
            }
       OkHttpClient client = new OkHttpClient().newBuilder().build();
       Request request = new Request.Builder()
      .url("https://api.apilayer.com/exchangerates_data/convert?to="+org+"&from="+des+"&amount="+valor)
      .addHeader("apikey", "gghN5dzwgIVO4MYDzbPE9cNcIkbWJojp")
      .build();
       Response response = client.newCall(request).execute();
       JSONObject obj = new JSONObject(response.body().string());
       return obj;
   }

}
