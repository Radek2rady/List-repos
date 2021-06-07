# GymnocercusJade Orientation Normal Exam

## Getting Started

- Fork this repository under your own account
- Clone the forked repository to your computer
- Create a `.gitignore` file so generated files won't be committed
- Commit your progress frequently and with descriptive commit messages
- All your answers and solutions should go in this repository

## Keep in mind

- You can use any resource online, but **please work individually**

- **Don't just copy-paste** your answers and solutions, use your own words instead

- **Don't push your work** to GitHub until your mentor announces that the time is up

# Quiz application

You will have to create a simple quiz website.

## *Highlights*

- The user is able to add new questions, giving

    - the question
    - the 4 possible answers
    - marking the right answer

- The user is able to take a quiz

    - Getting different questions, one at a time
    - When giving the right answer gets a new question
    - When giving the wrong answer gets the score on the home page

## *Pages*

### Home

#### GET `/home`

- It should have a title `The Quiz Game`

- It should have one or two links:

    - Add a Question
    - Start a Quiz (only if there is already a question in the database)

#### GET `/home/:score`

- If there was a previous quiz taken, display the score. The score to display is in the URL parameter.

### Adding a question

#### GET `/question`

- It should display input fields for the question:

    - Question
    - 4 possible answers
    - Correct answer (drop-down or radio buttons)

#### POST `/question`

- After submitting the question, the app should store it in the database and redirect to the home page

### Quiz

#### GET `/quiz`

- It should display a random question from which is not previously answered

    - If there is no question in the database redirect to the home page

- Also display the 4 answer possibilities as links

- Clicking on the link should direct to this same endpoint with url parameters:

    - current question id
    - selected answer
    - score
    - *Example URL:* `/quiz/2/4/1`

- If there was a previous question (aka. there are query parameters in the URL other than /quiz):

    - if the answer is correct

        - render a new random question
        - display that the previous was correct
        - increment the score parameter in the links by one

    - if it was wrong redirect to the home and display the score

## Question

Given the following table named `apprentices`

| id | name           | cohort_id |
|:---|:---------------|:----------|
| 1  | Benedek Mihály | 1         |
| 2  | Jana Jechová   | 2         |
| 3  | Oldřich Dostál | 1         |
| 4  | Bo Tsai        | 2         |
| 5  | Barta Ema      | 3         |
| 6  | Chan Juan Yeh  | 3         |

And given the following table named `cohorts`

| id | name    |
|----|:--------|
| 1  | Vulpes  |
| 2  | Velox   |
| 3  | Lagopsu |

- Write an SQL statement to update the `Lagopsu` to `Lagopus`
- Write an SQL statement to insert `Doris D. Steves` to the `Vulpes` cohort
