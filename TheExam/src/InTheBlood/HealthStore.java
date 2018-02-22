package InTheBlood;

import InTheBlood.Organism.Cell;
import InTheBlood.Organism.Cluster;
import InTheBlood.Organism.Organism;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;

class HealthStore extends Organism{
    private String name;

    private List<Organism> organisms;

    private Organism clusterOrganism = new Organism(new ArrayList<>(), new ArrayList<>());

    public static Organism getCluster() {
        return clusterOrganism;
    }

    public HealthStore(String name, List<Organism> organisms) {
        super();
        this.name = name;
        this.organisms = new ArrayList<>();
    }

    public String checkCondition(String organismName){
        StringBuilder cond = new StringBuilder();
        cond.append(String.format("Organism - %s%n",organismName));
        cond.append(String.format("Clusters: %d", getClusters().size()));
        cond.append(String.format("Cells: %d", getCells().size()));
        cond.append(String.format("Cluster %s", getClusterId()));
        cond.append(String.format("Cell {id} [{positionRow},{positionCol}]"));
        cond.append(String.format("Health: {health} | Size: {size} | Energy: {energy}"));
        return cond.toString();
    }


    //"Organism - {name}
    //--Clusters: {clusters count}
    //--Cells: {cells count}
    //----Cluster {clusterId}
    //------Cell {id} [{positionRow},{positionCol}]


    //Done
    public String createOrganism(String name){
        StringBuilder sb = new StringBuilder();
        if (!organisms.contains(name)) {
            organisms.add(new Organism(name));
            sb.append(String.format("Created organism %s%n",name));
            return sb.toString();
        }else{
            sb.append(String.format("Organism %s already exists%n",name));
            return sb.toString();
        }
    }





    public String addCluster(String organismName, String id, int rows, int cols){
      getCluster().addCluster(new Cluster(id, rows, cols));
        return null;
    }








    public String addCell(String organismName, String clusterId, String cellType
            , String cellId, int health, int positionRow, int positionCol, int additionalProperty){
        return null;
    }
    public String activateCluster(String organismName){
	    return null;
    }
}
