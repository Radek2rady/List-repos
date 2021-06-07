# GymnocercusJade Foundation Normal Exam

## Getting Started

- **Fork** this repository under your own account
- Clone your forked repository to your computer
- Create a `.gitignore` file so generated files won't be committed
- Commit your progress frequently and with descriptive commit messages
- All your answers and solutions should go in this repository
- Take care of style guide
- Take care of the naming of classes, fields, variables, files, etc.

## Keep in mind

- You can use any resource online, but **please work individually**

- **Don't just copy-paste** your answers and solutions,
  use your own words instead

- **Don't push your work** to GitHub until your mentor announces
  that the time is up

## Exercises


### Tricky Average

Create and test a function called `getTrickyAvg`
that takes an array as parameter and returns
the average of the smallest odd (1,3,5,7,9,...) and largest even (2,4,6,8,10,...).  

If there is no odd/even number then use 0 instead (take a look at [Example 3](#example-3) for better understanding).  

You can use streams; however, if you do, we will ask you to verbally explain the functionality behind the methods to a mentor. It’s important that you know how streams work if you are going to use them. You should be able to solve this task with concepts we showed you in foundation.

Write at least 2 **different** unit tests, one that tests normal operation and one that tests unexpected input.

#### Example 1

Input

```text
[3, 4, 5, 6]
```

Output

```text
(3+6)/2=4.5
```

#### Example 2

Input

```text
[5, 2, 8, -1]
```

Output

```text
(-1+8)/2=3.5
```


#### Example 3

Input

```text
[5, 7, 9, 11]
```

Output

```text
(5+0)/2=2.5
```

### Weekly feedback evaluator

Write a method which can read and parse a file containing information about
weekly feedback from apprentices about a mentor. 

The mentor is *rated* in 4 different metrics, those are respectively (*`matReview`*, *`presSkills`*, *`helpfulness`*, *`explanation`*) separated with 1 space:

- m = `matReview`
- p = `presSkills`
- h = `helpfulness`
- e = `explanation`

```text
m p h e   // this is just an info line which is not in the actual file
1 3 5 3   // this line is an answer from an apprentice
2 3 4 3   // this is another response
...
```

The method should return a map/dictionary containing the average rating
(in each metric) of the mentor.

#### Example

[Example file can be found here.](./responses.txt)

Output

```js
{
  "matReview": 2.25,
  "presSkills": 4.0, // or 4 is fine as well
  "helpfulness": 4.5,
  "explanations": 3.75
}
```

### Hero battle

You are going to simulate a fight between Superheroes.

#### Hero

- It has a name.

- It has a motivation: a number represents how much
  the hero wants to save the world

- It sets the motivation and name when creating an instance of Hero class.

- It has a `getMotivationLevel()` method which returns a number between 0 and 2

  - 0 if the motivation is equal or below 25
  - 1 if the motivation is between 25 and 40
  - 2 if motivation is equal or above 40

- It has a `punch()` method which takes another Hero as parameter

  - the hero - who called the method - attacks only if his/her motivation level is at least 1
  - damage is calculated by `attacker hero's motivation / 1.5` (Always round up the decimal numbers)
  - damage is done by calling the other hero's `bePunched()` method

- It should have a `bePunched()` method which takes a `damage` as a parameter

  - `bePunched()`: the hero suffers damage, his/her motivation decreases by `damage / (own motivation / 2)` (Always round up the decimal numbers)
  - Pay attention that the motivation can't go below 0.

- An example for the punching:

```
Captain America with 28 motivation punches Batman who has 20 motivation.
The damage will be 28/1.5=19 (after round up). Batman will suffer 19/2=2 damage (after round up).
After the fight, the motivations will be the following:
 - Captain America: 28
 - Batman: 18
Note: Always round up the decimal numbers.

```

- `toString()`: returns a string status report about the hero

  - if the hero's motivation level is 0: {name} is not motivated anymore.
  - if the hero's motivation level is 1: {name} is motivated.
  - if the hero's motivation level is 2: {name} is well motivated.

##### DC Hero

**`DCHero` is a `Hero`**

- It has a default motivation 45 if the name is provided only. You should still be able to create a DCHero with both name and motivation.
- A DC Hero is not able to punch another DC Hero.

##### Marvel Hero 

**`MarvelHero` is a `Hero`**

- It has a default motivation 40 if the name is provided only. You should still be able to create a MarvelHero with both name and motivation.
- A Marvel Hero is not able to punch another Marvel Hero. 

**LET'S FIGHT BETWEEN THE SUPERHEROES**

##### Battle

- It should have a list of `Hero`s.

- We should be able to create a battle by receiving a list of `Hero`s.

- It has an `avengersAssemble()` method which returns every `MarvelHero`
  with the highest motivation level (*level 2*).
  
- It has a `startBattle()` method which
  
  - first calls the `avengersAssemble()` method

  - then all assembled `MarvelHero` attacks every `DCHero` 

    - before punching the next opponent, the opponent
      should punch back the attacker. Example:

    ```
      Attacker Team: Iron Man, Thor, Hulk
      Attacked Team: Wonder Woman, Flash

      First Iron Man punches Wonder Woman,
      but before moving on to Flash,
      Wonder Woman punches back Iron Man.
      Then Iron Man punches Flash,
      and Flash punches back Iron Man.
      The same goes for the rest of the attacker team.

    ```
    
  - the winner team is where the accumulated motivation of the heroes is bigger.

  - lastly call the `toString()` method on the winner team's heros.

  - if there is no winner team, then call the `toString()` on Marvel heros.


## Command line exercise

- Take a look at this directory structure:

```text
restaurant
 |--storage
 |   |--.git
 |   |--drygoods.csv
 |   |--vegnfruit.csv
 |   |--chilledprods.csv 
 |   └--acount
 |       |--2019-sum.csv
 |       └--2020-sum.csv
 └--delivery
     |--drivers
     |   └--john-working-hours.csv
     |--jessica-working-hours.csv
     └--account
         └--2019-sum.csv
```

- Your task is to write commands in the correct order from the directory given below.
- Do it with less commands without chaining them together.
- Assume that the following file is currently in the staging area:
  - `storage/acount/2020-sum.csv`
  - `storage/acount/2019-sum.csv`
- Your current directory is `restaurant/`
  1. Remove every file from the staging area
  1. Rename `storage/acount` to `storage/account`
  1. Commit the changes
  1. Change the `delivery` directory into a Git repository
  1. Move `delivery/jessica-working-hours.csv` file to `delivery/drivers` directory
  1. Delete the last 2 lines from `delivery/drivers/john-working-hours.csv`

- Solution:

```text
rm storage/acount/*.*
mv storage/acount storage/account
git add .
git commit -m "changes in CLI structure"
cd delivery
git init
mv jessica-working-hours.csv drivers/
```
