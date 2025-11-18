package arraysInterviewCoding;

public class FindTheSecondLargestArray {

	public static void main(String[] args) {
		
		int largestNumber =Integer.MIN_VALUE;
		int secondLargest =Integer.MIN_VALUE;
		
		int arr [] = { 1,3,2,7,5} ;
		
		for(  int no : arr ) {
			if(no>largestNumber) {
				secondLargest=largestNumber;
				largestNumber=no;
			} else if (no >secondLargest && no!=largestNumber) {
				secondLargest=no;
			}
			
		}
		
		System.out.println("Largest Number is " + largestNumber);
		System.out.println("Second largest Number is  " + secondLargest);

		
		
	}

}
