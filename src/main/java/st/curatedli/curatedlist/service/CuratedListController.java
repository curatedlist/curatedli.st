package st.curatedli.curatedlist.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuratedListController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
