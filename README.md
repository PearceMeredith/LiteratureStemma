# LiteratureStemma

LiteratureStemma is a Java program for developing tree representations of ancient texts and their translations/copies.
STILL IN DEVELOPMENT. (planning on visual component and pathfinding)

## Installation

Download the package titled "tree", this package contains three Java programs. 

## Usage

You should only be editing the RunStemma program as your main function calls. 
```
		StemmaTree exampleStemma = new StemmaTree();
		exampleStemma.addText("Author1", "Title1",2021);
		exampleStemma.addText("Author2", "Title2", 2020);
		System.out.println(exampleStemma.allNodes);
		exampleStemma.addConnection("Title1", "Title2");
		System.out.println(exampleStemma);
    
```

## Author
Written by Meredith Pearce, on 10/9/2020.
