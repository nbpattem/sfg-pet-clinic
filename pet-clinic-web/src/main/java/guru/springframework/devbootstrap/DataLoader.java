package guru.springframework.devbootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.model.Owner;
import guru.springframework.model.Pet;
import guru.springframework.model.Vet;
import guru.springframework.services.OwnerService;
import guru.springframework.services.PetService;
import guru.springframework.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {
	
	private OwnerService ownerService;
	private VetService vetService;
	
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner();
		owner1.setFirstName("owner1");
		owner1.setLastName("last1");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("owner2");
		owner2.setLastName("last2");
		
		ownerService.save(owner2);
		
		Vet vet1 = new Vet();
		vet1.setFirstName("vet1");
		vet1.setLastName("last1");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("vet2");
		vet2.setLastName("last2");
		vetService.save(vet2);
		System.out.println("Dataloader called");
		
		System.out.println("All owners:" + ownerService.findAll());

	}

}
