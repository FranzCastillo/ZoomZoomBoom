import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    public Projectile(int rotation){
        GreenfootImage dot = new GreenfootImage(4, 4);
        dot.setColor(Color.BLACK);
        dot.fill();
        setImage(dot);
        setRotation(rotation);
    }
    
    int Speed;
    
    
    public void act() 
    {
        if(isAtEdge() || isTouching(Bike.class) || isTouching(Top.class) || isTouching(Projectile.class)){
            getWorld().removeObject(this);
        }
        move(10);
    }     
}
