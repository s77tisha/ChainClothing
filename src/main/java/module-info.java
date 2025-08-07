module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chainclothingproject to javafx.fxml;
<<<<<<< HEAD
    //opens com.example.chainclothingproject.Customer to javafx.fxml, java.base;
    //opens com.example.chainclothingproject.DeliveryAgent to javafx.fxml, java.base;
=======
//    opens com.example.chainclothingproject.Seller to javafx.fxml;
//    opens com.example.chainclothingproject.ReturnAgent to javafx.fxml;

>>>>>>> 9fb90d1e93cd1e91a0ef6edfe6911f92b1dabdcc
    exports com.example.chainclothingproject;
}