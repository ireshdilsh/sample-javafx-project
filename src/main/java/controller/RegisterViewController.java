package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterViewController {
    public AnchorPane pane;

    public void gotoBack(ActionEvent event) throws IOException{
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Back to log in page");
        alert.setContentText("Do you want back to login form ? ");
        if (alert.showAndWait().get()== ButtonType.OK){
            Parent root=FXMLLoader.load(getClass().getResource("/view/Main-View.fxml"));
            Stage stage= (Stage) this.pane.getScene().getWindow();
            stage.setTitle("Log in");
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}
