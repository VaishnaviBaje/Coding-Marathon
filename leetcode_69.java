class Solution {
    public  int mySqrt(int x) {
        if(x<=3 && x>0){
            return 1;

        }
        else if(x==0){
            return 0;
        }
        int low=0;
        int high=x/2;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long square=(long)mid*mid;
            if(square==x){
                return mid;
            }
            else if(square<x){
                ans=mid;
                low=mid+1;
            }
            else{
                high =mid-1;
            }
        }
        return ans;
    }
}
