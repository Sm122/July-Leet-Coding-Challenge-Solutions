class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
       if((p!=null && q==null)||(p==null && q!=null)||(p.val!=q.val))
           return false;
        //if((p.left!=q.left) || (p.right!=q.right))
            //return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}