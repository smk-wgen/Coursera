package hw1;

import java.util.List;

public final class WordNet {
	private final int V = -1;
	private final List<Integer>[] adj = null;
	// constructor takes the name of the two input files
	//The constructor should throw a java.lang.IllegalArgumentException if the input does not correspond to a rooted DAG. 
	public WordNet(String synsets, String hypernyms){
		//In.read
		
		
	}

	// returns all WordNet nouns
	public Iterable<String> nouns(){
		throw new UnsupportedOperationException("Not Implemented yet");
	}

	// is the word a WordNet noun?
	public boolean isNoun(String word){
		throw new UnsupportedOperationException("Not Implemented yet");
	}

	// distance between nounA and nounB (defined below)
	
	public int distance(String nounA, String nounB){
		throw new UnsupportedOperationException("Not Implemented yet");
	}

	// a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
	// in a shortest ancestral path (defined below)
	public String sap(String nounA, String nounB){
		throw new UnsupportedOperationException("Not Implemented yet");
	}

	// for unit testing of this class
	public static void main(String[] args){
		System.out.println("Do nothing");
	}

}
