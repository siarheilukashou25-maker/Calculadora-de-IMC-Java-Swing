package com.calculadora.imc.main;

import com.calculadora.imc.controller.IMCController;
import com.calculadora.imc.view.CalculadoraView;

/**
 *
 * @author SiarheiLukashou
 */
public class MainActivity {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(() -> {
            CalculadoraView vista = new CalculadoraView();
            new IMCController(vista);
            vista.setVisible(true);
        });
    }
}
