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


# Online debate sanitizer

Write a function that takes some text from the standard input and prints it back out with the correct casing and ignoring all exclamation marks (__!__).

Only the first letter of the sentence is a capital letter, all the other letters are lowercase (you don't have to recognize names, acronyms etc...).

Example input:

`LISTEN TO ME, I'M SHOUTING SO I MUST BE RIGHT`

Expected output:

`Listen to me, i'm shouting so i must be right`

Another example input:

`yoU aRE tHE ReAsOn ThIs CouNTry iS in RUiNs!!!!!!!!!!!!`

Expected output:

`You are the reason this country is in ruins`

***Call this function in main to test your solution. Don't forget to deallocate memory that is not needed anymore!***

# Hacker

## Function

### Binaries converter

Create a function that should convert binary numbers to a letter (from ASCII code).

Binary numbers are stored in the [binaries.txt](./binaries.txt)

#### Example

```
01001101
00101011
```

- The function should should return with the converted word.
- Write the converted letters into me_the_hacker.txt.

# Pedestrian crossing simulator

You will create a pedestrian crossing simulator, which is able to change it's state: red and green light.
You will use the blue user button to signal your intent to come accross.

#### Specification

 - Connect 2 external LED to the board!
 - Your applications should be able to state the change of the 2 LED:
    - when the green is on, the red is off, and vice versa
    - by default, the green LED is on for 3 secons, then the red is on for 7 seconds, then this process is repeated continuously
 - If you press the user button, the length of the actual red light will be shortened. After you press it, the red light phase completes within 1 second, if it won't be longer as the original red light's end time.
 - That button press
    - has only effect to the actual red light phase
	- if you press it during the green light phase, it has no effect
	- if you press the button multiple times during the red phase, it has the same effect, as if you'd pressed the button only once
 - Your application should tell the user the state changes. Use the USART1 peripheral and the serial monitor.
 
#### Example

 - In default state, you should see in the serial monitor:

```
Changed to red, please wait for 6 seconds.
Changed to green, you can come across.
Changed to red, please wait for 6 seconds.
Changed to green, you can come across.
```

- Pressing the button (even multiple times), during the red light phase, you should see in the serial monitor:

```
Intention to come accross, wait 1 second.
Changed to green, you can come across.
Changed to red, please wait for 6 seconds.
```

#### Non-functional requirements

 - You should use at least 1 timer peripheral
 - Try to avoid the use of blocking waiting mechanisms (like HAL_Delay())
 - Use external interrupt


### - What are the main advantages of I2C over UART?
*type your answer here (please explain with your own words)*

### - What will be the value of 6534(decimal) if you shift the bits to the right twice and then make a bitwise AND operation with 00100111(binary)? Write the answer in hexadecimal format. type your answer here AND write a code example here in C. You don't need to include the printf part.
*type your answer here (please explain with your own words)*


