public class Main {
    public static void main(String[] args) {
       WeightedGraph<String> graph = new WeightedGraph<>();
       Search<String> bfs = new BFS<>(graph, "Alimbay");
       graph.addVertex("Dilnaz");
       graph.addVertex("Aruzhan");
       graph.addVertex("Alimbay");
       graph.addEdge("Dilnaz","Aruzhan", 2);
       graph.addEdge("Dilnaz", "Alimbay", 18);
       graph.addEdge("Aruzhan", "Alimbay", 21);
        System.out.println(graph.getEdgesCount());
        outputPath(bfs, "Alimbay");



    }
    public static void outputPath(Search<String> search, String key) {
        for (String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }
    }
}