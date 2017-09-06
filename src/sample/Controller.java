package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    /*
    Controller has access to the fields variables in XML file. In the Tutorial video, he says that we have to access
    each field by calling on '@FXML', but the autofix simply created a field without the '@FXML' annotation.
     To access the field from XML, we need to create an appropriate field as per XML with the same name as ID.
     We can then access the value in the field by calling a specific method like .getText().
     */
    public TextField firstName;

    // This method was auto created from XML, once we gave 'onAction' parameter a method name by using '#'
    // I don't know what it means by ActionEvent at this time...
    public void handleSaySup(ActionEvent actionEvent) {
        System.out.printf("Sup %s! %n", firstName.getText());
    }
}
