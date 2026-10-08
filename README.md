# Calculadora IMC

Aplicación de escritorio en Java (Swing) que calcula el Índice de Masa Corporal siguiendo el patrón MVC.

## Estructura
- `com.calculadora.imc.model`: `CalculadoraIMC`, cálculo y clasificación del IMC.
- `com.calculadora.imc.view`: `CalculadoraView`, interfaz gráfica.
- `com.calculadora.imc.controller`: `IMCController`, conecta vista y modelo.
- `com.calculadora.imc.main`: `Main`, punto de entrada.

## Uso
1. Abrir el proyecto en NetBeans y ejecutar `Main`.
2. Introducir el peso en kg y la altura en metros (ej. 70 y 1,75).
3. Pulsar el botón para ver el IMC y su clasificación (con color según el resultado).