class Index { 
    int index; 
} 
class Solution {
   public static TreeNode buildUtil(int in[], int post[], int inStrt, 
                   int inEnd, Index pIndex) 
    { 
        // Base case 
        if (inStrt > inEnd) 
            return null; 
  
        /* Pick current node from Postrder traversal using 
           postIndex and decrement postIndex */
        TreeNode node = new TreeNode(post[pIndex.index]); 
        (pIndex.index)--; 
  
        /* If this node has no children then return */
        if (inStrt == inEnd) 
            return node; 
  
        /* Else find the index of this node in Inorder 
           traversal */
        int iIndex = search(in, inStrt, inEnd, node.val); 
  
        /* Using index in Inorder traversal, construct left and 
           right subtress */
        node.right = buildUtil(in, post, iIndex + 1, inEnd, pIndex); 
        node.left = buildUtil(in, post, inStrt, iIndex - 1, pIndex); 
  
        return node; 
    } 
    public TreeNode buildTree(int[] in, int[] post) {
        int n = post.length;
          Index pIndex = new Index(); 
        pIndex.index = n - 1; 
        return buildUtil(in, post, 0, n - 1, pIndex); 
    }
    public static int search(int arr[], int strt, int end, int value) 
    { 
        int i; 
        for (i = strt; i <= end; i++) { 
            if (arr[i] == value) 
                break; 
        } 
        return i; 
    } 
}