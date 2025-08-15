module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.chainclothingproject to javafx.fxml;
<<<<<<< HEAD
    opens com.example.chainclothingproject.Seller to javafx.fxml;
    opens com.example.chainclothingproject.ReturnAgent to javafx.fxml;
    opens com.example.chainclothingproject.Customer to javafx.fxml;
=======
    opens com.example.chainclothingproject.WarehouseStaff to javafx.fxml;
    opens com.example.chainclothingproject.InventoryManager to javafx.fxml;
//    opens com.example.chainclothingproject.Customer to javafx.fxml;
>>>>>>> 0f856be399ffc18f4d934bc71946e9e7c12b6585
    //opens com.example.chainclothingproject.DeliveryAgent to javafx.fxml;
    //opens DeliveryAgent to javafx.fxml;

    exports com.example.chainclothingproject;
<<<<<<< HEAD
    exports com.example.chainclothingproject.Seller;
    exports com.example.chainclothingproject.ReturnAgent;
    exports com.example.chainclothingproject.Customer;
    //exports com.example.chainclothingproject.DeliveryAgent;
}

=======

    exports com.example.chainclothingproject.WarehouseStaff;
    exports com.example.chainclothingproject.InventoryManager;
    //exports com.example.chainclothingproject.DeliveryAgent;
}
>>>>>>> 0f856be399ffc18f4d934bc71946e9e7c12b6585
