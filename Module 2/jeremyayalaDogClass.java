public class Dog {

    // declare attributes needed for class per UML diagram
    private int dogSpaceNbr;
    private double dogWeight;
    private boolean grooming;

    // set the constructor
    public Dog(int dogSpaceNbr, double dogWeight, boolean grooming) {
        this.dogSpaceNbr = dogSpaceNbr;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    // getter method to get the dog space number
    public int getDogSpaceNbr() {
        return dogSpaceNbr;
    }

    // set method to set dog space number
    public void setDogSpaceNbr(int dogSpaceNbr) {
        this.dogSpaceNbr = dogSpaceNbr;
    }

    // get method for dog weight
    public double getDogWeight() {
        return dogWeight;
    }

    // set method for dog weight
    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    // get method for grooming
    public boolean getGroomed() {
        return grooming;
    }

    // set method for dog grooming
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}

// end