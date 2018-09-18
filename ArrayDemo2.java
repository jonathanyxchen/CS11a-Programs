public class ArrayDemo2 {

  public static void main(String[] args){

    int[] nums = new int[10]; // these are all initially 0

    TextIO.putf("Enter ten integers, on on each line!%n");
    for (int i=0; i<nums.length; i++){
      TextIO.putf("Number %d: ",i+1);
      nums[i] = TextIO.getlnInt();
    }

    TextIO.putf("Here are the numbers you entered and their sum%n");
    int sum=0;
    for (int i=0; i<nums.length; i++){
      sum += nums[i];
      TextIO.putf("%d ",nums[i]); // vals[i] is the ith element of the array
    }
    TextIO.putf("%nTheir sum is %d%n",sum);

    Arrays.sort(nums);

    TextIO.putf("Here is the same list of numbers after being sorted: %n");
    for (int i=0; i<nums.length; i++){
      TextIO.putf("%d ",nums[i]); // vals[i] is the ith element of the array
    }
    TextIO.putf("%n");
  }
}