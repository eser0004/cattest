public class Cat {
    private String name;    //attributterne
    private double weight;

    private char gender;

    public Cat(String name, double weight, char gender) {  //Konstruktør
        this.name = name;
        this.weight = weight;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }


    public char getGender(){
        return gender;
    }


}

//note 1: Altid privat for et ekstra lag af security for mit eget program
//note 2: getterne svarer til at du spørger programmet om "please giv mig bla bla info".