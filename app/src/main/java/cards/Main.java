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
                case "take":
                    takeHand(cmd[1], Integer.parseInt(cmd[2]));
                    break;
                case "exit": return;
            }

        }
    }

    public static void takeHand(String combination, int handLength) {
        Hand hand = new Hand(handLength);
      
        int times;
        switch(combination) {
            case "set":     
                while(true) {
                    hand = new Hand(handLength);
                    times++;
                    if(hand.isSet()) break;
                }
                break;
            case "quads":     
                while(true) {
                    hand = new Hand(handLength);
                    times++;
                    if(hand.isQuads()) break;
                }
                break;
            
        }
        println(hand+" from the "+times+"th time.");
    }

    public static void takeHand(int handLength) {
        var hand = new Hand(handLength);
        println(hand+" "+String.valueOf(hand.isSet()));
    }
    
}

