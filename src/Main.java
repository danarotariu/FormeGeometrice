public class Main {
    public static void main(String[] args){
        Triunghi triunghiul1 = new Triunghi(4,7,3);
        System.out.println("Perimetrul triunghiului este: " + triunghiul1.perimetruTriunghi());
        Patrat patrat1 = new Patrat(2);
        System.out.println("Perimetrul patratului este: " + patrat1.perimetruPatrat());
        System.out.println("Aria patratului este: " + patrat1.ariaPatrat());
        Dreptunghi dreptunghiul1 = new Dreptunghi(2, 3);
        System.out.println("Perimetrul dreptunghiului este: " + dreptunghiul1.perimetruDreptunghi());
        System.out.println("Aria dreptunghiului este: " + dreptunghiul1.ariaDreptunghi());
    }
}
