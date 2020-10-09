package tree;
/**
 * A basic example program on how to create and print a Stemma for literature
 * @author Meredith Pearce
 * @date 10/9/20
 *
 */

public class RunStemma {
	public static void main(String[] args) {
		StemmaTree exampleStemma = new StemmaTree();
		exampleStemma.addText("Author1", "Title1",2021);
		exampleStemma.addText("Author2", "Title2", 2020);
		System.out.println(exampleStemma.allNodes);
		exampleStemma.addConnection("Title1", "Title2");
		System.out.println(exampleStemma);
	}
}
