package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardViewController {
    public AnchorPane pane;
    public Pane pane1;
    public Pane pane2;

    public void gotoCustomerView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Customer-View.fxml"));
        this.pane2.getChildren().clear();
        this.pane2.getChildren().add(root);
    }

    public void gotoItemView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Item-View.fxml"));
        this.pane2.getChildren().clear();
        this.pane2.getChildren().add(root);
    }

    public void gotoSupplierView(ActionEvent event) throws IOException{
        Parent root=FXMLLoader.load(getClass().getResource("/view/Supplier-View.fxml"));
        this.pane2.getChildren().clear();
        this.pane2.getChildren().add(root);
    }

    public void backButton(ActionEvent event) throws IOException {

        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("goto Log in");
        alert.setContentText("Do you want log out Your Account ?");

        if (alert.showAndWait().get()== ButtonType.OK){

        Parent root= FXMLLoader.load(getClass().getResource("/view/Main-View.fxml"));
        Stage stage= (Stage) this.pane.getScene().getWindow();
        stage.setTitle("Log in");
        stage.setScene(new Scene(root));
        stage.show();
        }
    }
}
