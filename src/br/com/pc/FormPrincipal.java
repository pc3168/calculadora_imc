
package br.com.pc;

/**
 *
 * @author Paulo César -PC
 */
public class FormPrincipal {

    public static void main(String[] args) {
        
        javax.swing.JFrame frame = new javax.swing.JFrame();
        CalcularIMC imc = new CalcularIMC();
        
        frame.add(imc);
        frame.setTitle("Calculadora de IMC V. 1.0");
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
    }
    
}
