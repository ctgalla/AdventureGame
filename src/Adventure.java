import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Adventure Time Choose Your Own Adventure Game");
		System.out.println();
		
		Scanner scan = new Scanner (System.in);
		System.out.print("What time is it? ");;
		String time = scan.nextLine();
		if (time.equalsIgnoreCase("Adventure Time")){
			System.out.println ("Come on grab your friends!");
			System.out.println("We'll go to very distant lands with...");
			System.out.println();
			
				System.out.println("Would you like to adventure with 'Jake' the Dog or 'Cake' the Cat?(Jake or Cake)");
				String animal = scan.nextLine();
				
				
			if(animal.equalsIgnoreCase("Jake")){
				System.out.println("You chose Jake the Dog which makes you Finn the Human! Mathematical!");
				System.out.println();
				System.out.println("You are walking along the forest, when you hear a Princess cry out in distress!");
				System.out.println("You reach for your _____.Select a weapon: 'Sword' 'Ax Bass' 'Magic Wand'");
				
				String weapon = scan.nextLine();
				if(weapon.equalsIgnoreCase("Sword")){
					System.out.println("Good choice, now let's kick some Ice King booty!");
					System.out.println("Armed with your sword you approach the Ice King's castle where you find Princess Bubble Gum locked up. You use your sword to free her and then you all have a DANCE PARTY!");
				}else if (weapon.equalsIgnoreCase("Ax Bass")){
					System.out.println("You selected Marceline's Ax Bass. Marceline isn't too happy about you using her Ax without permission, she has decided to send you to the nightosphere and never return. GAME OVER.");
				}else if (weapon.equalsIgnoreCase("Magic Wand")){
					System.out.println("In order to use the Magic Wand you must first battle the ice king! You arrive at the Ice Kingdom empty handed. While you distract the Ice King with your charm, Jake frees the princess!");
				}
			
					
				
				
			}else if (animal.equalsIgnoreCase("Cake")){
				System.out.println("You chose Cake the Cat, which makes you Fionna the Human! Flippin' awesome!");
				System.out.println();
				System.out.println("You are walking along the forest, when you hear a Prince cry out in distress!");
				
				System.out.println("You reach for your _____.Select a weapon: 'Sword' 'Ax Bass' 'Magic Wand'");

				String weapon = scan.nextLine();
				if(weapon.equalsIgnoreCase("Sword")){
					System.out.println("Good choice, now let's kick some Ice Queen booty!");
					System.out.println("Armed with your sword you aproach the Ice Queen's castle where you find Prince Gumball locked up. You use your sword to free the prince and then you all have a DANCE PARTY!");
				}else if (weapon.equalsIgnoreCase("Ax Bass")){
					System.out.println("You selected Marceline's Ax Bass. Marceline isn't too happy about you using her Ax without permission, she has decided to send you to the nightosphere and never return. GAME OVER.");
				}else if (weapon.equalsIgnoreCase("Magic Wand")){
					System.out.println("In order to use the Magic Wand you must first battle the ice king! You arrive at the Ice Kingdom empty handed. While you distract the Ice Queen with your charm, Cake frees the prince!");
				}
				
			}else{
				System.out.println("UNACCEPTABLE! Please type Jake or Cake");
				scan.next();
			}
			
			
			
		}else{
			System.out.println("UNACCEPTABLE! Come back when you are ready to adventure!");
		
			
			
				
	
				
			    	
				
			}
 }
				
	
 
				
}	
				
		
	
	


