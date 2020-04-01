package templatemethod;

public class WmvPlayer extends Player {

    @Override
    public void play() {
        System.out.println("A musica Wmv que ta tocando é...");
    }

    @Override
    public void stop() {
        System.out.println("Você parou a musica Wmv...");
    }

    @Override
    public void avancar() {
        System.out.println("Você avançou para musica Wmv...");
    }

}
