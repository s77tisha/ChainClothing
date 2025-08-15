module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.chainclothingproject to javafx.fxml;
    opens com.example.chainclothingproject.Seller to javafx.fxml;
    opens com.example.chainclothingproject.ReturnAgent to javafx.fxml;
    opens com.example.chainclothingproject.Customer to javafx.fxml;
    //opens com.example.chainclothingproject.DeliveryAgent to javafx.fxml;
    //opens DeliveryAgent to javafx.fxml;

    exports com.example.chainclothingproject;
    exports com.example.chainclothingproject.Seller;
    exports com.example.chainclothingproject.ReturnAgent;
    exports com.example.chainclothingproject.Customer;
    //exports com.example.chainclothingproject.DeliveryAgent;
}

