package animal;


//Inheritence (NASLEDUVANJE) - So koristenje na extends keywordot nie od glavnata (super) klasa dobivame dozvola da gi koristime istite metodi koi se zaednicki na site
//Abstraction - super klasa koja ima genericki raboti, ako nema potreba da se pravat objekti pravime abrstrakcija i ja ogranicuvame taa klasa kadesto ne dozvoluvame da se pravat objekti od istata i od nea se nasleduvaat (ne site abstract klasi se super klasi)
//NE SE PRAVI ABSTRAKTNA KLASA SEKOGAS - AKO NEMAAT ZAEDNICKO NA PRIMER EDNIOT I OBICEN PERSON A DRUGIOT STUDENT NE SE PRAVI ABSTRAKTNA KLASA
//AKO IMAME ZAEDNICKI ATRIBUTI PARAMETRI, KAKO NA PRIMER OGLAS ZA VOZILA, I DEL OD VOZILATA IMAAT SPECIFICNI ATRIBUTI PRAVIME ABSTRACT CLASS, ne pravime objekti vo glavnata klasa
//PRIMER AKO PERSON E ABSTRAKTNA PERSON NEMA DA MOZE DA SE VNESE SAMO STUDENT A VO OPSTINATA TREBA DA SE ZNAE DALI E STUDENT COVEKOT ILI NE
//Encapsulation (Access Modifiers) - Mnogu bitni koi ni pomagaat samite metodi, promenlivi da bidat koristeni ili ne bidat koristeni vo ostanati nadvoresni klasi
//AKo e nesto potrebno da se povikuva nekogas mu davame public, ako ne togas ne davame access do drugite metodi, ako ne e potrebno
//default - samo vo package; public - site klasi
//Polymorphism (Overriding and overloading) - Edna akcija na razlicni nacini

public class Bird extends Animal {

     String beakType;
     public Bird(int age, String color, String name, String type, String beakType) {
         super(age,color,name,type);
         this.beakType=beakType;
     }

     public Bird() {

     }

     public void setBeakType(String beakType) {
         if(beakType == null) {
             throw new NullPointerException("The beakType cannot be null.");
         }
         if(beakType.trim().isEmpty() || beakType.length() > 25) {
             throw new IllegalArgumentException("The beakType must be between 1 and 25 characters.");
         }
         this.beakType=beakType;
     }

     public String getBeakType() {
         return beakType;
     }

     //Overide se isto samo menjanje na tekst

    public String eat() {
         return "The bird " + name + " is eating.";
    }

}
