# GymnocercusJade Foundation Retake Exam

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


### Multiply items in a matrix

Write a method that takes a matrix of non-negative integers (any matrix is allowed, including square matrices) as a parameter.

The function should:

- multiply each odd (1,3,5,7,9,...) number by 2 in each odd indexed row
- multiply each even (2,4,6,8,10,...) number by 2 in each even indexed row
- use the same indexing which we use in most programming language (starting with 0) and remember that 0 is also an even number. See the example for better understanding and ask questions if it is still unclear. 

Write at least 2 different unit tests, one that tests normal operation and one that tests unexpected input.

#### Example 1

Input

```text
[
  [1, 3, 6, 2],
  [7, 5, 6, 1],
  [3, 3, 1, 5],
  [9, 0, 5, 3]
]
```

Output

```text
[
  [1,  3,  12, 4],
  [14, 10, 6,  2],
  [3,  3,  1,  5],
  [18, 0,  10, 6]
]
```

#### Example 2

Input

```text
[
  [2, 3],
  [5, 0, 4, 0],
  [6],
  [5, 2]
]
```

Output

```text
[
  [4,  3],
  [10, 0, 4, 0],
  [12],
  [10, 2]
]
```

### Most productive year

We have a very simple database consisting of only csv files (comma separated values). Write a method called **mostProductiveYear()** which can read and parse a file containing information about movies. This method takes **one argument**, which is the name of the film studio
and returns the most productive year for the film studio. The most productive year is a year in which studio produced the **highest** number of movies.

If we do not have any data about the studio, the method **returns** an error message "Cannot find studio --studio name--, please try again later."

There's two example file, take a look at it in raw format (either download it or click on **raw** here on github). It is a csv file (comma separated values):

- [Marvel](marvel.csv)
- [Paramount](paramount.csv)

#### Example 1

Input

```text
mostProductiveYear(marvel)
```

Output

```text
2017
```

#### Example 2

Input

```text
mostProductiveYear(ghibli)
```

Output

```text
Cannot find studio ghibli, please try again later.
```

### VideoLibrary

You are going to create a Video Library 
where the guests can borrow videos available in the database.

#### Video

- The video has 
  - title, director, release year and price
    (these are the basic data that must be set when the video is created)

  - the number of guests who have ever borrowed the video

  - and also if the video is borrowed currently.

- There are two types of video:

  - `GrayScale`: costs USD$3.99
 
  - `Colored`: costs USD$6.99

- It should have a `toString()` method which
  returns information about the video itself:

  - For example: `Titanic by James Cameron from 1997 - borrowed 1 times.`
  
- It should have a `copy()` method:

  - The `GrayScale` video shall throw an error/exception with the message: `The Police will find you soon`
  
  - The `Colored` video shall return a clone of itself (a new object with the same __basic__ data)

#### Guest

- Every guest should have a name and an address and __may__ have a video.

- The guest is able to borrow exactly one `Video` at one time.

- It has a `toString()` method which
  gives information about the currently booked video.

  - For example: `Jon Doe is currently borrowing the Titanic.`
  - For example: `Jon Doe is not borrowing anything currently.`

- It has a `steal()` method which
  creates and returns a `copy` of the borrowed video (if any).
  If there is no video borrowed, it shall print: `There is no video available to steal`.

#### VideoStore
- It has a list of registeredGuests and a list of videos

- It has an `addGuest()` method where a guest is added to the store, pass the data about guest as an argument, do not have a static guest inside this method. We should be able to add any guest we want.

- It has an `addVideo()` method where a video is added to the store, pass the data about video as an argument, do not have a static video inside this method. We should be able to add any videos we want.

- It has a `borrow()` method where you can borrow videos by a guest.

  - It takes two parameters: `guest` and `video`

  - It throws error/exception with descriptive message if the following happens:

    - the guest already has a video borrowed
    - the video is currently not available
  
  - Otherwise
  
    - sets the video status to "borrowed"
    - assigns the video to the guest

- It has a `returnVideo()` method where
  you can return the video back to the store.

  - It takes one parameter: `guest`
  - It increases the videos borrowing number if the guest has a video
  - It changes the video status to "not borrowed"
  - It takes the video away from the guest

- It has a `getMostOftenBorrowed()` method which
  returns the most often borrowed video.

- It has a `toString()` method which gives information about the available 
  videos and the registered guests.

  - For example: `The store has 0 videos available right now and 1 guests registered.`
  - For example: `The store has 1 videos available right now and 1 guests registered.`


## Command line exercise

- Take a look at this directory structure:

```text
homework
 |--math
 |   |--.git
 |   |--calculus
 |   |   |--jacobian_matrix.md
 |   |   └--exercises
 |   |       └--week01_hw.txt
 |   └--geometry
 |       |--week01_hw.txt
 |       └--pithagorean_theorem.md
 └--history
     |--.git
     |--taylor_polynomial.md
     |--history_of_rome.md
     └--history_of_greece.md
```

- Your task is to write commands in the correct order from the directory given below.
- Do it with less commands without chaining them together.
- **You don't have to use change directory (cd) for tasks that do not work with git (1, 2, 3, 5), so don't use it. But you can use it with git related tasks (4, 6)**
- Assume that the following files are currently in the staging area:
  - `math/calculus/jacobian_matrix.md`
  - `math/geometry/pithagorean_theorem.md`
- Your current directory is `homework/`
  1. Create an `exercises` directory in `math/geometry/`
  1. Move `geometry/week01_hw.txt` to `math/geometry/exercises/`
  1. Move `history/taylor_polynomial.md` to `math/calculus/`
  1. Remove `math/geometry/pithagorean_theorem.md` from the staging area
  1. Rename `math/geometry/pithagorean_theorem.md` to `math/geometry/pythagorean_theorem.md`
  1. Commit all the changes

- Solution:

```text
cd math/geometry
mkdir exercises
cd..
cd..
mv geometry/week01_hw.txt math/geometry/exercises/
mv history/taylor_polynomial.md math/calculus/
math/geometry/
git init
git reset
git commit -m "Committing all changes"
```
