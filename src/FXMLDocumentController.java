/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author deep
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private void loginButtonPushed(ActionEvent e) throws IOException
    {
       Parent loginParent = FXMLLoader.load(getClass().getResource("login.fxml"));
       Scene loginParentScene = new Scene(loginParent);
       Stage window= (Stage)((Node)e.getSource()).getScene().getWindow();
       window.setScene(loginParentScene);
       window.show();
       
       
       
    }
    private void signupButtonPushed(ActionEvent e) throws IOException
    {
       Parent loginParent = FXMLLoader.load(getClass().getResource("signup.fxml"));
       Scene loginParentScene = new Scene(loginParent);
       Stage window= (Stage)((Node)e.getSource()).getScene().getWindow();
       window.setScene(loginParentScene);
       window.show();
       
       
       
    }
    
    /*public void Start(Stage stage)throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String args[])
    {
        
    }*/
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
