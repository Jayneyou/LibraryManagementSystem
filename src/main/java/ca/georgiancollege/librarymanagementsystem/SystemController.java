package ca.georgiancollege.librarymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class SystemController {
    @FXML
    private HBox booksSection;

    @FXML
    private HBox homeSection;

    @FXML
    private HBox loansSection;

    @FXML
    private HBox membersSection;

    @FXML
    private VBox menuArea;
    @FXML
    private BorderPane contentArea;

    @FXML
    public void initialize() {
//        loadView("home-view.fxml");
        // load seperate views
        homeSection.setOnMouseClicked(event -> loadView("home-view.fxml"));
        booksSection.setOnMouseClicked(event -> loadView("books-view.fxml"));
        loansSection.setOnMouseClicked(event -> loadView("loans-view.fxml"));
        membersSection.setOnMouseClicked(event -> loadView("members-view.fxml"));
    }

    private void loadView(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent view = loader.load();
            contentArea.setCenter(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
