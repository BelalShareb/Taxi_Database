module com.database.taxi_database {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.database.taxi_database to javafx.fxml;
    exports com.database.taxi_database;
}