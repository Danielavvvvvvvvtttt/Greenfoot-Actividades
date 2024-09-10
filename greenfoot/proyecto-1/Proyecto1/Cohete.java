import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cohete here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cohete extends Actor
{
    /**
     * Act - do whatever the Cohete wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Boolean canFire = true;
    
    public Cohete(int cantidad){
        setRotation(cantidad);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
          setLocation(getX()+5, getY());  
        }
        if(Greenfoot.isKeyDown("left")){
          setLocation(getX()-5, getY());  
        }
        if(Greenfoot.isKeyDown("up")){
          setLocation(getX(), getY()-5);  
        }
        if(Greenfoot.isKeyDown("down")){
          setLocation(getX(), getY()+5);  
        }
        fireProjectile();
    }
        // Add your action code here.
    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true){
            getWorld().addObject(new Projectile(), getX(), getY()-30);
            canFire = false;
            
        } else if(!Greenfoot.isKeyDown("space")){
            canFire =true;   
        }

    }
        }
