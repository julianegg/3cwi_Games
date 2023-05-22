package at.dej.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles extends BasicGame {

    private float x;
    private float y;
    private float speed;

    private float x1;
    private float y1;



    public enum DIRECTION {RIGHT, DOWN, LEFT , UP};
    private DIRECTION direction = DIRECTION.RIGHT;

    public Rectangles(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.x = 100;
        this.speed = 2.0f;
        this.x1= 100;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
      if (direction==DIRECTION.RIGHT){
            this.x += (float) delta / this.speed;
            if (this.x>500){
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
              if (this.x <= 0){
                  direction = DIRECTION.UP;
              }
              }
        if (direction == DIRECTION.UP) {
            this.y -= (float) delta / this.speed;
            if (this.y <= 0){
                direction = DIRECTION.RIGHT;

            }
        }
      }




    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 150, 150);
        graphics.drawOval(this.x1, this.y1, 100, 100);

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
