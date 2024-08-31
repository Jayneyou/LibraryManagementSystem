package ca.georgiancollege.librarymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {
    @FXML
    private Label errorMessageLabel;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    public void initialize() {
        errorMessageLabel.setText("");
        loginButton.setOnAction(event -> login());
    }
    private void login() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        passwordField.setText("");
        if (username.equals("admin") && password.equals("password")) {
            Stage stage = (Stage) usernameField.getScene().getWindow();
            stage.close();
            System.out.println("Login successfully");
            // open new scene
//            try {
//                MainApp mainApp = new MainApp();
//                mainApp.start(new Stage());
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        } else {
            errorMessageLabel.setText("Invalid credentials!");
        }
    }
}
