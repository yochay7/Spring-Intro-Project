package Yochay.Controller;


import Yochay.Modals.DataSource;
import Yochay.Service.MessageRedirectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.awt.*;

@Controller
public class MessageRedirectController {

    @Autowired
    private MessageRedirectService messageRedirectService;

    @PostMapping(value = "/",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> MessageRedirect(@RequestBody DataSource data){
        return new ResponseEntity<>(messageRedirectService.redirect(data), HttpStatus.OK);
    }
}
