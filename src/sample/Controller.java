package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private Button btnSignIn;

    @FXML
    private Label lblName;

    @FXML
    private TextField txtName;

    @FXML
    private Label lblWelcome;

    @FXML
    private Label lblUserName;

    @FXML
    private Label lblPassword;

    @FXML
    private TextField txtPassword;

    @FXML
    void showName(MouseEvent event) {
        String name = txtName.getText();
        lblName.setText("One moment...");
    }

}
