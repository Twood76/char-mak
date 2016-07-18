package com.example.xross.charactercreator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Map;
import android.widget.NumberPicker;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    NumberPicker levelSelect;
    TextView sta,rac,type,levelSel,raceSelect,classSelect;
    Map stats;
    int level;
    Button fighter;
    Button wizard;
    Button rogue;
    Button human;
    Button elf;
    Button dwarf;
    Button finish;
    Button newHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Character testCharacter = new Character(3,"Elf", "Wizard");

        levelSelect= (NumberPicker) findViewById(R.id.numberPicker);
        dwarf = (Button) findViewById(R.id.dwarfButton);
        elf = (Button) findViewById(R.id.elfButton);
        human = (Button) findViewById(R.id.humanButton);
        fighter = (Button) findViewById(R.id.fighterButton);
        wizard = (Button) findViewById(R.id.wizardButton);
        rogue = (Button) findViewById(R.id.rogueButton);
        finish=(Button) findViewById(R.id.continueButton);

        levelSelect.setMaxValue(20);
        levelSelect.setMinValue(1);
        //Have user pick level race and class
        levelSel= (TextView) findViewById(R.id.levelS);
        raceSelect=(TextView) findViewById(R.id.raceView);
        classSelect=(TextView) findViewById(R.id.classButton);

        sta = (TextView) findViewById(R.id.statsText);
        rac = (TextView) findViewById(R.id.raceText);
        type = (TextView) findViewById(R.id.typeText);
        Character workingCharacter= createCharacter(); //theCharacter we will be using
        stats= workingCharacter.getStats();
        String temp = workingCharacter.getRace();
        int temporary = workingCharacter.getLevel();
        rac.setText("Level= "+ temporary +" Race= "+ temp);
   /*     type.setText("Class= " + workingCharacter.getType());
        sta.setText("STR= " + stats.get("STR")+ " DEX= " + stats.get("DEX")+" CON= " + stats.get("CON")+" INT= " + stats.get("INT")+
                " WIS= " + stats.get("WIS")+" CHA= " + stats.get("CHA"));
*/

    }

    public  Character createCharacter(){
        final Character newCharacter = new Character();
        boolean fin=false;

        //HIDE NORMAL TEXT
        sta.setVisibility(View.GONE);
        rac.setVisibility(View.GONE);
        type.setVisibility(View.GONE);
        //SHOW BUTTONS
        levelSel.setVisibility(View.VISIBLE);
        classSelect.setVisibility(View.VISIBLE);
        raceSelect.setVisibility(View.VISIBLE);
        human.setVisibility(View.VISIBLE);
        elf.setVisibility(View.VISIBLE);
        dwarf.setVisibility(View.VISIBLE);
        fighter.setVisibility(View.VISIBLE);
        wizard.setVisibility(View.VISIBLE);
        rogue.setVisibility(View.VISIBLE);
        levelSelect.setVisibility(View.VISIBLE);


            human.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    newCharacter.setRace(1);
                }
            });
            elf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    newCharacter.setRace(2);

                }
            });
            dwarf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    newCharacter.setRace(3);

                }
            });
            fighter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    newCharacter.setType(1);

                }
            });
            wizard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    newCharacter.setType(2);

                }
            });
            rogue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    newCharacter.setType(3);

                }
            });

            finish.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    human.setVisibility(View.GONE);
                    elf.setVisibility(View.GONE);
                    dwarf.setVisibility(View.GONE);
                    fighter.setVisibility(View.GONE);
                    wizard.setVisibility(View.GONE);
                    rogue.setVisibility(View.GONE);
                    levelSelect.setVisibility(View.GONE);
                    finish.setVisibility(View.GONE);
                    levelSel.setVisibility(View.GONE);
                    classSelect.setVisibility(View.GONE);
                    raceSelect.setVisibility(View.GONE);

                    sta.setVisibility(View.VISIBLE);
                    rac.setVisibility(View.VISIBLE);
                    type.setVisibility(View.VISIBLE);

                }
            });


        return newCharacter;

    }
}
