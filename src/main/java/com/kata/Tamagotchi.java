package com.kata;

public class Tamagotchi {
    
    
    int hunger = 4;
    

    int hungriness = 5;
    int happiness = 5;
    int tiredness = 5;
    int energy = 5;
    int fullness = 5;

    int time = 0;
    String sleeping;
    String mood;
    
    public int getCurrentTime(){
        return time;
    }

    public int getFullness(){
        return fullness;
    }
    public void setFullness(int fullness){
        this.fullness = fullness;
    }

    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
   

    public int getHungriness(){
        return hungriness;
    }

    public void setHungriness(int hungriness){
        this.hungriness = hungriness;
    }

    public void eat() {
        hungriness = hungriness - 2;
    }

    public int getTiredness(){
        return tiredness;
    }
    public void setTiredness(int tiredness){
        this.tiredness = tiredness;
    }
    public int getHappiness(){
        return happiness;
    }
    public void setHappiness(int happiness){
        this.happiness = happiness;
    }

    public void play() {
        happiness = happiness + 3;
        tiredness = tiredness + 3;
    }
    
    public void sleep(){
        energy = energy + 3;
        tiredness = tiredness -3;
    }
    public void poo(){
        fullness = fullness - 3;
    }
    public void time(){
        time = time + 1;
        tiredness = tiredness + 3;
        hungriness = hungriness + 3;
        happiness = happiness - 3;
    }
    public void sleeping(){
        if (energy < 3) {
            sleeping = "Tamagotchi está cansado. (-_-)";
        } else if (energy == 0) {
            sleeping = "Tamagotchi está dormido. (-_-) zZZ";
        } else {
            sleeping = "Tamagotchi está normal. :-|";
        }
        energy = energy + 2;
    }
    public void playing(){
        if (happiness > 8){ 
             mood = ":-)";
            }else if (happiness < 2){
                mood = "ఠ_ఠ";
            }else if(happiness <= 8 && happiness >=2){
                mood = ":-|";
            } //energy - 1, hunger + 1, mood + 1
            energy = energy -1;
            hunger = hunger +1;
            happiness = happiness + 1; 
    }
    public void eating(){
        hungriness = hungriness - 2;
        energy = energy + 1;
    }
}
