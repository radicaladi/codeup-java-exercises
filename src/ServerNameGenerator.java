import java.util.Random;

public class ServerNameGenerator {
   static String[] adjectives = {"invincible", "habitual", "future", "aggressive", "flowery", "sneaky", "magnificent", "ugly", "fine", "ossified"};
   static String[] nouns = {"vehicle", "candidate", "wedding", "mud", "reputation", "collection", "permission", "entry", "affair", "ear"};

    public static String randomPicker(String[] array) {
        int picker = new Random().nextInt(array.length);
        return array[picker];
    }

    public static void main(String[] args) {
        String pieceAdj = randomPicker(adjectives);
        String pieceNoun = randomPicker(nouns);
        System.out.printf("For a server name, try:%n%s-%s.%n", pieceNoun, pieceAdj);
    }

}
