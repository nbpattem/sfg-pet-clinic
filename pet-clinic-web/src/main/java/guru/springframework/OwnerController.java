package guru.springframework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	@RequestMapping({"", "/"})
	public String indexPage() {
		return "owners/index";
	}

}
