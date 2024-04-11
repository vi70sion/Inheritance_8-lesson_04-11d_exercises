import java.util.Scanner;

public class IOManager {
    private String pasirinktaFigura;
    private double krastine1, krastine2;
    Scanner scanner = new Scanner(System.in);

    public String getPasirinktaFigura() { return pasirinktaFigura; }
    public double getKrastine1() { return krastine1; }
    public double getKrastine2() { return krastine2; }


    public void suzinokFigura(){
        System.out.println("Pasirinkite figurą: (1)- kvadratas, (2)- trikampis, (3)- skritulys ");
        this.pasirinktaFigura = scanner.nextLine();
    }
    public void suzinokKrastines(){
        switch (pasirinktaFigura){
            case "1":
                System.out.println("Įveskite kvadrato kraštinę centimetrais: ");
                this.krastine1 = scanner.nextDouble();
                break;
            case "2":
                System.out.println("Įveskite trikampio dviejų statinių reikšmes centimetrais: ");
                this.krastine1 = scanner.nextDouble();
                this.krastine2 = scanner.nextDouble();
                break;
            case "3":
                System.out.println("Įveskite skritulio spindulį centimetrais: ");
                this.krastine1 = scanner.nextDouble();
                break;
            default:
                System.out.println("Neteisingas įvedimas.");
        }
        scanner.close();
    }
    public void spausdinkPlota(String message){
        System.out.println(message);
    }
}
