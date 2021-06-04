package hi_choi.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SungJukController {
	
	@RequestMapping("/sungjuk")
	public String sungjuk() {
		return "sungjuk.tiles";
	}

}
