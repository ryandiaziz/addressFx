module id.dojo.addressfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens id.dojo.addressfx to javafx.fxml;
    exports id.dojo.addressfx;
}