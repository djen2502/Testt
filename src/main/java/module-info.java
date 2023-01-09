module com.example.testt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testt to javafx.fxml;
    exports com.example.testt;
}