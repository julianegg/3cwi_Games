package at.dej.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {

    private float x;
    private float y;
    private float speed;

    private float speed1;

    private float x1;
    private float y1;

    private float x2;

    private float y2;

    private float speed2;


    public enum DIRECTION {RIGHT, DOWN, LEFT , UP};
    private DIRECTION direction = DIRECTION.RIGHT;

    public enum DIRECTION1 {RIGHT1, DOWN1, LEFT1 , UP1};
    private DIRECTION1 direction1 = DIRECTION1.DOWN1;

    public enum DIRECTION2 {RIGHT2, DOWN2, LEFT2 , UP2};
    private DIRECTION2 direction2 = DIRECTION2.RIGHT2;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.speed = 2.0f;
        this.y1= 100;
        this.speed1 = 2.0f;
        this.x2= 100;
        this.speed2 = 2.0f;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (direction == DIRECTION.RIGHT) {
            this.x += (float) delta / this.speed;
            if (this.x > 500) {
                direction = DIRECTION.DOWN;
            }
        }
        if (direction == DIRECTION.DOWN) {
            this.y += (float) delta / this.speed;
            if (this.y > 450) {
                direction = DIRECTION.LEFT;
            }
        }

        if (direction == DIRECTION.LEFT) {
            this.x -= (float) delta / this.speed;
            if (this.x <= 0) {
                direction = DIRECTION.UP;
            }
        }
        if (direction == DIRECTION.UP) {
            this.y -= (float) delta / this.speed;
            if (this.y <= 0) {
                direction = DIRECTION.RIGHT;

            }
        }
        // Direction Kreis x1,y1
        // Start
        if (direction1 == DIRECTION1.DOWN1) {
            this.y1 += (float) delta / this.speed1;
            if (this.y1 > 450) {
                direction1 = DIRECTION1.UP1;
            }
        }
        if (direction1 == DIRECTION1.UP1) {
            this.y1 -= (float) delta / this.speed1;
            if (this.y1 <= 0) {
                direction1 = DIRECTION1.DOWN1;

            }
        }
        // Ende Kreis x1, y1
        if (direction2 == DIRECTION2.RIGHT2) {
            this.x2 += (float) delta / this.speed2;
            if (this.x2 > 500) {
                direction2 = DIRECTION2.LEFT2;
            }
        }
        if (direction2 == DIRECTION2.LEFT2) {
            this.x2 -= (float) delta / this.speed2;
            if (this.x2 <= 0) {
                direction2 = DIRECTION2.RIGHT2;
            }
        }
    }




    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 150, 150);
        graphics.drawOval(this.x1, this.y1, 100, 100);
        graphics.drawOval(this.x2, this.y2, 100, 100);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new Rectangles("Rectangles"));
            container.setDisplayMode(800, 600, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
