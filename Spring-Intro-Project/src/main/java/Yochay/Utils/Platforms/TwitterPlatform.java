package Yochay.Utils.Platforms;

import lombok.SneakyThrows;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.FileWriter;

@Component
public class TwitterPlatform implements Platform{
    @Override
    @SneakyThrows
    public String send(String msg, String to) {
        //write to log
        FileWriter myWriter = new FileWriter("log.txt",true);
        myWriter.write("\n Twitter: Message content: "+ msg + "\nTo: "+to+"\n");
        myWriter.close();
        return "\n Twitter: Message content: "+ msg + "\nTo: "+to+"\n";
    }
}
