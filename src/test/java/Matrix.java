public class Matrix {
    public static void main(String[] args) {
        int[][] array = generateArray();

        for (int i = 0; i < array.length; i++) { //array.length el lekér a lista hosszát
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        numberOfNonZeroValues();
        indexOfColumnsWithSameValues();
    }
    public static int[][] generateArray() { //üres mert nem lesz bemeno paraméter
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        return array;
    }
    public static int[][] numberOfNonZeroValues() { //hány db NEM 0 elem
        int[][] array = generateArray();
        int nullVal = array[0][0];
        int [][] nullIndex = new int [1][2];

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!(array[i][j] != 0 )) {
                    System.out.println("Nincs ilyen elem.");
                } else {
                    nullVal = array[i][j];
                    nullIndex[0][1] = array[i][j];
                }
                break;
            }
        }
        return(nullIndex);
    }


    public static int indexOfColumnsWithSameValues(){ //azon oszlopok sorszámát, amelyek csupa azonos értéket tartalmaznak
        int[][] array = generateArray();
        int samevalues = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { // j az oszlop
                if (array[j] == array[j]) {
                    System.out.println("Nincs ilyen elem.");
                } else {
                    samevalues++;
                }
                break;
            }
        }
        return samevalues;
    }

}
