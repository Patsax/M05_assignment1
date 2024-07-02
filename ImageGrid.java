import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGrid extends Application {
    @Override
    public void start(Stage stage) {
        // create a GridPane with 2 rows and 2 columns
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        // add images to the GridPane
        Image flag1 = new Image("flag1.gif");
        ImageView imageView1 = new ImageView(flag1);
        gridPane.add(imageView1, 0, 0);

        Image flag2 = new Image("flag2.gif");
        ImageView imageView2 = new ImageView(flag2);
        gridPane.add(imageView2, 1, 0);

        Image flag3 = new Image("flag6.gif");
        ImageView imageView3 = new ImageView(flag3);
        gridPane.add(imageView3, 0, 1);

        Image flag4 = new Image("flag7.gif");
        ImageView imageView4 = new ImageView(flag4);
        gridPane.add(imageView4, 1, 1);

        // create a scene and set it to the stage
        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}