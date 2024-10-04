package no.hvl.dat100.tabeller;

public class Tabeller {
	
	
    //a
    public static void skrivUt(int[] tabell) {
    	
    	System.out.print("[");
    	
        for (int i = 0; i < tabell.length; i++) {      	        
            System.out.print(tabell[i] + " "); 
        }
        
        System.out.print("]");
    }
    

    //b
    public static String tilStreng(int[] tabell) {
        StringBuilder string = new StringBuilder();
        string.append("[");
        
        for (int i = 0; i < tabell.length; i++) {
        	string.append(tabell[i]);
            if (i < tabell.length - 1) {
            	string.append(",");
            }
        }
        
        string.append("]");
        return string.toString();
    }

    //c
    public static int summer(int[] tabell) {
        int sumen = 0;
        for (int i = 0; i < tabell.length; i++) {
        	sumen += tabell[i];
        }
        return sumen;
    }

    //d
    public static boolean finnesTall(int[] tabell, int tall) {
    	
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return true;
            }
        }
        return false;
    }

    //e
    public static int posisjonTall(int[] tabell, int tall) {
    	
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    //f
    public static int[] reverser(int[] tabell) {
        int[] revers = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
        	revers[i] = tabell[tabell.length - i - 1];
        }
        return revers;
    }

    //g
    public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                return false;
            }
        }
        return true;
    }

    //h
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] sammen = new int[tabell1.length + tabell2.length];
        for (int i = 0; i < tabell1.length; i++) {
        	sammen[i] = tabell1[i];
        }
        for (int i = 0; i < tabell2.length; i++) {
        	sammen[tabell1.length + i] = tabell2[i];
        }
        return sammen;
    }
}
