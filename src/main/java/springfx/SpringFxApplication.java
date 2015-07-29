package springfx;

import javafx.application.Preloader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;

import springfx.fx.fxmlcontrollers.FXMLMainController;

@Lazy
@SpringBootApplication
@ComponentScan(basePackages = "springfx.*")
public class SpringFxApplication extends AbstractJavaFxApplicationSupport {


    @Autowired
    private FXMLMainController mainController;

    /**
     * Note that this is configured in application.properties
     */

    @Override
    public void start(Stage prstage) throws Exception {
        Scene scene = new Scene((Parent)mainController.getView(), 300, 200);
//
        Stage  stage = mainController.getStage();
        stage.setResizable(false);
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.setTitle("Logbook client");
        stage.show();

    }
    public static void main(String[] args) {
        launchApp(SpringFxApplication.class, args);
    }
}
