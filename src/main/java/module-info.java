module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.chainclothingproject to javafx.fxml;
<<<<<<< HEAD

    //opens com.example.chainclothingproject.Seller to javafx.fxml, java.base;
    //opens com.example.chainclothingproject.ReturnAgent to javafx.fxml, java.base;
=======

    //opens com.example.chainclothingproject.Customer to javafx.fxml, java.base;
    //opens com.example.chainclothingproject.DeliveryAgent to javafx.fxml, java.base;

//    opens com.example.chainclothingproject.Seller to javafx.fxml;
//    opens com.example.chainclothingproject.ReturnAgent to javafx.fxml;

>>>>>>> d770fdb4f03b6978a7b4032f7ab0635ce9b9a88a

    exports com.example.chainclothingproject;
}