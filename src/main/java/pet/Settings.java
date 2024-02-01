package pet;

public enum Settings {

    ARRAY(100,10),
    LINKLIST(100,10);


    private final long randomRange;
    private final int defaultSize;

    Settings(long range, int size){
        randomRange = range;
        defaultSize = size;
    }

    public long range(){
        return randomRange;
    }

    public int size(){
        return defaultSize;
    }
}
