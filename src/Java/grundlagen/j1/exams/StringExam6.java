package Java.grundlagen.j1.exams;

import java.util.Arrays;

public class StringExam6 {

    public static void lmao(String endOfTheWorld) {

        endOfTheWorld = endOfTheWorld.toLowerCase();

        String[] splitted = endOfTheWorld.split("");
        String chache;
        String finalstring = endOfTheWorld;
        String []splitted1 =splitted.clone();
        Arrays.sort(splitted);

        int repeat = splitted.length - 1;
        for (int a = repeat; a >= 0; a--) {
            chache = splitted[a];
            finalstring = finalstring.replace(chache, "");
            finalstring = chache + finalstring;
        }

        String[] finalsplit = finalstring.split("");

        int result = 0;
        int counter = 0;
        String buffer;

        for (int a = 0; a < finalsplit.length; a++) {
            for (int b = 0; b < splitted.length; b++) {
                buffer = finalsplit[a];
                if (buffer.equals(splitted[b])) {
                    counter++;
                }
            }
            if (counter > result) {
                result = counter;
                counter = 0;
            } else {
                counter = 0;
            }
        }

        String[][] TwoDimensionalArray = new String[finalsplit.length][endOfTheWorld.length()];
        for (int i = 0; i < finalsplit.length; i++) {
            TwoDimensionalArray[i][0] = finalsplit[i];
        }
        String Temparary;
        int row = 1;
        for (int x = 0; x < finalstring.length()-1; x++) {
            row++;
            for (int z = 0; z < splitted.length; z++) {
                if (TwoDimensionalArray[x][0].equals(splitted[z])) {
                    Temparary = Integer.toString(z);
                }
            }
            row = 1;
        }
        for (int u = 0; u < TwoDimensionalArray[0].length; u++) {
            for (int j = 0; j < TwoDimensionalArray.length; j++) {
                if (TwoDimensionalArray[j][u] == null) {
                    TwoDimensionalArray[j][u] = " ";
                }
            }
        }
        int[] counterArray = new int[finalsplit.length];

        for (int i = 0; i < finalsplit.length; i++) {
            for (int m = 0; m < splitted1.length; m++) {
                if (splitted1[m].equals(TwoDimensionalArray[i][0])) {
                    counterArray[i]++;
                    TwoDimensionalArray[i][counterArray[i]] = String.valueOf(m);
                }
            }
        }
        int lmao = Integer.toString(result).length() + 5;

        for (int u = 0; u < TwoDimensionalArray[0].length; u++) {
            for (int j = 0; j < TwoDimensionalArray.length; j++) {
                System.out.print(TwoDimensionalArray[j][u] + " ".repeat(lmao - TwoDimensionalArray[j][u].length()));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String endOfTheWorld = "That's great, it starts with an earthquake " + "Birds and snakes, and aeroplanes " + "And Lenny Bruce is not afraid " + "Eye of a hurricane, listen to yourself churn " + "World serves its own needs " + "Don't mis-serve your own needs " + "Speed it up a notch, speed, grunt, no, strength " + "The ladder starts to clatter " + "With a fear of height, down, height " + "Wire in a fire, represent the seven games " + "And a government for hire and a combat site " + "Left her, wasn't coming in a hurry " + "With the Furies breathing down your neck " + "Team by team, reporters baffled, trumped, tethered, cropped " + "Look at that low plane, fine, then " + "Uh oh, overflow, population, common group " + "But it'll do, save yourself, serve yourself " + "World serves its own needs, listen to your heart bleed " + "Tell me with the Rapture and the reverent in the right, right " + "You vitriolic, patriotic, slam fight, bright light " + "Feeling pretty psyched " + "It's the end of the world as we know it " + "It's the end of the world as we know it " + "It's the end of the world as we know it and I feel fine " + "Six o'clock, T.V. hour, don't get caught in foreign tower " + "Slash and burn, return, listen to yourself churn " + "Lock him in uniform, book burning, bloodletting " + "Every motive escalate, automotive incinerate " + "Light a candle, light a motive, step down, step down " + "Watch your heel crush, crush, uh oh " + "This means no fear, cavalier, renegade and steering clear " + "A tournament, a tournament, a tournament of lies " + "Offer me solutions, offer me alternatives and I decline " + "It's the end of the world as we know it (I had some time alone) " + "It's the end of the world as we know it (I had some time alone) " + "It's the end of the world as we know it and I feel fine (time I had some time alone) " + "I feel fine (I feel fine) " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it and I feel fine (time I had some time alone) " + "The other night I drifted nice continental drift divide " + "Mountains sit in a line, Leonard Bernstein " + "Leonid Brezhnev, Lenny Bruce and Lester Bangs " + "Birthday party, cheesecake, jellybean, boom " + "You symbiotic, patriotic, slam but neck, right, right " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it and I feel fine (time I had some time alone) " + "It's the end of the world as we know it " + "It's the end of the world as we know it " + "It's the end of the world as we know it and I feel fine (time I had some time alone) " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it and I feel fine (time I had some time alone) " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it (time I had some time alone) " + "It's the end of the world as we know it and I feel fine (time I had some time alone)";

        lmao(endOfTheWorld);
    }
}

