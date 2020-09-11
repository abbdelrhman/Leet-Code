

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int hashTable [] = new int [101];
        for (int i=0 ; i<nums.length ; i++){
            hashTable[nums[i]]++;
        }
        int ans = 0 ;
        for (int i=0 ; i<hashTable.length ; i++){
            ans+= (hashTable[i]*(hashTable[i]-1))/2;
        }
        return ans;
    }

    
}