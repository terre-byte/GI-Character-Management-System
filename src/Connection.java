
public class Connection {
	// storage for the address of the first node
	private Node head;

	 // set and get methods for the first node
	public Node getHead() {
		return head;
	}
	public void setHead(Node head){
		this.head = head;
	}

	// method for adding a new node
	public void addNode(Node node){
		if(head==null) { 
			head = node;
		}
		else {
			Node currentNode = head;
			while(currentNode.getNext()!=null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(node);
			node.setPrev(currentNode);
		 }
	}
	 
	// method for displaying the contents of the linked list from head
	public void displayNode() {
		
		if(head!=null) {
			System.out.printf("%-5s %-20s %-15s %-15s \n", "ID", "NAME", "WEAPON", "ELEMENT");
			Node currentNode = head;
			while(currentNode!=null) {
				System.out.printf("%-5d %-20s %-15s %-15s\n", currentNode.getId(), currentNode.getName(), currentNode.getWeapon(), currentNode.getElement());
				currentNode = currentNode.getNext();
			}
		}
		else {
			System.out.print("\nTHE LIST IS EMPTY");
		}
	}
	
	public boolean checkDuplicateName(String tempName) {
		boolean isDuplicate = false;
		if(head!=null) {
			Node currentNode = head;
			while(currentNode!=null) {
				if (currentNode.getName().equalsIgnoreCase(tempName)) {
					isDuplicate = true;
					break;
				}
				currentNode = currentNode.getNext();
			}
		}
		return isDuplicate;
	}
	
	public boolean checkWeapon(String tempWeapon) {
		boolean isValid = false;
		String[] arrayOfWeapon = {"Sword", "Claymore", "Catalyst", "Bow", "Polearm"};
		
		for (int i = 0; i < arrayOfWeapon.length; i++) {
			if (tempWeapon.equals(arrayOfWeapon[i])) {
				isValid = true;
				break;
			}
			else {
				isValid = false;
			}
		}
		return isValid;
	}
	
	public boolean checkElement(String tempElement) {
		boolean isValid = false;
		String[] arrayOfElement = {"Cryo", "Pyro", "Electro", "Hydro", "Geo", "Anemo", "Dendro"};
		
		for (int i = 0; i < arrayOfElement.length; i++) {
			if (tempElement.equals(arrayOfElement[i])) {
				isValid = true;
				break;
			}
			else {
				isValid = false;
			}
		}
		return isValid;
	}
	
	public boolean checkRarity(int tempRarity) {
		boolean isValid = false;
		
		if (tempRarity == 4 || tempRarity == 5) {
			isValid = true;
		}
		else {
			isValid = false;
		}
			
		
		return isValid;
	}
	 
	// method for getting the length of the linked list
	public int getLength() {
		int counter = 0;
		Node currentNode = head;
		while(currentNode!=null){
			counter++;
			currentNode = currentNode.getNext();
		}
		return counter;
	}

}
