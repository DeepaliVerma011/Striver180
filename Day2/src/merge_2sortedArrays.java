import java.util.Arrays;

public class merge_2sortedArrays {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i =m;i<m+n;i++)
            {
                if(nums1[i]==0)
                {
                    nums1[i]=nums2[i-m];
                }
            }
            Arrays.sort(nums1);
        }
    }
}
