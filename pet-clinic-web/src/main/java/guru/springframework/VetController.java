package guru.springframework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.services.VetService;

@Controller
@RequestMapping("/vets")
public class VetController {

	private VetService vetService;

	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@RequestMapping({ "", "/" })
	public String getAllVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}

}
