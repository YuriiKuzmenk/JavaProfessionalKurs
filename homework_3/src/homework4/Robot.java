package homework4;

public class Robot implements Action {
    private int runLimit;
    private int jumpLimit;

    public Robot (int runLimit, int jumpLimit) {
        this.runLimit=runLimit;
        this.jumpLimit=jumpLimit;
    }

    @Override
    public void run (Obstacle obstacle) {
        if (obstacle.getSize()>runLimit) {
            System.out.println(getType() + " cannot run " + obstacle.getSize() + " m.");
        } else {
            System.out.println(getType() + " run " + obstacle.getSize() + "m.");
        }
    }

    @Override
    public void jump (Obstacle obstacle) {
        if (obstacle.getSize()>jumpLimit) {
            System.out.println(getType() + " cannot jump " + obstacle.getSize() + " m.");
        } else {
            System.out.println(getType() + " jump " + obstacle.getSize() + "m.");
        }
    }

    public String getType(){
        return "Robot";
    }
}