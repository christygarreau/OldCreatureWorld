public class Thing3 extends CreatureWorldThing {
    private int myColor;

    public Thing3(int _id){
        super(_id, CreatureWorldApp.getApp().width/4, CreatureWorldApp.getApp().height/4);

        myColor = app.color(0, 0, 255);
    }
    public void update(CreatureWorldThing[] things){
        display();
    }

    protected void display(){
        app.rectMode(app.CENTER);
        app.fill(myColor);
        app.rect(getX(), getY(), 150, 50, 25);
    }
}