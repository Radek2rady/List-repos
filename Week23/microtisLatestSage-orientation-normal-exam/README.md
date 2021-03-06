# MicrotisLatestSage Orientation Normal Exam

## Getting Started

- Fork this repository under your own account
- Clone the forked repository to your computer
- Create a `.gitignore` file so generated files won't be committed
- Commit your progress frequently and with descriptive commit messages
- All your answers and solutions should go in this repository

## Keep in mind

- You can use any resource online, but **please work individually**

- **Don't just copy-paste** your answers and solutions, use your own words
  instead

- **Don't push your work** to GitHub until your mentor announces that the time
  is up

## Tasks

# Human database 1.0

## Database

Feel free to use the provided SQL file [for MySQL](assets/backend-human.sql)

## Endpoints

### GET `/`

- It should display the main page

- The main page should display

  - the heading
  - the link to the GET `/humans/aggregate` page
  - the form with a text field and a submit button

- The form should not allow submission with empty text field

- After the form is submitted it should go to GET `/humans` with the requested
  location

- The main page

  ![The main page](assets/backend-main-page.jpg)

### GET `/humans?location=<location>`

- It should display the `filter by location` page

- The filter by location page should display

  - the heading
  - the link to the GET `/` page
  - the heading with the location
  - the humans' first and last name with the specific location if there is any

- If the location is not present or empty display the bad request page

- The bad request page should display

  - the two headings
  - link back to the GET `/` page

Example query:

```raw
GET /humans?location=Hungary
```

It should display all the humans from Hungary

- The filter page with abstract values

  ![The filter page's abstract version](assets/backend-filter-page-abstract.jpg)

- The filter page with actual values

  ![The filter page](assets/backend-filter-page.jpg)

- The bad request page

  ![The bad request page](assets/backend-bad-request-page.jpg)

### GET `/humans/aggregate`

- It should display the aggregation page

- The aggregation page should display

  - the two headings
  - the link to the GET `/` page
  - the average age
  - the gender ratio in percentage
  - the location with the most human

- If there is no human in the database redirect to the GET `/` page

- The aggregation page with abstract values

  ![The aggregation page's abstract version](assets/backend-aggregation-page-abstract.jpg)

- The aggregation page with actual values

  ![The aggregation page](assets/backend-aggregation-page.jpg)

### POST `/api/humans`

- It should be a REST endpoint

- It should accept the following key-value pairs in JSON format

  - `firstName` : string
  - `lastName` : string
  - `age` : number
  - `gender` : string
  - `location` : string
  
  Example:

  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "age": 29,
    "gender": "male",
    "location": "USA"
  }
  ```

- It should validate the request body

  - All properties should be present
  - Age should be a number
  - Gender should be `male` or `female`
  - First name, last name, gender and location are strings

- If the validation fails it should respond with `400 Bad Request`

- If the validation passes it should store the entity in the database and
  respond with `201 Created`

## Question

Given the following table named `applicants`.

| id | name               | country_id | age |
|:---|:-------------------|:-----------|:----|
| 1  | Bo??ivoj Sou??ek     | 1          | 24  |
| 2  | Papp Patr??cia      | 2          | 33  |
| 3  | Kocsis Ivett       | 2          | 37  |
| 4  | Slavom??r Vykukal   | 1          | 20  |
| 5  | Bruno Mal??k        | 1          | 31  |
| 6  | Veronika Luke??ov??  | 1          | 18  |
| 7  | Sz??kely Mikl??s     | 2          | 29  |
| 8  | Heged??s Benj??min   | 2          | 37  |
| 9  | Nela Machov??       | 1          | 20  |
| 10 | Balog Rajmund      | 2          | 39  |
| 11 | Major Borb??la      | 2          | 35  |
| 12 | Evel??na Horv??thov?? | 1          | 23  |
| 13 | V??szoly Vivien     | 2          | 40  |
| 14 | Lada St??skalov??    | 1          | 27  |
| 15 | Dagmar Bene??ov??    | 1          | 33  |

Given the following table named `countries`.

| id | country        |
|:---|:---------------|
| 1  | Czech Republic |
| 2  | Hungary        |

Write an SQL query to select the name and the country of applicants from
Hungary with the age 40.

The expected result should be the following.

| name           | country |
|:---------------|:--------|
| V??szoly Vivien | Hungary |
