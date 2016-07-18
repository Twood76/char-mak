package com.example.xross.charactercreator;

/**
 * Created by Xross on 7/18/16.
 */
import java.util.Map;
import java.util.Random;
import java.util.HashMap;

public class Character {
    public int level;
    public int[] stats;
    public String type;
    public String race;
    int str,dex,con,it,wis,cha;
    Map<String, Integer> statistics = new HashMap<String, Integer>();



    public Character(){

    }
    public Character(int LEVEL){
        level = LEVEL;
    }
    public Character(int LEVEL, String rac){
        level = LEVEL;
        race = rac;
    }
    public Character(int LEVEL, String rac, String typee){
        level=LEVEL;
        race=rac;
        type=typee;
    }
    public void setType(int typeNum){
        if(typeNum==1){
            type="Fighter";
        }else if(typeNum==2){
            type="Wizard";
        }else if(typeNum==3){
            type = "Rogue";
        }else{
            type="INVALID TYPE";
        }
    }
    public void setRandomType(){
        Random rand = new Random();
        int random= rand.nextInt(3)-2;
        if(random ==1){
           type= "Fighter";
        }else if(random ==2){
            type= "Wizard";
        }else if(random==3){
            type= "Rogue";
        }else{
            type ="INVALID CLASS";
        }

    }
    public void setRace(int raceNum){
        if (raceNum==1){
            race="Human";
        }else if(raceNum==2){
            race="Dwarf";
        }else if(raceNum==3){
            race="Elf";
        }
    }
    public void setRandomRace(){
        Random num = new Random();
        int random= num.nextInt(3)-1;
        if(random ==1 ){
            race="Human";
        }else if(random ==2){
            race="Dwarf";
        }else if(random==3){
            race="Elf";
        }else{
            race="INVALID RACE";
        }

    }
    public String getRace(){

         return race;

    }
    public String getType(){
        return type;
    }
    public int getLevel(){
        return level;
    }

    public Map getStats(){
        str=10;
        dex=10;
        con=10;
        wis=10;
        it=10;
        cha=10;

        statistics.put("STR",str);
        statistics.put("DEX",dex);
        statistics.put("CON",con);
        statistics.put("INT",it);
        statistics.put("WIS",wis);
        statistics.put("CHA",cha);

        //apply racial bonuses
        if(race == "Human"){
            str+=1;
            dex+=1;
            con+=1;
            it+=1;
            wis+=1;
            cha+=1;
        }else if(race == "Dwarf"){
            str+=2;
            con+=2;
        }else if(race=="Elf"){
            dex+=1;
            it+=2;
            wis+=1;
        }//end race bonus

       if(type=="Fighter"){
           //apply class bonus
           if (type =="Fighter"){
               str+=2+level;
               con +=2+level;
               dex+=1+level;
           }else if(type=="Wizard"){
               it+=3+level;
               wis +=2+level;
           }else if (type=="Rogue"){
               dex+=3+level;
               cha+=2+level;
           }//end class bonus
       }
        //apply stats
        statistics.put("STR",str);
        statistics.put("DEX",dex);
        statistics.put("CON",con);
        statistics.put("INT",it);
        statistics.put("WIS",wis);
        statistics.put("CHA",cha);


        return statistics;
    }

}
