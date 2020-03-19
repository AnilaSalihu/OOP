package oop.cacttus.education.java3;

import java.time.LocalDate;
import java.util.Scanner;

public class Java3Main2 {
    public static void main(String[] args) {
        Artikulli[] vargu = new Artikulli[100];
        Scanner reader = new Scanner(System.in);
        int index = 0;

        while (index < vargu.length) {
            //vargu[index] = new Artikulli();
            Artikulli artikulli = new Artikulli();
            System.out.printf("Shkruaj ID te artikullit %d: %n", index + 1);
            int id = reader.nextInt();
            reader.nextLine();

            if (id == -1) {
                //nderprite while-in
                break;
            }

            System.out.printf("Shkruaj emrin e artikullit %d: %n", index + 1);
            String emri = reader.nextLine();

            System.out.printf("Shkruaj daten (YYYY-MM-DD) e prodhimit te artikullit %d: %n", index + 1);
            String dataProdhimitStr = reader.nextLine();
            LocalDate dataProdhimit = LocalDate.parse(dataProdhimitStr);

            artikulli.setId(id);
            artikulli.setEmri(emri);
            artikulli.setDataProdhimit(dataProdhimit);
         /*
         masi kam pengesa ne ze atehere po e plotesoj,sahere qe thirret new rezervohet vend i ri ne memorie
         dhe ky artikull i ri me referencen ne memori i caktohet elemetitt te radhes ne varg te merr ate
         reference, pastaj shkatrohet variabla dhe ne iteracionin e rradhes me komanden new rezervon perseri
         memorie te re



             */


            vargu[index] = artikulli;

            index++;
        }

        System.out.println("Total artikuj te zgjedhur = " + index);
        System.out.println("Total artikuj te pazgjedhur  = " + (vargu.length - index));
        //me vazhdu ketu pas while

        int nr =0;
        for(Artikulli a: vargu) {
            if(a==null) break;
            nr++;
        }
        System.out.println("Total artikuj te zgjedhur = " + nr);
        System.out.println("Total artikuj te pazgjedhur  = " + (vargu.length - nr));

    }
}
