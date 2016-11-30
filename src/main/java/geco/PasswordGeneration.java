package geco;

import java.util.Random;

/**
 * Created by Marianna on 30/11/2016.
 */
public class PasswordGeneration {

    public String getRandomPassword(){
        Random r = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String pass="";
        for (int i = 0; i < 8; i++) {
            pass += alphabet.charAt(r.nextInt(alphabet.length()));
        }

        return pass;
    }




}
