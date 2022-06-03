
package br.com.pc;

/**
 *
 * @author Paulo César -PC
 */
public class CalcularIMC extends FormCalcularIMC{
    
    @Override
    public void btcalcular() {
        double kilo = 0;
        double metro = 0;
        String exibir;
        double calc;
        
        try {
            kilo = Double.parseDouble(tfKilograma.getText().replace(",", "."));
            metro = Double.parseDouble(tfMetro.getText().replace(",", "."));
            
            //converte o cm para metro.
            metro /= 100;
            
            calc = kilo / (metro * metro);
            exibir = resultado(calc);
            laValor.setText(String.valueOf(calc));
            laResultado.setText(exibir);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Valor digitado é inválido.\n"+e.getMessage());
        }

    }

    @Override
    public void btLimpar() {
        tfKilograma.setText("");
        tfMetro.setText("");
        laResultado.setText("");
        laValor.setText("00,00");
        tfKilograma.requestFocus();
    }
    
    
    public String resultado(double imc){
        String resultado;
        if (imc < 17) {
            resultado =  "Muito abaixo do peso";
        }else if(imc < 18.50){
            resultado =  "Abaixo do peso";
        }else if(imc < 25){
            resultado =  "Peso normal";
        }else if(imc < 30){
            resultado =  "Acima do peso";
        }else if(imc < 35){
            resultado =  "Obesidade I";
        }else if(imc < 40){
            resultado =  "Obesidade II (severa)";
        }else {
            resultado =  "Obesidade III (mórbida)";
        }
        return resultado;
    }
    
    
//    Resultado	Situação
//Abaixo de 17	Muito abaixo do peso
//Entre 17 e 18,49	Abaixo do peso
//Entre 18,50 e 24,99	Peso normal
//Entre 25 e 29,99	Acima do peso
//Entre 30 e 34,99	Obesidade I
//Entre 35 e 39,99	Obesidade II (severa)
//Acima de 40	Obesidade III (mórbida)
    
}
