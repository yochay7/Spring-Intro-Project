package Yochay.Utils.Platforms;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.FileWriter;

@Component
public class GmailPlatform implements Platform{

    @Override
    @SneakyThrows
    public String send(String msg, String to) {
        //write to log
        FileWriter myWriter = new FileWriter("log.txt",true);
        myWriter.write("\n Gmail: Message content: "+ msg + "\nTo: "+to+"\n");
        myWriter.close();

        return "\n Gmail: Message content: "+ msg + "\nTo: "+to+"\n";
    }
}
