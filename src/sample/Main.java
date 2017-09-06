package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        In order to create a new 'resource' directory, need to first create a Directory within the main file. Then
        right click on the new directory and choose "Mark Directory As" --> "Resources Root".
        It is Good Practice to keep Java file separate from other resource files. We can create separate Directories
        for each Resource that we need within the Root Resource Directory.
         */
        // Since 'resources' directory is a root file, we don't have to mention it in the pate, we can just start with
        // a '/' to indicate absolute path, and then give the name of the directory and the name of the file
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
