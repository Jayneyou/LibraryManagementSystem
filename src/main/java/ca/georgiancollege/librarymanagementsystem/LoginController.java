package ca.georgiancollege.librarymanagementsystem;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
//        if (username.equals("admin") && password.equals("password")) {
//            System.out.println("Login successfully");

            // open new scene
            try {
                // load system-view scene
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("system-view.fxml"));
                Parent systemView = fxmlLoader.load();

                // get stage
                Stage stage = (Stage) usernameField.getScene().getWindow();

                // set new scene
                Scene scene = new Scene(systemView);
                stage.setScene(scene);
                stage.show();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        else {
//            errorMessageLabel.setText("Invalid credentials!");
//        }
//    }
}
