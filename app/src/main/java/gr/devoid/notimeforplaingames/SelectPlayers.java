package gr.devoid.notimeforplaingames;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class SelectPlayers extends Activity {

	String[] avatar = { "Alien", "Astronaut", "Diver", "Doctor", "Doll",
			"Dwarf", "Fairy", "King-Tut", "Knight", "Phoenix", "Samurai",
			"Superheroine" };

	String[] subs = { "From far away", "The White", "", "The cutest", "",
			"The Mighty", "Arising from the ashes", "", "The Real Hero" };

	int arr_images[] = { R.drawable.alien, R.drawable.astronaut,
			R.drawable.diver, R.drawable.doctor, R.drawable.doctor,
			R.drawable.doll, R.drawable.dwarf, R.drawable.fairy,
			R.drawable.king, R.drawable.phoenix, R.drawable.samurai,
			R.drawable.superheroine };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_players);

		Spinner a1 = (Spinner) findViewById(R.id.Spinner02);
		Spinner a2 = (Spinner) findViewById(R.id.Spinner04);
		Spinner a3 = (Spinner) findViewById(R.id.Spinner06);
		Spinner a4 = (Spinner) findViewById(R.id.Spinner08);
		Spinner a5 = (Spinner) findViewById(R.id.Spinner10);

		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_players, menu);
		return true;
	}

}
