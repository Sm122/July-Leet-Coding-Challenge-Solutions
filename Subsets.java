class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
     List<List<Integer>> list = new ArrayList<List<Integer>>();
     
        for(int i =0;i<(1<<n);i++)
        {
            ArrayList<Integer> ar = new ArrayList<>();
            for(int j =0;j<n;j++)
            {
                if((i & (1<<j)) > 0)
                    ar.add(nums[j]);
            }
            list.add(ar);
        }
       return list; 
    }
}