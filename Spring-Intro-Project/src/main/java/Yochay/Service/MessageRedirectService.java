package Yochay.Service;

import Yochay.Modals.DataSource;
import Yochay.Utils.Platforms.FacebookPlatform;
import Yochay.Utils.Platforms.Platform;
import Yochay.Utils.Platforms.TwitterPlatform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MessageRedirectService {

    @Autowired
    private Map<String, Platform> platformBeanMap;

    //[BeanName -> Bean]

    public String redirect(DataSource dataSource){

        return platformBeanMap.get(dataSource.getPlatform() + "Platform").send(dataSource.getMsg(),dataSource.getTo());
    }

}
