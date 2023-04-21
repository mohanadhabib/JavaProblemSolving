/*
A program to transcribe
from DNA to RNA
*/

public class TranscribeTomRNA {

    public static String dnaToRna(String dna){
        String rna ="";
        for (int i = 0; i < dna.length();i++){
            if(dna.charAt(i)=='A'){
                rna += 'U';
            }
            else if(dna.charAt(i)=='T'){
                rna += 'A';
            }
            else if(dna.charAt(i)=='G'){
                rna += 'C';
            }
            else if(dna.charAt(i)=='C'){
                rna += 'G';
            }
        }
        return rna;
    }

    public static void main(String []args){
        System.out.println(dnaToRna("ATTAGCGCGATATACGCGTAC"));
        // UAAUCGCGCUAUAUGCGCAUG
        System.out.println(dnaToRna("CGATATA"));
        // GCUAUAU
        System.out.println(dnaToRna("GTCATACGACGTA"));
        // CAGUAUGCUGCAU
    }
}
