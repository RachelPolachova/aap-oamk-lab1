package com.rachel.polachova.androidoop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ConstraintMainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_constraint);
        oopConcepts();
	}




	void oopConcepts() {
        House myHouse = new House(4, 5); //3. instantiation of object

        myHouse.openDoor();
        myHouse.clean(); // I can access clean() method which is protected, because ConstraintMainActivity class is in same package

        // 8. polymorphism
        Building random = new House(1,5);
        if (random instanceof House) {
            ((House) random).getNumberOfResidents();
        }

//        Building b = new Building(); -> cannot do, because Building class is Abstract.
    }


}
