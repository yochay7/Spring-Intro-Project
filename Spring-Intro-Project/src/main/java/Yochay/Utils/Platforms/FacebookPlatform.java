package Yochay.Utils.Platforms;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.FileWriter;

@Component
public class FacebookPlatform implements Platform{
    @Override
    @SneakyThrows
    public String send(String msg, String to) {
        FileWriter myWriter = new FileWriter("log.txt",true);
        myWriter.write("\nFACEBOOK LOG:\nMessage content: "+ msg + "\nTo: "+to+"\n");
        myWriter.close();

        return "Facebook" +"\nMessage content: "+ msg + "\nTo: "+to+"\n";
    }
}
