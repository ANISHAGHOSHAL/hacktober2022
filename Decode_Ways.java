class Solution {
    public int numDecodings(String s) {
       
       if(s.charAt(0)=='0') return 0;
       
       if(s.length()==1)   return 1;
       
       int pTp = 1, p = 1;
       for(int i=1;i<s.length();i++){
           int d = s.charAt(i)-'0';
           int dd = (s.charAt(i-1)-'0')*10+d;
           int cur = 0;
           
           if(d>0) cur = cur+p;   
           
           if(dd>=10 && dd<=26)    cur = cur+pTp;
           
           pTp = p;
           p = cur;
       }
       return p;
   }
}