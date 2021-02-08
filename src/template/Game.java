package template;

public abstract class Game {

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

    public final void play() {
        loadAssets();
        initialize();
        startPlay();
        if(addNewGameCharacter()){
            addNewCharacterToGame();
        }
        endPlay();
    }

    protected abstract void addNewCharacterToGame();

    protected void loadAssets(){
        System.out.println("loading game assets");
    }

    protected boolean addNewGameCharacter(){
        return true;
    }

}
