


public final class WordNet {
	
   private final int V;
   private int E;
   private Bag<Integer>[] adj;
	// constructor takes the name of the two input files
	//The constructor should throw a java.lang.IllegalArgumentException if the input does not correspond to a rooted DAG. 
	private int readSynSetFile(String fileName){
		In in = new In(fileName);
		int count = 0;
		while(in.hasNextLine()){
			in.readLine();
			//String[] words = line.split(",");
			
			//if(words.length != 3)
				//throw new IllegalArgumentException("Illegal file line");
			
				//int idx = Integer.parseInt(words[0]);
				//String synSet = words[1];
				//String gloss = words[2];
				count++;
			
		}
		
        return count;
	}
	private void readHyperNymFile(String fileName){
		In in = new In(fileName);
		while(in.hasNextLine()){
			String line = in.readLine();
			String[] words = line.split(",");
			
			int idx = Integer.parseInt(words[0]);
			if(adj[idx] == null)
				adj[idx] = new Bag<Integer>();
			for(int j=1;j<words.length;j++){
				int hyperNymIdx = Integer.parseInt(words[j]);
				if(cycleExists(hyperNymIdx))
					throw new IllegalArgumentException("Not a DAG");
				adj[idx].add(hyperNymIdx);
				
				E++;
			}
			
			
		}
	}
	private boolean cycleExists(int hyperNymIdx) {
		// TODO Auto-generated method stub
		return false;
	}
	public WordNet(String synsets, String hypernyms){
	    V = readSynSetFile(synsets);
	    adj = (Bag<Integer>[]) new Bag[V];
	    readHyperNymFile(hypernyms);
	    
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
