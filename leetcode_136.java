class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> myset=new HashSet<>();
        for(int i:nums){
            if(myset.contains(i)){
            myset.remove(i);
        }
        else{
            myset.add(i);
        }
        }
        int result=myset.iterator().next();
        return result;
    
}
}
