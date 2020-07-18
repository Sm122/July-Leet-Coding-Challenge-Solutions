class Solution {
    public double angleClock(int h, int m) {
       double res = 0.0;
       if(h==12)
       {
           h=0;
       }
        if(m==60)
        {
            m=0;
            h+=1;
            if(h>12)
                h=h-12;
        }
        double minangle = (m)*6;
        double hrangle =((h*60)+m)*0.5;
        res=Math.abs(hrangle-minangle);
        res=Math.min(res,360-res);
        return res;
           
    }
}