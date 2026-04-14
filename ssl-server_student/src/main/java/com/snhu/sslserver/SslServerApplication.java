package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.buf.HexUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

//FIXME: Add route to enable check sum return of static data example:  String data = "Hello World Check Sum!";
@RestController
class ServerController {

    @RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException {
        String data = "Hellooooooo Joshua Hernandez!";

        MessageDigest msgDigest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = msgDigest.digest(data.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        String checksum = HexUtils.toHexString(hashBytes);

        return "<p>Data: " + data + "</p>"
             + "<p>Algorithm: " + msgDigest.getAlgorithm() + "</p>"
             + "<p>Checksum: " + checksum + "</p>";
    }
}