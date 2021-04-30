package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Button bt_submit;
    @FXML
    private Label la_output;
    @FXML
    private TextField tf_input;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("uwu wtf");

        bt_submit.setOnAction(e -> la_output.setText("You are " + tf_input.getText() + " years old owo"));
    }
}
