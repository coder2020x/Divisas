/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

/**
 *
 * @author braya
 */
public class Temperatura {
    String origen;
    String destino;
    double valor;    
    public Temperatura(double valor, String origen, String destino) {
        this.valor = valor;
        this.origen = origen;
        this.destino = destino;
         System.out.println(valor+" / "+origen+" / "+destino+"-1");
    }
    public double temp() {
    double res = 0.0;
    if("Celcius".equals(origen) && "Fahrenheit".equals(destino)){
        res = (valor * 9/5) + 32;
    }
    if("Celcius".equals(origen) && "Kelvin".equals(destino)){
        res = valor + 273.15;
    }
    if("Fahrenheit".equals(origen) && "Celcius".equals(destino)){
        res = (valor - 32) * 5/9;
    }
    if("Fahrenheit".equals(origen) && "Kelvin".equals(destino)){
        res = (valor - 32) * 5/9 + 273.15;
    }
    if("Kelvin".equals(origen) && "Celcius".equals(destino)){
        res = valor - 273.15;
    }
    if("Kelvin".equals(origen) && "Fahrenheit".equals(destino)){
        res = (valor - 273.15) * 9/5 + 32;
    }
    if(origen.equals(destino)){
        res = valor;
    }
    System.out.println(valor+" / "+origen+" / "+destino+"-2");
  return res;
 }
}
