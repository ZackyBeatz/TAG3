
package tag2ver4;

/**
 *
 * @author Zack
 */
public class ItemsSuper {
    
    private int use;
    private int amount;
    private int damage;
    private int heal;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private String description;
    
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public void use(Enemy e1){
        e1.setHealth(e1.getHealth()-damage);
    }
    
    public void heal(Player n1){
        n1.setHealth(n1.getHealth()+heal);
    }
    
    
    
}
