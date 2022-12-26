module com.algorithm.algorithmicselfassemly {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.algorithm.algorithmicselfassemly to javafx.fxml;
    exports com.algorithm.algorithmicselfassemly;
}