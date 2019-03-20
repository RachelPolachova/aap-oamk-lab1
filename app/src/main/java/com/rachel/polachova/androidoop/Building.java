package com.rachel.polachova.androidoop;

// 10. abstract
public abstract class Building implements Construction {
    private int amountOfWindows; //5. member data

    public Building(int amountOfWindows) {
        this.amountOfWindows = amountOfWindows;
    }

    public void openDoor() { //5. member data
        // code to open doors
    }

    protected void clean() {
        // clean building
    }

    // 7. interface
    @Override
    public void tryNotToFall() {
        //try not to fall method
    }

    public int getAmountOfWindows() {
        return amountOfWindows;
    }

    public void setAmountOfWindows(int amountOfWindows) {
        this.amountOfWindows = amountOfWindows;
    }
}
