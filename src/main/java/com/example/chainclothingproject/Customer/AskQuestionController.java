package com.example.chainclothingproject.Customer;

<<<<<<< HEAD
import javafx.event.ActionEvent;
=======
import com.example.chainclothingproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
>>>>>>> a82e3befe7bad20c9868dbe54d7bf2ae38cef790
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
<<<<<<< HEAD
=======
import javafx.stage.Stage;
>>>>>>> a82e3befe7bad20c9868dbe54d7bf2ae38cef790

public class AskQuestionController
{

    @javafx.fxml.FXML
    private TableView productTableView;
    @javafx.fxml.FXML
    private TextArea writeQueriesTextArea;
    @javafx.fxml.FXML
    private TableColumn productNameTC;
    @javafx.fxml.FXML
    private TextField enterProductIdTextField;
    @javafx.fxml.FXML
    private TableColumn productIdTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void signUpOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void askeQuestionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void askQuestionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void productListOA(ActionEvent actionEvent) {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Customer/BrowseAndFilter.fxml"));
            Scene Nextscene = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Customer/BrowseAndFilter");
            nextStage.setScene(Nextscene);
            nextStage.show();

        }
        catch (Exception e){
            //
        }
    }
}