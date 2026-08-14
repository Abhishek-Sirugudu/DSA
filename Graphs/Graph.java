package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    int V;
    List<List<Integer>> adj;

    Graph(int V){
        this.V = V;
        this.adj = new ArrayList<>();

        for(int i = 0; i <= V; i++){
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v,boolean directed){
        adj.get(u).add(v);

        if(!directed){
            adj.get(v).add(u);
        }
    }

    public void display(){
        for(int i = 1; i<= V; i++){
            System.out.print(i+" Connected to");
            for(int neighbor : adj.get(i)){
                System.out.print(neighbor);
            }
            System.out.println();
        }
    }

    public void bfs(int start){
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int val = q.poll();
            System.out.print(val+" ");

            for(int i : adj.get(val)){
                if(!visited[i]){
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }
    private void dfsHelper(int node,boolean[] visited){
        visited[node] = true;
        System.out.print(node);
        for (int i : adj.get(node)){
            if(!visited[i]){
                dfsHelper(i,visited);
            }
        }
    }
    public void dfs(int start){
        boolean[] visited = new boolean[adj.size()];

        dfsHelper(start,visited);

    }

    public int countConnectedComponents(){
        int counter = 0;
        boolean[] visited = new boolean[adj.size()];

        for(int i = 1; i <= V; i++){
            if(!visited[i]){
                dfsHelper(i,visited);
                counter++;

            }
        }
        return counter;
    }

    public boolean checkForCycle(){
        boolean[] visited = new boolean[adj.size()];
        for (int i = 1; i <= V ; i++) {
            if(!visited[i]){
                if(isCycle(i,visited)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean isCycle(int node, boolean[] visited){
        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[] {node,-1});
        visited[node] = true;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int child = curr[0];
            int parent = curr[1];

            for(int i : adj.get(child)){
                if(!visited[i]){
                    visited[i] =true;
                    q.offer(new int[] {i,child} );
                }else if(visited[i] && parent != i){
                    return true;
                }

            }
        }
        return false;
    }
    private boolean helperCycleDirected(boolean[] visited, boolean[] stack,int i){
        visited[i] = true;
        stack[i] = true;

        for (int neighbor : adj.get(i)){
            if(!visited[neighbor]){
                if(helperCycleDirected(visited,stack,neighbor)){
                    return true;
                }
            }else if(visited[neighbor] && stack[neighbor]){
                return true;
            }
        }
        stack[i] = false;
        return false;
    }
    public boolean isCycleDirected(){
        boolean[] visited = new boolean[adj.size()];
        boolean[] stack = new boolean[adj.size()];

        for(int i = 1; i <= V; i++){
            if(!visited[i]){
                if(helperCycleDirected(visited,stack,i)){
                    return true;
                }
            }
        }
        return false;
    }
}
