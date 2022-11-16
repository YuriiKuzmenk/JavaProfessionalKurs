package homework4;

/**
 * Java. Homework №4.
 *
 * @author Yurii Kuzmenko java_39e
 * @version 10.11.2022 - 14.11.2022,
 * so far only the beginning, not done
 *  * 16.11.2022 repeat teachers version
 */

public class SportMain {
    public static void main (String[] args){
        Cat cat = new Cat (200, 3);
        Human human = new Human (100, 1);
        Robot robot = new Robot (500, 2);
        Action[] participants = {cat, human, robot};

        Track track = new Track(150);
        Wall wall=new Wall(1);
        Obstacle[] obstacles = {track, wall};

        for (Action participant : participants) {
            for (Obstacle obstacle: obstacles) {
                if (obstacle.getType().equals("track")) {
                    participant.run(obstacle);
                } else
                    if(obstacle.getType().equals("wall")) {
                        participant.jump(obstacle);
                }
            }
        }
    }
}
