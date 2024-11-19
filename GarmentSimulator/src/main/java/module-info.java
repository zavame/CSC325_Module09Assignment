module com.example.garmentsimulator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.garmentsimulator to javafx.fxml;
    exports com.example.garmentsimulator;
}