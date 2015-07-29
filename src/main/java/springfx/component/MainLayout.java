package springfx.component;

/**
 * Created by vasiliy on 29.07.15.
 */
import javafx.scene.layout.GridPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author Thomas Darimont
 */
@Component
public class MainLayout extends GridPane {
    private final HelloWorldComponent helloWorldComponent;
    private final SinChartComponent sinChartComponent;
    @Autowired
    public MainLayout(HelloWorldComponent helloWorldComponent, SinChartComponent sinChartComponent) {
        this.helloWorldComponent = helloWorldComponent;
        this.sinChartComponent = sinChartComponent;
        initComponent();
    }
    private void initComponent() {
        add(this.helloWorldComponent, 0, 0);
        add(this.sinChartComponent, 0, 1);
    }
}
