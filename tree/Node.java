package tree;

import java.util.*;

/**
 * A simple Node class as it applies to the Stemma package.
 * @author Meredith Pearce
 * @date 10/9/20
 *
 */
public class Node {
	String author;
	String title;
	int year;
	List<Node> children;
	
	public Node(String author,String title, int year) {
		this.author=author;
		this.title = title;
		this.year = year;
		this.children = new ArrayList<Node>();
	}
	public void addChild(Node child) {
		children.add(child);
	}
	public String toString() {
		return(author + " "+ title + " " + year);
	}
	
	public static void main(String[] args) {
		Node node1 = new Node("Author1", "Title1",2021);
		Node node2 = new Node("Author2", "Title2", 2020);
		System.out.println(node1);
		System.out.println(node2);
		node1.addChild(node2);
		System.out.println(node1.children);
	}
}
