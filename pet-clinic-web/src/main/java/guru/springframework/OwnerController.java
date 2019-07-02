package guru.springframework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {
	
	private OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}
	
	@RequestMapping({"", "/"})
	public String getAllOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
		
	}

}
