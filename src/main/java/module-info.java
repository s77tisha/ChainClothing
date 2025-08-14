module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chainclothingproject to javafx.fxml;


    exports com.example.chainclothingproject;
}