package oop.cacttus.education.java7;

public class WalkingBird extends Bird {
    //Walking Bird i trashegon te gjitha vetit/atributet dhe metodat PUBLIC/PROTECTED (dhe i qaset me fjalen kyqe super)
    //PUBLIC -> i bjen qe qito veti/atribute/metoda shihen prej kudo ne klase
    //PROTECTED -> i bjen qe qito veti/atribute/metoda shihen vetem prej klases qe e trashegon dhe jo jasht saj

    //per me kriju nje objekt prej klases se trasheguar -> duhet se pari mu kriju objekti i klases prind
    //e kjo arrihet nepermjet konstruktorit

    //konstruktor me parametra ALT+Insert


    public WalkingBird(String color, String food) {
        //fjala kyqe SUPER i qaset PRINDIT
        super(color, food, "walked");
    }
}
