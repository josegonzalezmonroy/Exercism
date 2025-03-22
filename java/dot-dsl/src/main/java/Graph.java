import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Graph {

    private final List<Node> nodes;
    private final List<Edge> edges;
    private final Map<String, String> attributes;

    public Graph() {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.attributes = Map.of();
    }

    public Graph(Map<String, String> attributes) {
        this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
        this.attributes = Map.copyOf(attributes);
    }

    public Graph node(String name) {
        nodes.add(new Node(name));
        return this;
    }

    public Graph node(String name, Map<String, String> attributes) {
        nodes.add(new Node(name, attributes));
        return this;
    }

    public Graph edge(String start, String end) {
        edges.add(new Edge(start, end));
        return this;
    }

    public Graph edge(String start, String end, Map<String, String> attributes) {
        edges.add(new Edge(start, end, attributes));
        return this;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        return "Graph [nodes=" + nodes + ", edges=" + edges + "]";
    }
}
