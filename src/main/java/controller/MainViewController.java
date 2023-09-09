package controller;

import DB.DBConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainViewController {
    public AnchorPane pane;
    public TextField usernameText;
    public PasswordField passwordText;



    public void gotoRegisterWindow(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/view/Register-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Register");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public  void navigate() throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("/view/DashBoard-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("DashBoard");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void gotoDashBoardWindow(ActionEvent event) throws IOException{
        String user = usernameText.getText();
        String pw = passwordText.getText();

        if(user.equals(DBConnection.user) && pw.equals(DBConnection.passwod)) {
            navigate();
        } else {
            new Alert(Alert.AlertType.ERROR, "Credential Invalid").show();
        }

    }
}
