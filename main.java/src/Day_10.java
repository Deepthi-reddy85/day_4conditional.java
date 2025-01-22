public class Day_10 {
    public static void main(String[] args) {
            }
      public static void mergeArrays(int[] nums1,int m,int[] )    
      int[] newArr = new int[m+n];
      int p1=0;
      int p2=0;
      int idx=0; 

      while(p1<m && p2<n){
        if(nums1[p1]<=nums[p2]){
            p1++;
            newArr[idx]=nums1[p1];
        } else{
            newArr[idx]=nums2[p2];
            p2++
        }
        idx++;

        }
      }
      while(p1<m){
        newArr[idx++]=nums1[p1++];

      }
      while(p1<n){
        newArr[idx++]=nums1[p2++];

}
    

