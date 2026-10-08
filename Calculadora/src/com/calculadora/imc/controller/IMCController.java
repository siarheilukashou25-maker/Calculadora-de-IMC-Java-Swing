package com.calculadora.imc.controller;

import com.calculadora.imc.model.CalculadoraIMC;
import com.calculadora.imc.view.CalculadoraView;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author SiarheiLukashou
 */
public class IMCController {
    CalculadoraView vista;
    private final CalculadoraIMC calculadora = new CalculadoraIMC();
    
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JButton btnCalcular;
    private JLabel lblResultado;
    private JLabel lblClasificacion;
    
    public IMCController(CalculadoraView vista){
        this.vista = vista;
        
        txtPeso = vista.getPesoInputField();
        txtAltura = vista.getAlturaInputField();
        btnCalcular = vista.getCalcularaButton();
        lblResultado = vista.getImcCalculado();
        lblClasificacion = vista.getClasificacionCalculada();
        
        btnCalcular.addActionListener(this::calcularIMC);
    }
    
    private void calcularIMC(java.awt.event.ActionEvent evt){
        String textoPeso = txtPeso.getText().trim().replace(',', '.');
        String textoAltura = txtAltura.getText().trim().replace(',', '.');
        
        float peso;
        float altura;
        
        try{
            peso = Float.parseFloat(textoPeso);
            altura = Float.parseFloat(textoAltura);
        }catch(NumberFormatException e){
            lblResultado.setText("");
            lblClasificacion.setForeground(Color.RED);
            lblClasificacion.setText("Error: Introduce solo números válidos");
            return;
        }
        
        double imc = calculadora.calcular(peso, altura);
        String clasificacion = calculadora.clasificar(imc);
        
        lblResultado.setText(String.format("Tu IMC es: %.2f", imc));
        lblClasificacion.setText("Clasificación: " + clasificacion);
        
        if(clasificacion.equals("Peso Normal")){
            lblClasificacion.setForeground(Color.GREEN);
        }else if(clasificacion.equals("Bajo Peso") || clasificacion.equals("Sobrepeso")){
            lblClasificacion.setForeground(Color.ORANGE);
        }else{
            lblClasificacion.setForeground(Color.RED);
        }
    }
}
