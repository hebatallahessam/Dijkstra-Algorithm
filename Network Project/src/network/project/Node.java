/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network.project;

import java.util.ArrayList;

/**
 *
 * @author Hebat-allah Essam
 */
public class Node {
    public int nodeno; 
    public int cost; 
    public ArrayList<Edge> children=new ArrayList<Edge>() ;  
    public boolean visited=false;
    public Node(int node,int cost){
        nodeno=node;
        this.cost=cost;
        
    
    }

   
}
