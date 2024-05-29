public abstract class Monster implements SpecialAbility, Movable {
    private String name;
    private int health = 100;
    private int attackPower = 1;
    private Point2D position = new Point2D();

    public Monster() {

    }

    Monster(String name) {
        this.name = name;
    }

    Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    Monster(String name, int health, int attackPower, Point2D position) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void raiseAttackPower(int amount) {
        this.attackPower += amount;
    }

    public void decreaseHealth() {

    }

    public void attack() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}