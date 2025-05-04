package Graph;

import java.util.*;

public class Graph {

    public static List<Integer> bfsOfGraph(int V, List<Integer> adj[]) {

        List<Integer> result=new ArrayList<>();
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;

        while (!queue.isEmpty()){
            int node=queue.poll();
            result.add(node);
            for (int numb:adj[node]){
                if (!visited[numb]==true){
                    visited[numb]=true;
                    queue.add(numb);
                }
            }
        }
        return result;
    }

    public static List<Integer> dfsOfGraph(int V, List<Integer> adj[]) {

        List<Integer> result=new ArrayList<>();
        boolean[] visited=new boolean[V];
        dfs(0,adj,visited,result);
        return result;

    }

    private static void dfs(int i, List<Integer>[] adj, boolean[] visited, List<Integer> result) {

        visited[i]=true;
        result.add(i);

        for (int num:adj[i]){
            if (!visited[num]==true){
                dfs(num,adj,visited,result);
            }
        }
    }

    public static void main(String[] args)  {

        int V = 5;
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        adj[0].add(2);
        adj[0].add(3);
        adj[0].add(1);
        adj[1].add(0);
        adj[2].add(0);
        adj[2].add(4);
        adj[3].add(0);
        adj[4].add(2);

        System.out.println(bfsOfGraph(V,adj));
        System.out.println(dfsOfGraph(V,adj));

    }

}

