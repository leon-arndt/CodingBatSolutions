public int centeredAverage(int[] nums) {
  int biggest = 0;
  int smallest = 100;
  int sum = 0;
  int cenAvg = 0;
 
  for (int i = 0; i < nums.length; i++) {
    biggest = Math.max(biggest, nums[i]);
    smallest = Math.min(smallest, nums[i]);
    sum += nums[i];
  }
  cenAvg = (sum - biggest - smallest) / (nums.length - 2);
  return cenAvg;
}
