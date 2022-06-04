package pl.kalinowskiTomek.test;


/*Kucharz dostał na urodziny dwa kosze owoców. W pierwszym koszu jest J jabłek,
        w drugim P pomarańczy. Kucharz lubi pomarańcze i jabłka tak samo bardzo dlatego chciałby mieć ich po równo.
        Każde jabłko i każda pomarańcza kosztuje 1 złotą monetę. Kucharz ma Z monet. Napisz program, który na wejściu dostaje trzy liczby:
        J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
        Program ma wypisywać jaka jest minimalna możliwa różnica między ilością jabłek i pomarańczy po zakupie owoców.
        Kucharz jest bardzo łakomy więc zawsze wydaje wszystkie monety na zakupach.
        Przykłady:
        Wejście: 1 3 1
        Wyjście:
        Minimalna różnica: 1
        Ilość jabłek: 2
        Ilość pomarańczy: 3
        Wejście: 5 3 3
        Wyjście:
        Minimalna różnica: 1
        Ilość jabłek: 6
        Ilość pomarańczy: 5
        Wejście: 1 10 20
        Wyjście:
        Minimalna różnica: 1
        Ilość jabłek: 16
        Ilość pomarańczy: 15*/


public class Kucharz {


    public static void main(String[] args) {

        int jablka = 13;
        int pomarancze = 4;
        int monety = 5;
        int lessfruit;


        int minDifference;


        System.out.println("Wejście : " +jablka +" " +pomarancze +" " +monety);

        lessfruit = Math.abs(jablka-pomarancze);
        System.out.println(lessfruit);



        if(Math.abs(jablka-pomarancze) <= monety) {

            if (jablka <= pomarancze) {

                jablka = jablka + Math.abs(jablka - pomarancze);
                monety = monety - Math.abs(jablka - pomarancze);

            } else {
                pomarancze = pomarancze + Math.abs(jablka - pomarancze);
                System.out.println();
                monety = monety - lessfruit;
            }

            if (monety % 2 == 0) {
                jablka = jablka + monety/2;
                pomarancze = pomarancze + monety/2;
                minDifference = 0;
            } else {
                jablka = jablka + (int) monety / 2;
                pomarancze = pomarancze + (int) monety / 2;
                minDifference = 1;
            }
        } else {
            if (jablka <= pomarancze) {

                jablka = jablka + monety;
                monety = 0;
                minDifference = Math.abs(jablka - pomarancze);

            } else {
                pomarancze = pomarancze + monety;
                monety =0;
                minDifference = Math.abs(jablka - pomarancze);
            }
        }




        System.out.println("Wyjście : " +jablka +" " +pomarancze +" " +monety);
        System.out.println("Dopuszczala różnica :" +minDifference);

    }








}
