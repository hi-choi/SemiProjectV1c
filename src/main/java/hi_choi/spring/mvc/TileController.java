package hi_choi.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TileController {
	
	@RequestMapping("/index")
	public String index() {
		return "index.tiles";
	}
	
	@RequestMapping("/join")
	public String join() {
		return "join.tiles";
	}

	@RequestMapping("/login")
	public String login() {
		return "login.tiles";
	}
	
	@RequestMapping("/board/list")
	public String list() {
		return "board/list.tiles";
	}
	
	@RequestMapping("/board/view")
	public String view() {
		return "board/view.tiles";
	}
	
	@RequestMapping("/board/write")
	public String write() {
		return "board/write.tiles";
	}
	
	@RequestMapping("/board/writeok")
	public String writeok() {
		return "board/writeok.tiles";
	}
	
	@RequestMapping("/myinfo")
	public String myinfo() {
		return "myinfo.tiles";
	}
}
