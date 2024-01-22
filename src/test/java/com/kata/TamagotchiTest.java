package com.kata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;





public class TamagotchiTest {
    
    @Test
    public void test_WhenTamagotchiEat()
    {   
        //Given
        Tamagotchi elisa = new Tamagotchi();
        elisa.eat();
        int currentHungriness = elisa.getHungriness();

        assertEquals(3, currentHungriness);
        
        //assertTrue( true );

    }
    
      @Test
    public void test_WhenTamagotchiPlay()
    {
        //Given
        Tamagotchi dani = new Tamagotchi();
        dani.play();
        int currentHappiness= dani.getHappiness();
        int currentTiredness = dani.getTiredness();

        assertEquals( 8, currentHappiness); //JUnit
        assertThat(currentTiredness, is(8)); //hamcrest?
    }
    
         @Test
    void test_WhenTamagotchiGoesToBed() {
        //As a Tamagotchi owner
        Tamagotchi Giaco = new Tamagotchi();
        //I want to put my Tamagotchi to bed
        Giaco.sleep();
        //So that I can refill it's energy

        int currentEnergy = Giaco.getEnergy();
        int currentTiredness = Giaco.getTiredness();
        //Then it's tiredness is decreased
        assertEquals(8, currentEnergy);//JUnit
        assertThat(currentTiredness, is(2));//hamcrest
    }

        @Test
        void test_WhenTamagotchiPoos() {
        
            //Given I have a Tamagotchi
            Tamagotchi Giaco = new Tamagotchi();
            //When I make it poop
            Giaco.poo();
            //Then it's fullness is decreased
            int currentFullness = Giaco.getFullness();

            assertEquals(2, currentFullness);
        }

        
    
     @Test
     void test_OverTime(){
         //Given I have a Tamagotchi
         
         Tamagotchi giaco = new Tamagotchi();
         
        
         //When time passes
         giaco.time();
         
         assertThat(giaco.tiredness, is(8));
     
            
     }

 

   
    }
  


