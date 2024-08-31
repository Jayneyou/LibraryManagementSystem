module ca.georgiancollege.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.librarymanagementsystem to javafx.fxml;
    exports ca.georgiancollege.librarymanagementsystem;
}