public class Trikampis extends Figura{

    public Trikampis(double krastine1, double krastine2) { //statusis trikampis
        super(krastine1, krastine2);
    }
    @Override
    public void skaiciuokPlota(){
        this.setPlotas(getKrastine1() * getKrastine2() / 2);
    }
}
