package templatemethod;
public class Mp3Player extends Player{

    
    
    @Override
    public void play() {
        System.out.println("A musica MP3 que ta tocando é...");
    }

    @Override
    public void stop() {
        System.out.println("Você parou a musica MP3...");
    }

    @Override
    public void avancar() {
        System.out.println("Você avançou para musica MP3...");
    }
    
}
