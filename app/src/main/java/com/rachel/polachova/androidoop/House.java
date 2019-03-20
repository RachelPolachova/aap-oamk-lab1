package com.rachel.polachova.androidoop;

//7. inheritance
public class House extends Building {

    private int numberOfResidents;

    public House(int amountOfWindows, int numberOfResidents) {
        super(amountOfWindows);
        this.numberOfResidents = numberOfResidents;
    }


    // 9. overriding
    @Override
    public void openDoor() {
        super.openDoor();
        askToTakeOfShoes();
    }

    private void askToTakeOfShoes() {
        // code to ask
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }
}
