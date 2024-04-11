public class Main {
    public static void main(String[] args) {

        IOManager manager = new IOManager();
        manager.suzinokFigura();
        manager.suzinokKrastines();
        switch (manager.getPasirinktaFigura()){
            case "1":
                Kvadratas kvadratas = new Kvadratas(manager.getKrastine1());
                kvadratas.skaiciuokPlota();
                manager.spausdinkPlota(kvadratas.toString());
                break;
            case "2":
                Trikampis trikampis = new Trikampis(manager.getKrastine1(), manager.getKrastine2());
                trikampis.skaiciuokPlota();
                manager.spausdinkPlota(trikampis.toString());
                break;
            case "3":
                Skritulys skritulys = new Skritulys(manager.getKrastine1());
                skritulys.skaiciuokPlota();
                manager.spausdinkPlota(skritulys.toString());
                break;
        }
    }
}