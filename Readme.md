# Tamagotchi Kata Rules

## Basic Needs
Like we said before, first things first is to get all of the basic needs finished so we have some semblance of a basic Tamagotchi pet. We're talking about things like hungriness(hambre), fullness(saciedad), tiredness(cansancio), happiness(felicidad) and of course, the actions required to mitigate these needs. We're not really sure of the implementation though. We were thinking of needs on a scale of 1-10, with different activities having different effects on them, but we'll go with whatever you think is best.

## User Stories

#### 1 - Feeding Tamagotchi

+ As a Tamagotchi owner
+ I want to feed my Tamagotchi
+ So that I can sate it's 

Acceptance Criteria :

    Given I have a Tamagotchi
    When I feed it
    Then it's hungriness is decreased
    And it's fullness is increased
--------
#### 2 - Playing With Tamagotchi
+ As a Tamagotchi owner
+ I want to play with my Tamagotchi
+ So that I can make it happier

Acceptance Criteria :

    Given I have a Tamagotchi
    When I play with it
    Then it's happiness is increased
    And it's tiredness is increased
--------
#### 3 - Putting Tamagotchi to Bed
+ As a Tamagotchi owner
+ I want to put my Tamagotchi to bed
+ So that I can refill it's energy

Acceptance Criteria :

    Given I have a Tamagotchi
    When I put it to bed
    Then it's tiredness is decreased
--------
#### 4 - Making Tamagotchi Poop
+ As a Tamagotchi owner
+ I want to make my Tamagotchi poop
+ So that it is more comfortable

Acceptance Criteria :

    Given I have a Tamagotchi
    When I make it poop
    Then it's fullness is decreased
--------
#### 5 - Changing Tamagotchi Needs Over Time
+ As a Tamagotchi owner
+ I want my Tamagotchi's needs to change over time
+ So that I have to look after it carefully

Acceptance Criteria :

    Given I have a Tamagotchi
    When time passes
    Then it's tiredness is increased
    And it's hungriness is increased
    And it's happiness is decreased
--------


## Sleep: (sueño)

- energy < 3 = "(-_-)" (cansado)
- energy = 0 = "(-_-) zZZ" (dormido)
- energy >= 3 = ":-|" (normal)
- sleeping = energy + 2
- if (energy = 0) = "(-_-) zZZ" (dormido)

## Mood: (estado de ánimo)

- mood > 8 = ":-)" (contento)
- mood < 2 = "ఠ_ఠ" (enfadado)
- mood <= 8 && mood >=2 = ":-|" (normal)
- playing = energy - 1, hunger + 1, mood + 1

## Hunger: (hambre)

- eating = hunger - 2, energy + 1

### More details

- https://agilekatas.co.uk/katas/Tamagotchi-Kata
