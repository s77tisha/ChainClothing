module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chainclothingproject to javafx.fxml;
    //opens com.example.chainclothingproject.Customer to javafx.fxml, java.base;
    //opens com.example.chainclothingproject.DeliveryAgent to javafx.fxml, java.base;
    exports com.example.chainclothingproject;
}