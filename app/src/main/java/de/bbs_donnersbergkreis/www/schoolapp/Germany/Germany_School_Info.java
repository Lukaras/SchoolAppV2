package de.bbs_donnersbergkreis.www.schoolapp.Germany;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.bbs_donnersbergkreis.www.schoolapp.R;

public class Germany_School_Info extends AppCompatActivity {
private TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_germany__history_of_school);
        t=(TextView)findViewById(R.id.gerHistoryText);
        t.setText("The BBS-Donnersbergkreis was founded in 1996.\n Since a few years, " +
                "the BBS-Donnersbergkreis got a cooperation with the Hochschule Worms - University of Applied Scinces." +
                " \nThe BBS-Donnersbergkreis got differend typs of school, there are the Berufliches Gymnasium, the Duale " +
                "Oberschule, the Berufsschule, the Höhere Berufsfachschule, the Berufsfachschule I and II and " +
                "the Berufsvorbereitungsjahr.");
}
}
