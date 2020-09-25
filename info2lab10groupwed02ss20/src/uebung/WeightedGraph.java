package uebung;

import java.nio.file.Path;
import java.nio.file.Paths;

public class WeightedGraph {



    public static void main(String[] args) {
        Path path = Paths.get("rsc//graph1.txt");
        int vertices = Reader.zeilenZaehlen(path);
        Graph graph = new Graph(vertices);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);
        graph.printGraph();
    }
}
