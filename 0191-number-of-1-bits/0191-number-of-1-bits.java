class Solution {
    public int hammingWeight(int n) {
     String bin = Integer.toBinaryString(n); 
     int count = 0;
     for(char ch:bin.toCharArray()){
        if(ch=='1')count++;
     }  
     return count;
    }
}