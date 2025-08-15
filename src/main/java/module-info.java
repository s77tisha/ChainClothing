module com.example.chainclothingproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.chainclothingproject to javafx.fxml;
    opens com.example.chainclothingproject.WarehouseStaff to javafx.fxml;
    opens com.example.chainclothingproject.InventoryManager to javafx.fxml;
//    opens com.example.chainclothingproject.Customer to javafx.fxml;
    //opens com.example.chainclothingproject.DeliveryAgent to javafx.fxml;
    //opens DeliveryAgent to javafx.fxml;

    exports com.example.chainclothingproject;

    exports com.example.chainclothingproject.WarehouseStaff;
    exports com.example.chainclothingproject.InventoryManager;
    //exports com.example.chainclothingproject.DeliveryAgent;
}