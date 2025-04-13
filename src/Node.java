
public class Node {

	

	// storage for the node data
	 private int id;
	 private String name; 
	 private String weapon;
	 private String element;
	 private String rarity;
	 
	 // storage for the address of the next node
	 private Node next;
	 
	 // storage for the address of the previous node
	 private Node prev;
	 


	 // a no-argument constructor that creates a node with default values
	 public Node() {
		 id = 0;
		 name = "";
		 weapon = "";
		 element = "";
		 rarity = "";
		 next = null;
		 prev = null;
		 
	 }

	 // a constructor that creates a node with initial data specified by the parameter
	 public Node(int id, String name, String weapon, String element) {
		 this.id = id;
		 this.name = name;
		 this.weapon = weapon;
		 this.element = element;
		 next = null;
		 prev = null;
	 }
	 
	 //getters and setters
	 public int getId() {
		 return id;
	 }

	 public void setId(int id) {
		 this.id = id;
	 }

	 public String getName() {
		 return name;
	 }

	 public void setName(String name) {
		 this.name = name;
	 }

	 public String getWeapon() {
		 return weapon;
	 }

	 public void setWeapon(String weapon) {
		 this.weapon = weapon;
	 }

	 public String getElement() {
		 return element;
	 }

	 public void setElement(String element) {
		 this.element = element;
	 }
	 
	 public String getRarity() {
		 return rarity;
	 }

	 public void setRarity(String rarity) {
		 this.rarity = rarity;
	 }

	 public Node getNext() {
		 return next;
	 }

	 public void setNext(Node next) {
		 this.next = next;
	 }

	 public Node getPrev() {
		 return prev;
	 }

	 public void setPrev(Node prev) {
		 this.prev = prev;
	 }
}
