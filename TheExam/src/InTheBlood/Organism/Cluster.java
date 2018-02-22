package InTheBlood.Organism;

import java.util.ArrayList;
import java.util.List;

public class Cluster {

    private String id;
    private int rows;
    private int cols;
    private List<Cell> cells;

    public Cluster(String id, int rows, int cols) {
        this.id = id;
        this.rows = rows;
        this.cols = cols;
    }

    public String getId() {
        return id;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
