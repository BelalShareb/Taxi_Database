package com.database.taxi_database;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class OperatorMainPage {

    static Label operatorName = new Label("Operator Full Name: ");
    static TextField operatorNameField = new TextField();
    static HBox operatorNamePane = new HBox();

    static Label operatorAddress = new Label("Operator Address: ");
    static TextArea operatorAddressField = new TextArea();
    static HBox operatorAddressPane = new HBox();

    static Label operatorPhone = new Label("Operator Phone Number: ");
    static TextField operatorPhoneField = new TextField();
    static HBox operatorPhonePane = new HBox();

    static Label operatorEmail = new Label("Operator Email: ");
    static TextField operatorEmailField = new TextField();
    static HBox operatorEmailPane = new HBox();

    static Label operatorDOB = new Label("Operator Date of Birth: ");
    static TextField operatorDOBField = new TextField();
    static HBox operatorDOBPane = new HBox();

    static Label operatorWorkHours = new Label("Operator Work Hours: ");
    static TextField operatorWorkHoursField = new TextField();
    static HBox operatorWorkHoursPane = new HBox();

    static VBox operatorNameAndAddress = new VBox();
    static VBox operatorPhoneEmailDOBHours = new VBox();

    static HBox operatorInfo = new HBox();

    static TableView operatorTable = new TableView();
    static TableColumn <Driver, String> driverID  = new TableColumn<>("Driver ID");
    static TableColumn <Driver, String> driverNameColumn  = new TableColumn<>("Driver Name");
    static TableColumn <Driver, String> driverPhoneColumn  = new TableColumn<>("Driver Phone");
    static TableColumn <Driver, String> driverWorkHoursColumn  = new TableColumn<>("Driver Work Hours");
    static TableColumn <Driver, String> driverLocation = new TableColumn<>("Driver Location");





    static Scene operatorMainPage = new Scene(operatorInfo, 960, 720);



    OperatorMainPage (){
        operatorNameField.setEditable(false);
        operatorNameField.setPrefSize(190, 20);
        operatorNamePane.getChildren().addAll(operatorName, operatorNameField);
        operatorNamePane.setSpacing(20);

        operatorAddressField.setEditable(false);
        operatorAddressField.setPrefSize(200, 150);
        operatorAddressPane.getChildren().addAll(operatorAddress, operatorAddressField);
        operatorAddressPane.setSpacing(20);

        operatorNameAndAddress.getChildren().addAll(operatorNamePane, operatorAddressPane);
        operatorNameAndAddress.setSpacing(20);

        operatorPhoneField.setEditable(false);
        operatorPhonePane.getChildren().addAll(operatorPhone, operatorPhoneField);
        operatorPhonePane.setSpacing(20);

        operatorEmailField.setEditable(false);
        operatorEmailPane.getChildren().addAll(operatorEmail, operatorEmailField);
        operatorEmailPane.setSpacing(20);

        operatorDOBField.setEditable(false);
        operatorDOBPane.getChildren().addAll(operatorDOB, operatorDOBField);
        operatorDOBPane.setSpacing(20);

        operatorWorkHoursField.setEditable(false);
        operatorWorkHoursPane.getChildren().addAll(operatorWorkHours, operatorWorkHoursField);
        operatorWorkHoursPane.setSpacing(20);

        operatorPhoneEmailDOBHours.getChildren().addAll(operatorPhonePane, operatorEmailPane, operatorDOBPane, operatorWorkHoursPane);
        operatorPhoneEmailDOBHours.setSpacing(20);

        operatorInfo.getChildren().addAll(operatorNameAndAddress, operatorPhoneEmailDOBHours);

        driverID.setCellValueFactory(new PropertyValueFactory<>("driverID"));

        operatorInfo.setAlignment(Pos.TOP_CENTER);
        operatorInfo.setPadding(new Insets(30, 30, 30, 30));
        operatorInfo.setSpacing(50);
    }



}
