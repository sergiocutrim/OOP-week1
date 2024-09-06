module com.sergio.week1assisted {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sergio.week1assisted to javafx.fxml;
    exports com.sergio.week1assisted;
}