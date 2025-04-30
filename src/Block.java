import java.util.Date;

public class Block {
    public String hash;
    public String previousHash;
    private String info;
    private long timeStamp;

    public Block(String info, String previousHash){
        this.info = info;
        this.previousHash = previousHash;
        timeStamp = new Date().getTime();
    }
}
