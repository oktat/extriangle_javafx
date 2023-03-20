package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import models.MainModel;

public class MainController {
    @FXML
    private TextField baseField;
    @FXML
    private TextField heightField;
    @FXML
    private TextField areaField;

    MainModel mainModel;

    public MainController() {
        this.mainModel = new MainModel();
    }
    
    @FXML
    protected void onClickCalcButton(ActionEvent event) {
        String baseStr = baseField.getText();
        String heightStr = heightField.getText();
        double base = Double.parseDouble(baseStr);
        double height = Double.parseDouble(heightStr);
        Double area = mainModel.calcTriangleArea(base, height);
        areaField.setText(area.toString());
    }
    @FXML
    protected void onClickAboutButton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Névjegy");
        alert.setHeaderText("Triangle");
        alert.setContentText("Verzió: 1.0.0\nSzerző: Nagy János");
        alert.showAndWait();
    }
    @FXML
    protected void onClickExitButton(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }
}
