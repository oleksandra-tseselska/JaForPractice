module com.example.jaformpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jaformpractice to javafx.fxml;
    exports com.example.jaformpractice;
    exports com.example.jaformpractice.HumanAlienApp;
    opens com.example.jaformpractice.HumanAlienApp to javafx.fxml;
}