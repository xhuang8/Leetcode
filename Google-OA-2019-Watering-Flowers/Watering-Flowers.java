package test;

public class test {
	public static int minSteps(int[] plants, int capacity){
	    //check if the array it is empty
	    if(plants.length == 0 || plants == null){
	      return 0;
	    }

	    int steps = 0;
	    int volume = capacity;

	    for(int i = 0; i < plants.length; i++){
	      steps += 1;
	      if(volume < plants[i]){
	    	volume = capacity;
	        volume -= plants[i];
	        steps += 2 * i;
	      }
	      else{
	        volume -= plants[i];
	      }
	    }
	     return steps;
	  }
	
	public static void main(String[] args) {
	    int[] plants = new int[10];
			plants[0] = 7;
		    plants[1] = 6;
			plants[2] = 3;
			plants[3] = 4;
			plants[4] = 7;
			plants[5] = 9;
			plants[6] = 6;
			plants[7] = 2;
			plants[8] = 5;
			plants[9] = 8;
			System.out.println(minSteps(plants, 10));
	    //System.out.println("Hello world!");
	  }
}
