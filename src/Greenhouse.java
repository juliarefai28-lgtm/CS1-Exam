
public class Greenhouse {
   String name;
   boolean sprinklesOn;
   int numberOfFlowers;

    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();}

    public Greenhouse() {
        System.out.println(" Hello World! Good Luck on your exams ! ");
        name = " Planting Parameters at the CSG ";
        sprinklesOn = true;
        numberOfFlowers = 31;
        System.out.println(" Welcome to " + name + " ! It is " + sprinklesOn + " that we are watering plants right now . We have " + numberOfFlowers + " flowers! ");
        numberOfFlowers = 52;
        System.out.println(" Welcome to " + name + " ! It is " + sprinklesOn + " that we are watering plants right now. We have " + numberOfFlowers + " flowers! ");

        Plant kimPlant = new Plant("orange", true, 3);
        kimPlant.printInfo();

        Plant myPlant = new Plant( " red ", true, 5);
        myPlant.printInfo();

        randomReplant();
        veggieOfTheDay("carrot");
        countFlowers();
        changeTemperature();
        starTriangle();
        perimeterTriangle();
    }
    public void randomReplant(){
        int randomInt;
        randomInt = (int)(Math.random()* 16);
        System.out.println( " We are replanting " + randomInt + " vegetables today! ");
    }
    public void veggieOfTheDay(String veggie){
        System.out.println( " Today's chosen veggie is " + veggie );
    }
    public void countFlowers(){

        for (int x=2; x<=6; x++){
            System.out.println(x);}

        for (int x=20; x<= 110; x+=30){
            System.out.println(x);}

        for (int x=8; x>=0;x--){
            System.out.println(x);}
    }
    public void changeTemperature(){
        double randomNum = Math.random();

        if (randomNum <0.25){
            System.out.println(" The temperature has decreased by 2 degrees ");
        } else if (randomNum <0.5){
            System.out.println( " The temperature has decreased by 1 degree ");
        } else if (randomNum <0.75){
            System.out.println( " The temperature has increased by 1 degree");
        }
            System.out.println(" The temperature has increased by 2 degrees ");
    }
    public void starTriangle(){
        //pattern 1
        System.out.println(" * ");
        System.out.print( " * " );
        System.out.println( " * ");
        System.out.print( " * ");
        System.out.print( " * ");
        System.out.println(" * ");
    }
    public void perimeterTriangle(){
        System.out.println( " - ");
        System.out.print( " - ");
        System.out.println( " - ");
        System.out.print( " - ");
        System.out.print(" - ");
        System.out.println( " - ");

    }
}
