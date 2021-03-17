package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

//implements <- refere-se a interface
public class FXMLDocumentController implements Initializable {
    
    //Declaração dos controles
    @FXML
    private Label lblMenssagem;
    private Button btnClique;
    //Método do botão
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMenssagem.setText("Olá mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
