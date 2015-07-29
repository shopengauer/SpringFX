package springfx.fx.fxmlconfigs;



import javafx.fxml.FXMLLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfx.fx.fxmlcontrollers.FXMLMainController;


import java.io.IOException;
import java.io.InputStream;

/**
 * Created by vasiliy on 15.06.15.
 */
@Configuration
public class FXMLControllersConfig {

    private Logger logger = LoggerFactory.getLogger(FXMLMainController.class);

    @Bean
    public FXMLMainController fxmlController() throws IOException {
        System.out.println("Load controller");
        return (FXMLMainController) loadController("/fxmlschemas/FXMLMainSchema.fxml");
    }


    protected Object loadController(String url) throws IOException {
        try
                (InputStream fxmlStream = getClass().getResourceAsStream(url)) {
            FXMLLoader loader = new FXMLLoader();
            loader.load(fxmlStream);
            return loader.getController();
        }
    }


}
