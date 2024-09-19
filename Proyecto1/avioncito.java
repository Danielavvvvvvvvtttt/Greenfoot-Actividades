import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class avioncito here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class avioncito extends Actor
{
    /**
     * Act - do whatever the avioncito wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public avioncito(){
    }
    Boolean canFire = true;
    public void act()
    {
       if (Greenfoot.isKeyDown("D")){
        setLocation(getX()+5, getY());
        setRotation(360);
}
 else if (Greenfoot.isKeyDown("A")){
        setLocation(getX()-5, getY());
        setRotation(180);
}
 else if (Greenfoot.isKeyDown("S")){
        setLocation(getX(), getY()+5);
        setRotation(90);
}
 else if (Greenfoot.isKeyDown("W")){
        setLocation(getX(), getY()-5);
        setRotation(270);
}
fireProjectile();
}

public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            if (getRotation() == 270 || getRotation() == 0){
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
        }
        else if (getRotation() == 90){
           getWorld().addObject(new Projectile(), getX(), getY()+30);
            canFire = false;
        }
        else if (getRotation() == 360){
           getWorld().addObject(new Projectile(), getX()+30, getY());
            canFire = false;
        }
        else if (getRotation() == 180){
           getWorld().addObject(new Projectile(), getX()-30, getY());
            canFire = false;
        }
        } else if(!Greenfoot.isKeyDown("space")){
            canFire =true;  
        }

    }
}
