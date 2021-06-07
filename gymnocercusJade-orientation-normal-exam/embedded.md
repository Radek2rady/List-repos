# Embedded

## Keep in mind

The C exercises have to make sure about the followings:

- Compiles
- Does not have any undefined behaviour
- You don't use more memory than necessary
- Deallocates the memory when it's no longer used
- Does not crash

The embedded exercises have to make sure about the followings:

- Compiles
- Does not have any undefined behaviour
- Does not crash
- Does not use any blocking mechanism (like HAL_Delay() or HAL_UART_Receive())

# Foot Race.

## Main

Store the competitors in an array in the main. For each competitors just assign a value from the random result array.

## Structure

Create a structure where you store:

- the name of the racer,
- the country of the racer,
- the result where he/she finished.

## Enum

Create an enum where you store country short codes (example: HUN, ENG...), for the country codes of the racers’ origin.

## Function

### Result of the race

Create a function which returns a random array with unique elements, from 1 to the number of competitors. The elements
of this array will represent the result of the race.

### Fastest racer

Create a function which takes 2 parameters:

- a pointer to the array
- and the length of the array and returns the name of the fastest one.

### Competitors from a country

Create a function which takes 3 parameters:

- a pointer to the array,
- the length of the array
- and the country and returns the number of the competitors from the given country.

# Cookbook transformation

Your task is to write a function that reads the ingredients of a recipe from a file and scales it up to feed the given
number of people.
***The given recipe is for 2 people by default.***

The recipe is a text file containing a list of ingredients in the following format
`ingredient name measuring unit amount`
An example recipe can be found here: [Vegan Curry](vegan_curry.txt).

Implement the following functions

- read_file Reads the file and stores the ingredients in an array of ingredient struct.

The ingredient struct should store

- the name of the ingredient
- the name of the measuring unit
- the amount that is needed for the recipe

You need to implement the following function

- scale_recipe Calculate the amounts of the ingredients for the number of people who are going to be eating. Print the
  recipe in a new file named: ``` <original file name without the .txt part>_for_X.txt ``` where X should be the number
  of people this recipe is generated for. (if it doesn't work just name the file output.txt)
  The format should be: `<ingredient name> <measuring unit> <new amount>`. The function should take the array of the
  ingredients, the number of people and the original file name without extension as parameters.

On the console ask the user for the number of people that the recipe should be generated then call the scale_recipe
function to generate the recipe. ***Don't forget to deallocate memory that is not needed anymore!***

# Blinky

## SPECIFICATION:

- Your program should have a default state: the green LED should blink continuously with 1 Hz frequency (50% duty cycle)
- When you press the blue button of the board for a short period of time (between 50 - 250 ms) -> the blinking should be
  slowed down to 0.5 Hz frequency (50% duty cycle)
- This state is temporary: the slow blinking should terminate after 5 seconds
- This state can't be interrupted.
- At the end of this temporary state the program should continue running the default state.
- If the press is to short (0 - 50 ms) or to long (250 - infinite ms) the program should continue running the default
  state.

## NON FUNCTIONAL REQUIREMENTS:

- You should use at least 1 timer peripheral
- Try to avoid the use of blocking waiting mechanisms (like HAL_Delay())
- Use external interrupt
- When there is a state change, you should report this on USART1 peripheral, use the serial monitor to read these
  reports, for example:
- **NORMAL BLINKING**
  -  **SLOW BLINKING**
  -  **INVALID INPUT**

### - Given the following number: 10010011. How do you change the second bit to 1 and the last bit to 0 with bitwise operators without changing the other bits? type your answer here (Give code example in C)

*type your answer here (please explain with your own words)*

### - Given the following binary number: 11001010. How do you check whether the 3 least significant bits (the last 3) are set?

*type your answer here (please explain with your own words)*


