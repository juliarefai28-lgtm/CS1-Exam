public class Plant {
    String color;
    boolean isEdible;
    int numWeeksOld;

    public Plant(String color, boolean isEdible, int numWeeksOld){
        this.color= color;
        this.isEdible= isEdible;
        this.numWeeksOld= numWeeksOld;
    }
    public void printInfo(){
        System.out.println(" Color: " + color);
        System.out.println( " Edible: " + isEdible);
        System.out.println( " Number Of Weeks Old: " + numWeeksOld);
    }
}
