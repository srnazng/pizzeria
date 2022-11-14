module com.example.pizzeria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pizzeria to javafx.fxml;
    exports com.example.pizzeria;
}