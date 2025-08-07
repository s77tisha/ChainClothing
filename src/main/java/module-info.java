module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chainclothingproject to javafx.fxml;

    //opens com.example.chainclothingproject.Seller to javafx.fxml, java.base;
    //opens com.example.chainclothingproject.ReturnAgent to javafx.fxml, java.base;

    exports com.example.chainclothingproject;
}