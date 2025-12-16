package Search;
public class PeakIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2};
        
        // Create instance to call non-static method
        PeakIndex obj = new PeakIndex();
        // Call the method and print result directly
        System.out.println("Peak Element is at Index: "+obj.mountain(arr));
    }
  public int mountain(int[] arr) {
  int start = 0;
  int end = arr.length - 1;
  
  while(start < end) {  // Changed from <= to < to prevent infinite loop
      int mid = start + (end - start) / 2;
      
      if(arr[mid] > arr[mid + 1]) {
          // We're in decreasing part of array
      	//this may be the ans, but look at left
      	//this is why end!=mid-1
          end = mid;
      } else {
          // We're in increasing part of array
          start = mid + 1;//bcoz we know that mid+1 > mid
      }
  }
  return start;

//in the end, star==end and pointing to the largest no bcoz of the 2 checks above
//start and end are always trying to find max element in the above 2 checks
//hence, when they are pointing to just one element, that is the max one bcoz that is what checks say
//More elaboration: at evey point of time for start and end,the have the best poosible answer till that timr
//and if we are saying that only one time is remaining, hence bcuz of above line that is the best possible ans 
  
    }
}
