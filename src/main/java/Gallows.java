
public class Gallows {
    private String[][] gallowsArray = new String[7][11];
    private int counter = 0;

    Gallows() {
        for (String[] gallowsTab : gallowsArray) {
            for (int i = 0; i < gallowsTab.length; i++) {
                gallowsTab[i] = " ";
            }
        }
    }

    void gallowsDraw() {
        counter++;
        switch (counter) {
            case 1:
                gallowsArray[6][0] = "_";
                gallowsArray[6][1] = "_";
                gallowsArray[6][2] = "|";
                gallowsArray[6][3] = "_";
                gallowsArray[6][4] = "_";
                break;
            case 2:
                gallowsArray[1][2] = "|";
                gallowsArray[2][2] = "|";
                gallowsArray[3][2] = "|";
                gallowsArray[4][2] = "|";
                gallowsArray[5][2] = "|";
                break;
            case 3:
                gallowsArray[0][2] = "_";
                gallowsArray[0][3] = "_";
                gallowsArray[0][4] = "_";
                gallowsArray[0][5] = "_";
                gallowsArray[0][6] = "_";
                gallowsArray[0][7] = "_";
                gallowsArray[0][8] = "_";
                gallowsArray[0][9] = "_";
                break;
            case 4:
                gallowsArray[1][4] = "/";
                gallowsArray[2][3] = "/";
                break;
            case 5:
                gallowsArray[1][9] = "|";
                break;
            case 6:
                gallowsArray[2][9] = "O";
                break;
            case 7:
                gallowsArray[3][9] = "|";
                break;
            case 8:
                gallowsArray[3][8] = "/";
                break;
            case 9:
                gallowsArray[3][10] = "\\";
                break;
            case 10:
                gallowsArray[4][8] = "/";
                break;
            case 11:
                gallowsArray[4][10] = "\\";
                break;
        }
        gallowsPrint();

    }

    void gallowsPrint() {
        for (String[] gallowsTab : gallowsArray) {
            for (String gallows : gallowsTab) {
                System.out.print(gallows);
            }
            System.out.println();
        }
    }

}
