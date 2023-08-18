package hackathon.project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FrontController {
    @GetMapping("/game/Korail/together")
    public String together(){
        return "redirect:http://101.101.210.80:3000/notice";
    }

    @GetMapping("/game/Korail/solo")
    public String solo() { return "redirect:http://101.101.210.80:3000/reserve_main"; }
}