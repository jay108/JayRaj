package javaapplication1;
import java.util.*;
import java.net.*;
class Graph
{
    int v;
    LinkedList<Integer>adj[];
    Graph(int v)
    {
        this.v=v;
        adj=new LinkedList[v];
        for(int i=0;i<v;++i)
        {
           adj[i]=new LinkedList();
        }
    }
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    void BFS(int s)
    {
        LinkedList<Integer> queue=new LinkedList<Integer>(); //queue for visiting Node 
        boolean visited[]=new boolean[v];
        visited[s]=true;
        queue.add(s);
        while(queue.size()!=0)
        {
            s=queue.poll();//pulling out from queue..
            System.out.println(s + " ");
            Iterator<Integer>i=adj[s].listIterator();
            while(i.hasNext())
            {
                int n=i.next();
                if(!visited[n]) 
                {
                    queue.add(n);
                }
            }
        }
    }
}

    public class Ex2 
{
    public static void main(String arg[])
    {
        Graph g=new Graph(4);
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(2,4);
        System.out.println("Following BFS is ");
        g.BFS(2);
    }
}
