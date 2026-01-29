class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> s1 = new HashSet<>();
        ArrayList<Integer> l2 = new ArrayList<>(10001);

        for(int  num : nums){
            if(!s1.add(num)){
                l2.add(num);
            }
        }
        return l2;
        
    }
}