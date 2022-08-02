/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Carvalhos
 */
public class FXMLDocumentController implements Initializable {
    
    int n1;
    int n2;
    boolean limpar = false;
    String operacao = "";
    
    @FXML
    private Label lblVisor;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    
    
    @FXML
    private void inserirNumero(ActionEvent event) {
        if(limpar == true){
            lblVisor.setText("");
            limpar = false;
        }else{
        }
        
        String valorVisor = lblVisor.getText();
        String valorBtn = ((Button)event.getSource()).getText();
        System.out.println(valorBtn);
        lblVisor.setText(valorVisor + valorBtn);
    }
    
    @FXML
    private void soma(ActionEvent event) {
        operacao = "soma";
        String valorVisor = lblVisor.getText();
        lblVisor.setText("");
        
        n1 = Integer.valueOf(valorVisor);
          
    }
    
    @FXML
    private void subtracao(ActionEvent event) {
        operacao = "subtracao";
        String valorVisor = lblVisor.getText();
        lblVisor.setText("");
        
        n1 = Integer.valueOf(valorVisor);
          
    }
    
    @FXML
    private void multiplicacao(ActionEvent event) {
        operacao = "multiplicacao";
        String valorVisor = lblVisor.getText();
        lblVisor.setText("");
        
        n1 = Integer.valueOf(valorVisor);
          
    }
    
    @FXML
    private void divisao(ActionEvent event) {
        operacao = "divisao";
        String valorVisor = lblVisor.getText();
        lblVisor.setText("");
        
        n1 = Integer.valueOf(valorVisor);
          
    }
    
    @FXML
    private void calcular(ActionEvent event) {
        String valorVisor = lblVisor.getText();
        lblVisor.setText("");
        n2 = Integer.valueOf(valorVisor);
        
        if(operacao == "soma"){
            
        int resultado = n1 + n2;
        System.out.println(resultado);
        lblVisor.setText(Integer.toString(resultado));
        
        }else if(operacao == "subtracao"){
            
            int resultado = n1 - n2;
            System.out.println(resultado);
            lblVisor.setText(Integer.toString(resultado));
            
        }else if(operacao == "multiplicacao"){
        
            int resultado = n1 * n2;
            System.out.println(resultado);
            lblVisor.setText(Integer.toString(resultado));
            
        }else if(operacao == "divisao"){
        
            int resultado = n1 / n2;
            System.out.println(resultado);
            lblVisor.setText(Integer.toString(resultado));
        
        }
        
        n1 = 0;
        n2 = 0;
        limpar = true;
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
