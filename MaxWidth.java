class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        int maxwidth=0;
        Deque<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            maxwidth=Math.max(size,maxwidth);
            while(size>0)
            {
                TreeNode node = q.poll();
                if(node==null)
                {
                    q.add(null);
                    q.add(null);
                    
                }
                else
                {
                    q.add(node.left);
                    q.add(node.right);
                }
                size--;
            }
           while(!q.isEmpty() && q.peekFirst()==null)
               q.pollFirst();
            while(!q.isEmpty() && q.peekLast()==null)
                q.pollLast();
            
            
            
        }
        
        return maxwidth;
        
        
    }
    
    
}