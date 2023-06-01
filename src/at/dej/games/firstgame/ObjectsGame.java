package at.dej.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {

    private Rectangle rectangle;
    private Rectangle rectangle1;
    private Rectangle rectangle2;
    private Rectangle rectangle3;
    private Rectangle rectangle4;
    private Rectangle rectangle5;
    private Rectangle rectangle6;
    private Rectangle rectangle7;
    private Rectangle rectangle8;
    private Rectangle rectangle9;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {

        this.rectangle = new Rectangle(60, 60, 5);
        this.rectangle1 = new Rectangle(70, 70, 7);
        this.rectangle2 = new Rectangle(80, 80, 9);
        this.rectangle3 = new Rectangle(90, 90, 11);
        this.rectangle4 = new Rectangle(100, 100, 13);
        this.rectangle5 = new Rectangle(110, 110, 15);
        this.rectangle6 = new Rectangle(120, 120, 17);
        this.rectangle7 = new Rectangle(130, 130, 19);
        this.rectangle8 = new Rectangle(140, 140, 21);
        this.rectangle9 = new Rectangle(150, 150, 23);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        this.rectangle.update(delta);
        this.rectangle1.update(delta);
        this.rectangle2.update(delta);
        this.rectangle3.update(delta);
        this.rectangle4.update(delta);
        this.rectangle5.update(delta);
        this.rectangle6.update(delta);
        this.rectangle7.update(delta);
        this.rectangle8.update(delta);
        this.rectangle9.update(delta);
    }


    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        this.rectangle.render(graphics);
        this.rectangle1.render(graphics);
        this.rectangle2.render(graphics);
        this.rectangle3.render(graphics);
        this.rectangle4.render(graphics);
        this.rectangle5.render(graphics);
        this.rectangle6.render(graphics);
        this.rectangle7.render(graphics);
        this.rectangle8.render(graphics);
        this.rectangle9.render(graphics);

    }

    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("Rectangles"));
            container.setDisplayMode(600, 400, false);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
