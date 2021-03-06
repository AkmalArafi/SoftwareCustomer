package com.ecanteen.ecanteen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("product-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Produk | e-Canteen");
        stage.setMaximized(true);
        stage.setScene(scene);
        stage.show();
    }
}