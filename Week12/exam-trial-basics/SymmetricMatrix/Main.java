package SymmetricMatrix;

public class Main {
    public static void main(String[] args) {


        int size = 3;
        int[][] exam1 = {
                {1, 0, 1},
                {0, 2, 2},
                {1, 2, 5}
        };



        int[][] exam2 = {
                {7, 7, 7},
                {6, 5, 7},
                {1, 2, 1}
        };

       // System.out.println(exam1.getClass().getSimpleName());
        System.out.println(isSymmetric(exam1, 3));
        System.out.println(isSymmetric(exam2,3));
    }

    private static boolean isSymmetric(int name[][],  int size) {
        for(int a = 0; a< name.length; a++){
            for(int b = 0; b < name[a].length; b++){
                if(name[a][b] != name[b][a]) {
                    return false;
                }
            }
        }
        return true;
    }
}


