class Solution {
     public static List<Integer> res = new ArrayList<Integer>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
        for(int i =height(root);i>0;i--)
        {
            printLevel(root,i);
            result.add(res);
            res = new ArrayList<Integer>();
        }
      
      return result;  
    }
    static int height(TreeNode root)
    {
        if(root==null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return (lh>rh)?lh+1:rh+1;
    }
    static void printLevel(TreeNode root, int level)
    {
       
        if(root == null)
            return;
        if(level==1)
            res.add(root.val);
        else if(level>1)
        {
            printLevel(root.left,level-1);
            printLevel(root.right,level-1);
        }
    }
    
}