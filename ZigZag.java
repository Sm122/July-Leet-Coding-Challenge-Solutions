class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) 
            return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.add(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            while (!s1.isEmpty()) {
                root = s1.pop();
                list.add(root.val);
                if (root.left != null) s2.add(root.left);
                if (root.right != null) s2.add(root.right);
            }
            if (!list.isEmpty()) result.add(list);
            list = new ArrayList<>();
            while (!s2.isEmpty()) {
                root = s2.pop();
                list.add(root.val);
                if (root.right != null) s1.add(root.right);
                if (root.left != null) s1.add(root.left);
            }
            if (!list.isEmpty()) result.add(list);
        }

        return result;
    }
}