import java.util.*;
public class MainInterface {
	
	static Connection connect = new Connection();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		int tempId = 0;
		
		do {
			while (true) {
				System.out.println("\n--- GENSHIN IMPACT SYSTEM ---");
	            System.out.println("[1] ADD CHARACTER");
	            System.out.println("[2] VIEW ALL CHARACTER");
	            System.out.println("[3] UPDATE CHARACTER");
	            System.out.println("[4] DELETE CHARACTER");
	            System.out.println("[5] EXIT");
	            System.out.print("ENTER YOUR CHOICE: ");
	            
	            try {
					choice = scan.nextInt();
					break;
				} catch (Exception e) {
					System.err.println("INVALID INPUT, PLEASE ENTER VALID CHOICE!");
					scan.nextLine();
				}
			}

            switch (choice) {
				case 1:
					boolean repeat = true;
					String tempName = "", tempWeapon = "", tempElement  = "";
					int tempRarity = 0;
					System.out.println("\n--- ADD CHARACTER ---");
					
					while (repeat){
						System.out.print("ENTER A CHARACTER NAME: ");
						tempName = scan.next();
						
						if (connect.checkDuplicateName(tempName)) {
							System.err.println("THERE IS A DUPLICATE NAME ON THE LIST!");
							System.err.println("TRY ENTERING DIFFERENT NAME!");
							repeat = true;
						}
						else {
							repeat = false;
						}
						
					}
					repeat = true;
					while (repeat){
						System.out.println("WEAPON TYPE: SWORD, CLAYMORE, CATALYST, BOW, POLEARM ");
						System.out.print("ENTER WEAPON TYPE : ");
						tempWeapon = scan.next();
						
						if (connect.checkWeapon(tempWeapon)) {
							System.err.println("INVALID WEAPON");
							System.err.println("TRY ENTERING WEAPON FROM THE DATABASE!");
							repeat = true;
						}
						else {
							repeat = false;
						}
						
					}
					
					repeat = true;
					while (repeat){
						System.out.println("ELEMENT TYPE: CRYO, PYRO, ELECTRO, HYDRO, GEO, ANEMO, DENDRO");
						System.out.print("ENTER ELEMENT TYPE : ");
						tempElement = scan.next();
						
						if (connect.checkElement(tempElement)) {
							System.err.println("INVALID ELEMENT");
							System.err.println("TRY ENTERING ELEMENT FROM THE DATABASE!");
							repeat= true;
						}
						else {
							repeat = false;
						}
						
					}
					
					repeat = true;
					while (repeat){
						System.out.println("RARITY: [4]-STAR OR [5]-STAR");
						System.out.print("ENTER RARITY: ");
						
			            try {
			            	tempRarity = scan.nextInt();
			            	repeat = true;
						} catch (Exception e) {
							System.err.println("INVALID INPUT, PLEASE ENTER VALID CHOICE!");
							scan.nextLine();
						}
						
						if (connect.checkRarity(tempRarity)) {
							System.err.println("INVALID RANGE");
							System.err.println("TRY ENTERING WEAPON FROM THE DATABASE!");
							repeat = true;
						}
						else {
							repeat = false;
						}
						
					}
				
					//check for duplicate
				
					Node node = new Node(tempId+1,tempName,tempWeapon,tempElement);
					connect.addNode(node);
					
					
					
					
					
					System.err.println("CHARACTER ADDED!");
					tempId++;
					break;
				
				case 2:
//					connect.displayNode();
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					System.out.println("EXITING");
					break;
				default: System.err.println("INVALID RANGE!");
            }
		}while (choice != 5);
		scan.close();
	}
}
