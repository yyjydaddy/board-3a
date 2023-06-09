package idusw.springboot.board3a.controller;

import idusw.springboot.board3a.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    /*
     * Field Injection (필드 주입) : Spring Framework 에게 MemoService형 객체를 주입(해줄 것을 알림)
    @Autowired
    MemoService memoService;
     */

    // lcoalhost:port로 요청을 하면 getAdmin() 메소드를 호출하여 처리하고, /admin/index view에게 전달
    @GetMapping("/")
    public String getAdmin() {
        return "/admin/index";
    }
}
