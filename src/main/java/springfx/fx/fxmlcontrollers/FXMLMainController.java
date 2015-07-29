package springfx.fx.fxmlcontrollers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import javax.annotation.PostConstruct;


/**
 * Created by vasiliy on 26.06.15.
 */
public class FXMLMainController {

    private Stage stage;

    @FXML
    private Button submitButton;

    @FXML
    private Label loginLabel;

    @FXML
    private AnchorPane view;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;



    @PostConstruct
    public void init(){


        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                stage = new Stage();
            }
        });


    }





    public AnchorPane getView() {

        return view;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public TextField getUsernameTextField() {
        return usernameTextField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }
}
