module MemeGenerator {
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;
    
    //for bufferedimage
    requires java.desktop;
    
    //for mediaplayer
    requires javafx.media;
    
    //for sql
    requires java.sql;
    
    //for pdf reader
    requires org.apache.pdfbox;
    
    //for api connection 
    requires unirest.java;
    
    //for gson
    requires com.google.gson;

    opens MemeGenerator to javafx.fxml;
    exports MemeGenerator;
}