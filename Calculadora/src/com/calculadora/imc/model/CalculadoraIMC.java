package com.calculadora.imc.model;

/**
 *
 * @author SiarheiLukashou
 */
public class CalculadoraIMC {
    public double calcular(double peso, double altura){
        return peso / (altura * altura);
    }
    
    public String clasificar(double imc){
        String message;
        message = null;
        
        if(imc < 18.5){
            message = "Bajo Peso";
        }else if(imc < 24.9){
            message = "Peso Normal";
        }else if(imc < 29.9){
            message = "Sobrepeso";
        }else{
            message = "Obesidad";
        }
        
        return message;
    }
}
