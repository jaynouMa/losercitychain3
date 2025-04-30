import java.security.MessageDigest;

public class StringUtil {
    public static String ApplySHA256(String s){
        try {
            MessageDigest vore = MessageDigest.getInstance("SHA-256");
            byte[] hash = vore.digest(s.getBytes("UTF-8"));
            StringBuffer hS = new StringBuffer();
            for (int i = 0; i < hash.length; i++){
                String h = Integer.toHexString(0xff & hash[i]);
                if (h.length() == 1)
                        hS.append(h);
            }
            return hS.toString();
        }
        catch(Exception E){
            throw new RuntimeException(E);
        }
    }
}
