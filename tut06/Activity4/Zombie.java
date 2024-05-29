public class Zombie extends Monster {
    public Zombie(String name) {
        super(name);
    }

    public Zombie(String name, int health) {
        super(name, health);
    }

    public Zombie(String name, int health, int attackPower) {
        super(name, health, attackPower);
    }

    public Zombie(String name, int health, int attackPower, Point2D position) {
        super(name, health, attackPower, position);
    }

    @Override
    public void attack() {
        System.out.println("Brain!");
    }

    @Override
    public void moveUp() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void moveDown() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void moveLeft() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void moveRight() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Point2D teleport(Point2D position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void transform() {
        // TODO Auto-generated method stub
        
    }
}
