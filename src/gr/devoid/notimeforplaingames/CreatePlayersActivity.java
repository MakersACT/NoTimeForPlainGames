package gr.devoid.notimeforplaingames;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CreatePlayersActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_players);
		
		// TODO: Get the number of players from a previous activity...
		int nPlayerNumber = 20;
		final ArrayList<String> playerNumbers = new ArrayList<String>(nPlayerNumber);
		for (int i = 0; i < nPlayerNumber; i++) {
			playerNumbers.add(Integer.toString(i + 1));
		}
		
		ListView listview = (ListView) findViewById(R.id.listview);
		listview.setAdapter(new ArrayAdapter<String>(this, R.layout.create_list_item, R.id.player_number, playerNumbers));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_players, menu);
		return true;
	}

}
