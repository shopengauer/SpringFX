package springfx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vasiliy on 29.07.2015.
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){

        return "homr";
    }

}
