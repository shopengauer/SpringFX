package springfx.component;

/**
 * Created by vasiliy on 29.07.15.
 */

        import javafx.scene.control.Label;
        import javafx.scene.layout.HBox;
        import org.springframework.stereotype.Component;
/**
 * @author Thomas Darimont
 */
@Component
public class HelloWorldComponent extends HBox {
    public HelloWorldComponent() {
        getChildren().add(new Label("Hello World"));
    }
}
