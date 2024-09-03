package ca.georgiancollege.librarymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

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
    private List<HBox> sections;

    @FXML
    public void initialize() {
        sections = Arrays.asList(homeSection, booksSection, loansSection, membersSection);

        // -----set click events to each sections
        for (HBox section : sections) {
            section.setOnMouseClicked(event -> handleSectionClick(section));
        }

        // -------display home view by default
        handleSectionClick(homeSection);
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

    private void handleSectionClick(HBox clickedSection) {
        // -------clear selected first
        for (HBox section : sections) {
            section.getStyleClass().remove("selected");
        }

        // -----then add selected section
        clickedSection.getStyleClass().add("selected");

        // ---------load views accordingly
        String viewFile = "";
        if (clickedSection == homeSection) {
            viewFile = "home-view.fxml";
        } else if (clickedSection == booksSection) {
            viewFile = "books-view.fxml";
        } else if (clickedSection == loansSection) {
            viewFile = "loans-view.fxml";
        } else if (clickedSection == membersSection) {
            viewFile = "members-view.fxml";
        }

        loadView(viewFile);
    }

}
