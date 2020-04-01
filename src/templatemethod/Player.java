package templatemethod;
public abstract class Player {
    
    public abstract void play();
    public abstract void stop();
    public abstract void avancar();
    
    public void executar(){
        play();
        
        avancar();
        
        stop();
        
    }
    
}
