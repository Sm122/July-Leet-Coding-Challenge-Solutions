class Solution {
    public String reverseWords(String s) {
        String s1 = s.replaceAll("\\s+"," ").trim();
        String s2[] = s1.split(" ");
        String s3 ="";
        for(int i =s2.length-1;i>=0;i--)
        {
            if(s2[i]==" ")
                continue;
            s3=s3.concat(s2[i]);
            s3=s3.concat(" ");
            
        }
        return s3.trim();
    }
}