package Yochay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
msg exmple:

{
"msg": "hi"
"to": "moshe"
"platform": "facebook" \ "twitter"
}

etc lowercase expected
 */

@SpringBootApplication
public class YochayApplication {

	public static void main(String[] args) {
		SpringApplication.run(YochayApplication.class, args);
	}

}
