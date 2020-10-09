package tree;
import java.util.*;

/**
 * A program for building and adding to a tree for ancient texts. 
 * 
 * @author mered
 * @date 10/9/20
 * 
 */
public class StemmaTree {
	List<Node> allNodes;
	
	public StemmaTree() {
		this.allNodes = new ArrayList<Node>();
	}
	
	/**
	 * Creates a new node for the tree with the given information
	 * @param author, author of the text
	 * @param title, title of the text
	 * @param year, estimated year text was written, put -1 if unknown
	 */
	public void addText(String author,String title, int year) {
		Node newText = new Node(author,title,year);
		allNodes.add(newText);
	}
	
	/**
	 * Creates a parent child relationship between the two texts, indentified
	 * by their titles. The order does not matter. 
	 * @param title1, title of one of the texts
	 * @param title2, title of other text in relationship
	 */
	public void addConnection(String title1, String title2) {
		Node text1 = null;
		Node text2 = null;
		for(Node node: allNodes) {
			if(node.title.equals(title1)) {
				text1 = node;
			}else if(node.title.equals(title2)) {
				text2 = node;
			}
		}if(text1 == null || text2 == null) {
			return;
		}else{
			makeConnection(text1,text2);
		}
	}
			
			
	/**
	 * Creates the parent child relationship between two nodes and established the order
	 * between them based on the year of creation. Order of parameters does not matter 
	 * @param text1, first text of connection
	 * @param text2, second text of connection
	 */
	private void makeConnection(Node text1, Node text2) {
		Node parent;
		Node child;
		if(text1.year>text2.year) {
			parent = text1;
			child = text2;
		}else {
			parent = text2;
			child = text1;
		}
		
		parent.addChild(child);
	}
	
	/**
	 * Returns a string of all of the nodes within the tree and the children of each of the nodes
	 */
	public String toString() {
		StringBuilder string = new StringBuilder();
		for(Node node:allNodes){
			string.append("Author:"+node.author + ", Title:" + node.title+ ", Year: " + node.year + "	CHILDREN" + node.children +  "\n");
		}return string.toString();
	}

	//add a pathfinding function : should find number of connections between and total time between the two texts

}
