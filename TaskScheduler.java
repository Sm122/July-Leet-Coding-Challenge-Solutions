class Solution {
    public int leastInterval(char[] tasks, int n) {
     int count[] = new int[26];
     for(int i =0;i<tasks.length;i++)
     {
         count[tasks[i]-'A']++;
     }
        Arrays.sort(count);
        int interval=count[25]-1;
        int spaces=interval*n;
        for(int j=24;j>=0;j--)
        {
            spaces=spaces-Math.min(interval,count[j]);
        }
        spaces=Math.max(0,spaces);
        int result=tasks.length+spaces;
        return result;
    }
}