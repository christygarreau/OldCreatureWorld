public class Thing1 extends CreatureWorldThing implements Moveable{
    private int myColor;
    private int direction;

    public Thing1(int _id){
        super(_id, CreatureWorldApp.getApp().width/2 + 150, CreatureWorldApp.getApp().height/2);

        myColor = app.color(255, 0, 0);
        direction = 1;
    }

    public void update(CreatureWorldThing[] things){
        display();
        behave();
    }


    protected void display(){
        app.rectMode(app.CENTER);
        app.fill(myColor);
        app.ellipse(getX(), getY(), 50, 50);
    }

    public void behave(){
        int oldX = getX();
        int direction = getDirection();
        int newX = oldX + direction;
        setX(newX);
        if (newX > app.width || newX < 0){
            setDirection(-direction);
        }
    }
    public int getDirection(){
        return direction;
    }

    public void setDirection(int d){
        direction = d;
    }

}