class Solution {
    public int nthUglyNumber(int n) {
        int ugly[] = new int[n];
        int i1=0;
        int i2=0;
        int i3=0;
        int fact2=2;
        int fact3=3;
        int fact5=5;
        ugly[0]=1;
        for(int i =1;i<n;i++)
        {
            int min = Math.min(Math.min(fact2,fact3),fact5);
            ugly[i]=min;
            if(fact2==min)
            {
                fact2= 2*ugly[++i1];
            }
            if(fact3==min)
            {
                fact3=3*ugly[++i2];
            }
            if(fact5==min)
            {
                fact5=5*ugly[++i3];
            }
            
        }
       return ugly[n-1];     
    }
}