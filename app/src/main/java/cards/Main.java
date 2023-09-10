package cards;

import java.io.IOException;

public class Main extends Template {

    public static void main(String[] args) throws IOException {
        
        String[] cmd;
        int handLength;
        while(true) {
            cmd = input("Enter a command: ").split(" ");
            switch(cmd[0]) {
                case "hand":
                    takeHand(Integer.parseInt(cmd[1]));
                    break;
                case "exit": return;
            }

        }
    }

    public static void takeHand(int handLength) {
        var hand = new Hand(handLength);
        println(hand+" "+String.valueOf(hand.isSet()));
    }
    
}

