class Solution {
    public int hammingWeight(int n) {
    
    
    // Optimised Soln

    int count =0;
    while(n>0){
        count++;
        n=(n&(n-1));
    }
    return count;

    //  String bin = Integer.toBinaryString(n); 
    //  int count = 0;
    //  for(char ch:bin.toCharArray()){
    //     if(ch=='1')count++;
    //  }  
    //  return count;
    }
}



//return Integer bitcount(n);  method 2 

