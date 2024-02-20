package coding.exercises.sainsburry;

public class ChessProblem {
    public static String run(final String startPos, final int R, final int C){
        final int startRow = Integer.parseInt(String.valueOf(startPos.charAt(0)));
        final int startCol = startPos.charAt(1)-96;
        int endRow = (startRow+R)%8;
        endRow = endRow!=0? endRow: 8;
        final int endColInt = ((startCol+C)%8) + 96;
        final char endCol = (char) endColInt;
        final String endPosition = endRow+""+endCol;
        return endPosition;
    }
    public static void main(String[] args) {
        System.out.println(run("2b",3,2));
        System.out.println(run("5h",11,25));
    }
}
