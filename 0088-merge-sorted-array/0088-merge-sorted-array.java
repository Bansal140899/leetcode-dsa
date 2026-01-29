class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     Arrays.sort(nums1);
    //     Arrays.sort(nums2);

    //     for(int i =0 ;i<nums2.length; i++){
    //         nums1[i] = nums2[i];
    //     }

    //    Arrays.sort(nums1);
    int nums3[] = new int[m+n];
    int i =0;
    int j =0;
    int k =0;

    while(i<m && j<n){
        if(nums1[i]>nums2[j]){
            nums3[k++] = nums2[j];
            j++;
        }else{
            nums3[k++] = nums1[i];
            i++;
            
        }
    }
    while(i<m){
        nums3[k++]=nums1[i];
        i++;
    }
    while(j<n){
        nums3[k++] = nums2[j];
        j++;
    }
    
    // Arrays.sort(nums3);
        
    for(int l =0 ; l<nums1.length; l++){
        nums1[l] = nums3[l];

    }
}}