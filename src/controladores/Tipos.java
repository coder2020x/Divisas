/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

/**
 *
 * @author braya
 */
import org.json.simple.JSONObject;


public class Tipos {
public static JSONObject Data() {
   JSONObject symbols = new JSONObject();
symbols.put("CRC","Colón Costa Rica");
symbols.put("MXN","Peso Mexicano");
symbols.put("GTQ","Quetzal Guatemalteco");
symbols.put("BTC","Bitcoin");
symbols.put("UYU","Peso uruguayo");
symbols.put("SVC","Colón Salvadoreño");
symbols.put("ARS","Peso Argentino");
symbols.put("CNY","Yuan chino");
symbols.put("PHP","Peso filipino");
symbols.put("RUB","Rublo Rusia");
symbols.put("PYG","Guaraní Paraguayo ");
symbols.put("JMD","Dólar jamaiquino");
symbols.put("COP","Peso Colombiano");
symbols.put("USD","Dólar Estado Unidense");
symbols.put("CHF","Franco Suizo");
symbols.put("ILS","Nuevo séquel Israelí");
symbols.put("KPW","Won Norcoreano");
symbols.put("BOB","Boliviano Bolivia");
symbols.put("CAD","Dólar Canadiense");
symbols.put("JPY","Yen Japon");
symbols.put("BYR","Rublo Bielorruso");
symbols.put("NIO","Córdoba Nicaragüense");
symbols.put("PEN","Nuevo sol Peruano");
symbols.put("CLF","Unidad Chilena de cuenta (UF)");
symbols.put("BRL","Real Brasileño");
        return symbols;
    }   
}