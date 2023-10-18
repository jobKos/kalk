package com.example.kalk;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class
HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField first;

    @FXML
    private Label otvet;

    @FXML
    private TextField second;
    Double x,y,c;

    @FXML
    void onMinus(ActionEvent event) {
        x=Double.parseDouble(first.getText());
        y=Double.parseDouble(second.getText());
        c=x-y;
        otvet.setText(String.valueOf(c));
        first.setText("");
        second.setText("");
    }

    @FXML
    void onMult(ActionEvent event) {
        x=Double.parseDouble(first.getText());
        y=Double.parseDouble(second.getText());
        c=x*y;
        otvet.setText(String.valueOf(c));
        first.setText("");
        second.setText("");
    }

    @FXML
    void onPlus(ActionEvent event) {
x=Double.parseDouble(first.getText());
y=Double.parseDouble(second.getText());
c=x+y;
otvet.setText(String.valueOf(c));
first.setText("");
second.setText("");
    }

    @FXML
    void onRazr(ActionEvent event) {
        x=Double.parseDouble(first.getText());
        y=Double.parseDouble(second.getText());
        c=x/y;
        otvet.setText(String.valueOf(c));
        first.setText("");
        second.setText("");
    }

    @FXML
    void initialize() {
        assert first != null : "fx:id=\"first\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert otvet != null : "fx:id=\"otvet\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert second != null : "fx:id=\"second\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}