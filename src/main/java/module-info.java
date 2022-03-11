module telas.estacionamento {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires java.persistence;
    requires org.junit.jupiter.api;


    opens telas.estacionamento to javafx.fxml;
    exports telas.estacionamento;
}