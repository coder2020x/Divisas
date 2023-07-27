/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author braya
 */
public class getSigno {  
    public String Format(double monto,String locate) {
        String locat;
        String lang;
        String montoFormateado;
        locat = switch (locate) {
        case "Colón Costa Rica" -> "CR";
        case "Peso Mexicano" -> "MX";
        case "Quetzal Guatemalteco" -> "GT";
        case "Peso uruguayo" -> "UY";
        case "Colón Salvadoreño" -> "SV";
        case "Peso Argentino" -> "AR";
        case "Yuan chino" -> "CN";
        case "Peso filipino" -> "PH";
        case "Rublo Rusia" -> "RU";
        case "Guaraní Paraguayo" -> "PY";
        case "Dólar jamaiquino" -> "JM";
        case "Peso Colombiano" -> "CO";
        case "Dólar Estado Unidense" -> "US";
        case "Franco Suizo" -> "CH";
        case "Nuevo séquel Israelí" -> "IL";
        case "Won Norcoreano" -> "KL";
        case "Boliviano Bolivia" -> "BO";
        case "Dólar Canadiense" -> "CA";
        case "Yen Japon" -> "JP";
        case "Rublo Bielorruso" -> "BY";
        case "Córdoba Nicaragüense" -> "NI";
        case "Nuevo sol Peruano" -> "PE";
        case "Unidad Chilena de cuenta (UF)" -> "CL";
        case "Real Brasileño" -> "BR";
            default -> "Unknown";
        };
        lang = switch (locate) {
        case "Yuan chino" -> "zh";
        case "Peso filipino" -> "fil";
        case "Rublo Rusia" -> "ru";
        case "Dólar jamaiquino" -> "en";
        case "Dólar Estado Unidense" -> "en";
        case "Franco Suizo" -> "de";
        case "Nuevo séquel Israelí" -> "iw";
        case "Won Norcoreano" -> "ko";
        case "Dólar Canadiense" -> "en";
        case "Yen Japon" -> "ja";
        case "Rublo Bielorruso" -> "be";
            default -> "es";
        };

        //NumberFormat formatoImporte = NumberFormat.getCurrencyInstance();
        if("Bitcoin".equals(locate)){
        montoFormateado = "฿"+String.format("%.8f", monto);
        } else {
        NumberFormat formatoImporte = NumberFormat.getCurrencyInstance(new Locale(lang,locat));
        montoFormateado = formatoImporte.format(monto);
        System.out.println("Monto formateado: " + montoFormateado);
        }
        return montoFormateado;
    }
}
