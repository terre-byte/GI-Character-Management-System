import java.util.*;
public class MainInterface {
	
	static Connection connect = new Connection();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		int tempId = 0;
		
		do {
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
            
            System.out.println(choice);
		
            switch (choice) {
				case 1:
					System.out.println("\n--- ADD CHARACTER ---");
					System.out.print("ENTER A CHARACTER NAME: ");
					String tempName = scan.next();
				
					//check for duplicate
				
					System.out.print("ENTER WEAPON TYPE: ");
					String tempWeapon = scan.next();
				
					//check for duplicate
				
				
					System.out.print("ENTER ELEMENT TYPE: ");
					String tempElement = scan.next();
				
					//check for duplicate
				
					Node node = new Node(tempId+1,tempName,tempWeapon,tempElement);
					connect.addNode(node);
					System.err.println("CHARACTER ADDED!");
					tempId++;
					break;
				
				case 2:
					connect.displayNode();
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
