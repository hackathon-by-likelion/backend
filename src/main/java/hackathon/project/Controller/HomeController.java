package hackathon.project.Controller;

import hackathon.project.domain.Member;
import hackathon.project.repository.DataMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Autowired
    private DataMemberRepository memberRepository;

    @GetMapping("/")
    public String home(){ return "home"; }

    @GetMapping("/home/info")
    public String intfo() {
        return "info";
    }

    @GetMapping("/home/select")
    public String select() {
        return "select";
    }

    @GetMapping("/home/tutorial")
    public String tutorial() { return "tutorial"; }

    @PostMapping("/home/save")
    public String save(@ModelAttribute("memberForm") MemberForm form, Model model){
        model.addAttribute("ageGroup", form.getAgeGroup());
        model.addAttribute("gender", form.getGender());
        Member member = new Member();
        member.setAgeGroup(form.getAgeGroup());
        member.setGender(form.getGender());

        memberRepository.save(member);
        return "game/korail/KorailIndex"; // 선택 완료 후 홈 페이지로 이동
    }
}
