import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Anderson Camacho
 * @email: camachosinh@gmail.com
 * @version general 1.5
 
 */
class Projectile extends Actor
{
    /**
     * Declaraciones
     */
    private int direccion;
    /**
     * Constructor
     */
    public Projectile()
    {
    }

    /**
     * Metodos getter and setters
     */
    public void addedToWorld(World world){
        direccion = getWorld().getObjects(avioncito.class).get(0).getRotation();
    }
    /**
     * Metodos Action que se ejecuta siempre que el objeto exista
     */
    public void act()
    {
        projectileMove();
        removeFromWorld();
    }

    /**
     * Metodo preparacion de los elementos de esta Clase
     */
    private void prepare()
    {
    }

    /**
     * Metodos de Projectile completos y con elementos completos no estandares.
     */

    public void projectileMove()
    {
        if(direccion == 270){
        setLocation(getX(), getY()-10);
    }
    else if (direccion == 90){
    setLocation(getX(), getY()+10);
    }
    else if (direccion == 360 || direccion == 0){
    setLocation(getX()+10, getY());
}
else if (direccion == 180){
    setLocation(getX()-10, getY());
}
}
    public void removeFromWorld()
    {
        if(getY() == 0 || getX() == 0 || getX() == getWorld().getWidth()-1 || getY() == getWorld().getHeight()-1)
       
        {
            getWorld().removeObject(this);
        }
    }

}

