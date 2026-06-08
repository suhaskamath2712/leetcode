class Solution {
    public int[] findOrder(int num, int[][] p) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[num];

        for (int i=0;i<p.length;i++) {
            int u=p[i][0];
            int v=p[i][1];
            adj.get(v).add(u);
            indegree[u]++;
        }

        Queue<Integer> q=new LinkedList<>();
        

        for (int i = 0; i < num; i++) {
            if (indegree[i]==0) {
                q.offer(i);
            }
        }
        int[] a=new int[num];
        int i=0;
        while (!q.isEmpty()) {
            int node=q.poll();
            a[i++]=node;
            for(int nbr:adj.get(node)){
                indegree[nbr]--;
                if(indegree[nbr]==0){
                    q.offer(nbr);
                }
            }
        }

        return i==num?a:new int[0];
    }
}