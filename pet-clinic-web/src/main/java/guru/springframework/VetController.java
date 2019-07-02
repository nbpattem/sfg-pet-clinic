package guru.springframework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {
	
	@RequestMapping({"", "/"})
	public String indexPage() {
		return "vets/index";
	}

}
