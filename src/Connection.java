
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
	
	// method for displaying the contents of the linked list from tail
//	public void displayListTail(){
//		Node currentNode = head;
//		
//		//set currentNode to the last node
//		while(currentNode.getNext()!=null) {
//			currentNode = currentNode.getNext();
//		}
//		
//		System.out.print("\nTHE VALUES ARE: ");
//		
//		//print the data backward from the last node to head
//		while (currentNode!=null) {
//			System.out.print(currentNode.getData() + " ");
//			currentNode = currentNode.getPrev();
//		}
//		
//	}
	 
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
