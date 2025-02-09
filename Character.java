public class Character {

    private AttackStrategy attackStrategy;
    private DefenseStrategy defense1;
    private DefenseStrategy defense2;
    private DefenseStrategy defense3;
    
    public Character(AttackStrategy attackStrategy, DefenseStrategy defense1) {
        this.attackStrategy = attackStrategy;
        this.defense1 = defense1;
        this.defense2 = new NoDefense();
        this.defense3 = new NoDefense();
    }
    
    public Character(AttackStrategy attackStrategy, DefenseStrategy defense1, DefenseStrategy defense2) {
        this.attackStrategy = attackStrategy;
        this.defense1 = defense1;
        this.defense2 = defense2;
        this.defense3 = new NoDefense();
    }

    public Character(AttackStrategy attackStrategy, DefenseStrategy defense1, DefenseStrategy defense2, DefenseStrategy defense3) {
        this.attackStrategy = attackStrategy;
        this.defense1 = defense1;
        this.defense2 = defense2;
        this.defense3 = defense3;
    }
    
    public void Attacks() {
        attackStrategy.attack();
    }
    
    public void Defense() {
        defense1.defend();
        defense2.defend();
        defense3.defend();
    }
    
}