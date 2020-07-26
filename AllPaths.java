class Solution {
	
	private void dfs (int[][] graph, int source, List<Integer> list, List<List<Integer>> ans) {
		
		list.add (source);
		if (source == graph.length - 1) {
			ans.add (list);
		}
		
		for (int target : graph[source]) {
			List<Integer> temp = new ArrayList <>(list);
			dfs (graph, target, temp, ans);
		}
	}
	
	public List<List<Integer>> allPathsSourceTarget (int[][] graph) {
		
		List<List<Integer>> ans = new ArrayList <>();
		dfs (graph, 0, new ArrayList <>(), ans);
		return ans;
	}
}