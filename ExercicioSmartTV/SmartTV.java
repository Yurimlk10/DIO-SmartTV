package ExercicioSmartTV;

public class SmartTV {
    // Atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 50;

    // Mudando estado da TV
    public void ligar() {
        ligada = true;
        System.out.println("TV LIGADA");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV DESLIGADA");
    }

    // Mudando o volume
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("A TV já está no volume máximo.");
        }
        System.out.println(volume);
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("A TV já está no volume mínimo.");
        }
        System.out.println(volume);
    }

    // Mudando de canal
    public void aumentarCanal() {
        canal++;
        System.out.println(canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println(canal);
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println(canal);
    }
}