public class Dreptunghi {
    public int lungimea;
    public int latimea;
    public Dreptunghi (int lungimea, int latimea) {
        this.lungimea = lungimea;
        this.latimea = latimea;
    }
    public int perimetruDreptunghi(){
        return (2 * (lungimea + latimea));
    }
    public int ariaDreptunghi(){
        return lungimea*latimea;
    }
}
