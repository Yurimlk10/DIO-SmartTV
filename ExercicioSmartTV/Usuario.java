package ExercicioSmartTV;

public class Usuario {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();

        tv.ligar();

        tv.aumentarVolume();
        tv.trocarCanal(20);
        tv.diminuirCanal();
    }
}
