package gr.devoid.notimeforplaingames;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SelectPlayers extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_players);

		final Spinner sex1 = (Spinner) findViewById(R.id.Spinner01);
		final Spinner sex2 = (Spinner) findViewById(R.id.Spinner03);
		final Spinner sex3 = (Spinner) findViewById(R.id.Spinner05);
		final Spinner sex4 = (Spinner) findViewById(R.id.Spinner07);
		final Spinner sex5 = (Spinner) findViewById(R.id.Spinner09);

		List<String> list = new ArrayList<String>();
		list.add("Male");
		list.add("Female");

		ArrayAdapter<String> dataAd = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		dataAd.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sex1.setAdapter(dataAd);
		sex2.setAdapter(dataAd);
		sex3.setAdapter(dataAd);
		sex4.setAdapter(dataAd);
		sex5.setAdapter(dataAd);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_players, menu);
		return true;
	}

}
