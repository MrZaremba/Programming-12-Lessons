package com.zaremba.graphs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Node> graph;
    public static String r = "";
    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS(graph.get(0));
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(graph.get(1));
        //BFSRec(queue);
    }

    private static void BFSRec(LinkedList<Node> queue) {
        if (queue.isEmpty()) {
            return;
        }
        else{
            Node node = queue.pollFirst();
            System.out.println(node);
            node.setVisited(true);
            for (Integer i : node.getNodes()) {
                Node n = getNode(i);
                if (!n.isVisited()) {
                    queue.add(n);
                    n.setVisited(true);
                }
            }
            BFSRec(queue);
        }
    }

    private static void BFS() {
        //Your code here.  Feel free to modify signature or add helper functions.
        r+=1+"";
        BFS(getNode(1));
    }
    public static Node getNode(int key){
        for (int i=0; i<graph.size(); i++){
            Node n = (Node) (graph.get(i));
            if (n.getKey()==key) return n;
        }
        return null;
    }
    private static void BFS(Node n){
        n.setVisited(true);
        System.out.println(n);
        for (int i=0; i<n.getNodes().size(); i++){
            Integer v = (Integer) n.getNodes().get(i);
            Node c = getNode(v.intValue());
            if(!c.isVisited()){
                if (r.indexOf(""+c.getKey())==-1)
                    r+=c.getKey()+"";
            }
        }
        for (int i=0; i<n.getNodes().size(); i++){
            Integer V = (Integer) n.getNodes().get(i);
            Node c = getNode(V.intValue());
            if (!c.isVisited()) {
                BFS(c);
            }

        }
    }

    private static void setupTree() throws FileNotFoundException {
        graph = new ArrayList<>();
        Scanner scan = new Scanner(new File("tree.txt"));
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}
