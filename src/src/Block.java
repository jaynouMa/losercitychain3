package src;

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
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                previousHash +
                        Long.toString(timeStamp) +
                        info
        );
        return calculatedhash;
    }
}
