package InTheBlood.Organism.bloodCells;

public class RedBloodCell extends BloodCell{
    private int velocity;

    public RedBloodCell(String id, int health, int positionRow, int positionCol, int velocity) {
        super(id, health, positionRow, positionCol);
        this.velocity=velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
