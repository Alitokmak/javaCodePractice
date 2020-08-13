package javaAssignments;
/**
 * 13. Scrabble Score
 *
 * Given a word, compute the scrabble score for that word.
 *
 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
 * "cabbage" should be scored as worth 14 points:
 *
 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
 * point for E And to total:
 *
 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
 */
public class ScrabbleScore {

    public static void main(String[] args) {
        System.out.println(getScrabbleScore("OxyphenButazone"));

    }

    public static int getScrabbleScore(String string) {
        int point=0;
        char scoreTable[] = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };
        for(char each : string.toCharArray()) {
            if(each>='a' && each<='z') {
                point +=scoreTable[each-'a'];
            }
            if(each>='A' && each<='Z')  {
                point +=scoreTable[each-'A'];
            }
        }
        return point;
    }

}
