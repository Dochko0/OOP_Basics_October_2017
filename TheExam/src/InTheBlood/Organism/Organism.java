package InTheBlood.Organism;

import java.util.ArrayList;
import java.util.List;

public class Organism {

    private String name;
    private List<Cluster> clusters;
    private List<Cell> cells;

    private Cluster clusterId;


    public Organism(String name) {
        this.name = name;
    }

    public Organism(List<Cluster> clusters, List<Cell> cells) {
        this.clusters = new ArrayList<>();
        this.cells = new ArrayList<>();
    }

    public Organism() {

    }

    public void addCluster(Cluster cluster){
        this.clusters.add(cluster);
    }

    public String getName() {
        return name;
    }

    public List<Cluster> getClusters() {
        return clusters;
    }

    public Cluster getClusterId() {
        return clusterId;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClusters(List<Cluster> clusters) {
        this.clusters = clusters;
    }

    @Override
    public String toString() {
        return String.format("Organism %s already exists%n", this.getName());
    }
}
