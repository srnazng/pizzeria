module com.example.pizzeria {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;


    opens com.example.pizzeria to javafx.fxml;
    exports com.example.pizzeria;
}