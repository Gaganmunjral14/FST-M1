package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initialize an array
		int[] arrayNum = {10, 77, 10, 54, -11, 10};
		
		
		//Set constants
		int searchNum = 10;
		int fixedNum = 30;
		
		 //Print result
        System.out.println("Result: " + result(arrayNum, searchNum, fixedNum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }		

}
