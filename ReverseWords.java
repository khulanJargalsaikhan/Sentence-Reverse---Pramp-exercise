package pramp;

class ReverseWords {
	/*
	 * Sentence Reverse
	You are given an array of characters arr that consists of sequences of 
	characters separated by space characters. Each space-delimited sequence of characters defines a word.

	Implement a function reverseWords that reverses the order of the words 
	in the array in the most efficient manner.

	Explain your solution and analyze its time and space complexities.
	 */

	static void reverse(char[] arr, int lo, int hi) {
	    while (lo<hi) {
	      char temp = arr[lo];
	      arr[lo] = arr[hi];
	      arr[hi] = temp;
	      lo++;
	      hi--;
	    }
	  }

	  static char[] reverseWords(char[] arr) {
	    int n = arr.length;
	    reverse(arr,0,n-1);
	    int pivot = 0;
	    for (int i=0;i<n;i++) {
	      if (arr[i]==' ') {
	        reverse(arr,pivot,i-1);
	        pivot = i+1;
	      } else if (i==n-1) {
	        reverse(arr,pivot,i);
	      }
	    }
	    return arr;
	  }

	public static void main(String[] args) {
	
	    System.out.println(reverseWords(new char[] {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ', 
													'm', 'a', 'k', 'e', 's', ' ',
													'p', 'r', 'a', 'c', 't', 'i', 'c', 'e' }));
	    
	    /* Expected output: [ 'p', 'r', 'a', 'c', 't', 'i', 'c', 'e', ' ',
        'm', 'a', 'k', 'e', 's', ' ',
        'p', 'e', 'r', 'f', 'e', 'c', 't' ] */
	    
	  }

}