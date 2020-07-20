class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int topSort[] = new int[numCourses];
        Map<Integer, List<Integer>> graph = new HashMap();
        for (int i = 0; i < numCourses; i++)
            graph.put(i, new ArrayList());

        for (int arr[] : prerequisites)
            graph.get(arr[1]).add(arr[0]);

        boolean visited[] = new boolean[numCourses];
        boolean recStack[] = new boolean[numCourses];
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == false) {
                boolean cyclePresent = dfs(graph, visited, i, stack, recStack);
                if (cyclePresent) return new int[0];
            }
        }

        for (int i = 0; i < numCourses; i++)
            topSort[i] = stack.pop();

        return topSort;
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, boolean visited[], int start, Stack<Integer> stack, boolean recStack[]) {
        visited[start] = true;
        recStack[start] = true;
        List<Integer> neighbours = graph.get(start);
        for (int node : neighbours) {
            if (!visited[node] && dfs(graph, visited, node, stack, recStack)) {
                return true;
            } else {
                if (recStack[node]) return true;
            }
        }
        recStack[start] = false;
        stack.push(start);
        return false;
    }
}