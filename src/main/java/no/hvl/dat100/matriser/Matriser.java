package no.hvl.dat100.matriser;

public class Matriser {

	//a
    public static void skrivUt(int[][] matrise) {
    	
        for (int[] raden : matrise) {
        	
            for (int tall : raden) {
            	
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

    //b
    public static String tilStreng(int[][] matrise) {
    	
        StringBuilder string = new StringBuilder();
        
        for (int[] raden : matrise) {
        	
            for (int tall : raden) {
            	
            	string.append(tall).append(" ");        
            }
            string.append("\n");
        }
        return string.toString();
    }

    //c
    public static int[][] skaler(int tall, int[][] matrise) {
    	
        int[][] skalere = new int[matrise.length][matrise[0].length];
        
        for (int i = 0; i < matrise.length; i++) {
        	
            for (int j = 0; j < matrise[i].length; j++) {
            	
            	skalere[i][j] = matrise[i][j] * tall;
            }
        }
        return skalere;
    }

    public static int[][] speile(int[][] matrise) {
    	
        int[][] endre = new int[matrise[0].length][matrise.length];
        
        for (int i = 0; i < matrise.length; i++) {
        	
            for (int j = 0; j < matrise[i].length; j++) {
            	
            	endre[j][i] = matrise[i][j];
            }
        }
        return endre;
    }

    public static int[][] multipliser(int[][] mat1, int[][] mat2) {
    	
        int r1 = mat1.length;
        int c1 = mat1[0].length;
        int c2 = mat2[0].length;
        
        int[][] resultat = new int[r1][c2];
        
        for (int i = 0; i < r1; i++) {
        	
            for (int j = 0; j < c2; j++) {
            	
                for (int k = 0; k < c1; k++) {
                	
                    resultat[i][j] += mat1[i][k] * mat2[k][j];                
                }
            }
        }
        return resultat;
    }

    //d
    public static boolean erLik(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) {
            return false;
        }
        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) {
                return false;
            }
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}