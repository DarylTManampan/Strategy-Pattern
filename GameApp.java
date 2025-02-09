public class GameApp {

    public static void main(String[] args) {
        Character knight = new Character(
            new SwingSword(),
            new Shield(),
            new CreateMagic(),
            new Dodge()
        );
        
        Character wizard = new Character(
            new CastSpell(),
            new CreateMagic()
        );
        
        Character archer = new Character(
            new ShootArrow(),
            new Dodge()
        );
        
        System.out.println("\n\tKnight");
        knight.Attacks();
        knight.Defense();
        
        System.out.println("\n\tWizard");
        wizard.Attacks();
        wizard.Defense();
        
        System.out.println("\n\tArcher");
        archer.Attacks();
        archer.Defense();
    }

}