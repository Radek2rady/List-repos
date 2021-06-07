# TRIAL EXAM: Programming Basics

### Getting Started

 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions must go in this repository
 - Please create directories for each of the tasks except the question time
 - Don't forget to answer the questions

### What can I use?

- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead
- **Don't push your work** to GitHub until your mentor announces that the time is up

# Tasks

## Symmetric matrix

Create a function named `isSymmetric` 
that takes an n×n integer matrix (two dimensional array/list) as a parameter
and returns true if the matrix is symmetric
or false if it is not.

Symmetric means it has identical values along its diagonal axis from top-left to bottom-right,
as in the first example.

Example 1:

```
[
  [1, 0, 1],
  [0, 2, 2],
  [1, 2, 5]
]
```

Output:

```
true
```

Example 2:

```
[
  [7, 7, 7],
  [6, 5, 7],
  [1, 2, 1]
]
```

Output:

```
false
```

## Most Common Characters

Write a function that takes a filename as a parameter.
Return the 2 most common characters and their occurrences in the file's content.

If the file does not exist throw an exception with the following message:
"File does not exist!"

Example

[Example file can be found here](./countchar.txt)

Output

```js
{
  "e": 6,
  "l": 4
}
```

## Pirates
 
Write a program which can store pirates in a ship.

### Pirate
 
 - A pirate has a name, an amount of gold and health points, the default value of which is 10.
 - A pirate might be a captain and may have a wooden leg.
 - You must create the following methods:

 - if a pirate is a captain:
    - `work()` which increases the amount of gold possessed by that pirate by 10 and decrease the HP by 5.
    - `party()` which increases the HP by 10.
 - if the pirate is not a captain:
    - `work()` which increases the amount of gold by 1 and decreases the HP by 1.
    - `party()` which increases the HP by 1.
 
 - `toString()` method:
 - if the pirate has a wooden leg, then the string that is returned by the function must look like this:
    - Hello, I'm Jack. I have a wooden leg and 20 golds.
 -  If not:
    - Hello, I'm Jack. I still have my real legs and 20 golds. 
  
### Ship

 - It should have a list of pirates.
 - You must be able to add new pirates to the ship. It must have only one captain!
 - You must create the following methods:
 - `getPoorPirates()` which returns a list of names containing the pirates that
    - have a wooden leg and have less than 15 golds
 - `getGolds()` which returns the sum of gold owned by the pirates of that particular ship
 - `lastDayOnTheShip()` which calls the pirates' `party()` method.
 - `prepareForBattle()` which calls 
    - the pirates' `work()` method 5 times
    - then the ship's `lastDayOnTheShip()` method.

## Command line exercise

- Take a look at this directory structure:

```text
projects
 |--program
 |   |--.git
 |   |--assets
 |   |   |--data.md
 |   |   |--picture_1.png
 |   |   └--picture_2.jpg
 |   └--data.txt
 └--exam
     |--data.txt
     └--images
         └--picture_3.jpg
```

- Your task is to write commands in the correct order 
  from the directory given below.
- Do it with less commands without chaining them together.
- You can try your commands in the given `cli-exercise` directory
- The staging area is empty.
- Your current directory is `projects/`
  1. Delete both **data.txt**
  1. Move any type of image files from `program/assets/` to `exam/images/`
  1. Commit the changes with the following message "delete txt files and move image files"

- Solution:

*type your answer here*
