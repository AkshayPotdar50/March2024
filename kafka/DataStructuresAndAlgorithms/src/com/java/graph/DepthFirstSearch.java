package com.java.graph;

public class DepthFirstSearch  
{  
public static void main(String args[])   
{   
//creates a graph having 10 vertices  
Graph g = new Graph(10);   
//add edges to the graph    
g.addNewEdge(1, 2);   
g.addNewEdge(2, 3);   
g.addNewEdge(3, 4);   
g.addNewEdge(4, 5);   
g.addNewEdge(5, 7);  
g.addNewEdge(1, 3);   
g.addNewEdge(1, 5);   
g.addNewEdge(5, 5);   
g.addNewEdge(2, 6);   
g.addNewEdge(3, 7);  
//print sequencnce in which BFS traversal done   
System.out.println("Depth-first traversal of graph is: ");  
//traversal starts from the node 3 (as root node)  
g.DFS(1);   
}   
}  

