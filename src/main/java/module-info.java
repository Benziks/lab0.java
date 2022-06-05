module com.company.lab10 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.company.lab10 to javafx.fxml;
    exports com.company.lab10;
}