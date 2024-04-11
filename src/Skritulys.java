public class Skritulys extends Figura{

    public Skritulys(double krastine1) { // skritulio spindulys
        super(krastine1, krastine1);
    }
    @Override
    public void skaiciuokPlota(){
        this.setPlotas(Math.PI * getKrastine1() * getKrastine1());
    }
}
