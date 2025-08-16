module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chainclothingproject to javafx.fxml;
    opens com.example.chainclothingproject.Seller to javafx.fxml;
    opens com.example.chainclothingproject.ReturnAgent to javafx.fxml;



    exports com.example.chainclothingproject;
    exports com.example.chainclothingproject.Seller;
    exports com.example.chaincloth.ReturnAgent;

}