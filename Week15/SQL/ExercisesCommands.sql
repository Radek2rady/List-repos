-- Exercise 1 --
SELECT title FROM movies.movie WHERE director = "Steven Spielberg";

-- Exercise 2 --
SELECT distinct year FROM movies.movie INNER JOIN rating ON movie.mID = rating.mID WHERE stars = 4 OR stars = 5 order by year asc;

-- Exercise 3 --
SELECT DISTINCT title, stars FROM movie LEFT JOIN rating ON movie.mID = rating.mID WHERE stars IS null;

-- Exercise 4 --
SELECT name FROM reviewer LEFT JOIN rating ON reviewer.rID = rating.rid WHERE ratingDate IS null;

-- Exercise 5 --
SELECT reviewer.name, movie.title, rating.stars, rating.ratingDate 
FROM reviewer 
JOIN rating ON reviewer.rID = rating.rID 
JOIN movie ON movie.mID = rating.mID
ORDER BY name, title, stars;

-- Exercise 7 --
select movies.movie.title, max(rating.stars) 
FROM movies.movie 
JOIN movies.rating ON movies.movie.mID = movies.rating.mID
group by title
order by title; 

-- Exercise 8 --
select movies.movie.title, max(rating.stars) - min(rating.stars) AS rating_spread
FROM movies.movie 
JOIN movies.rating ON movies.movie.mID = movies.rating.mID
group by title
order by rating_spread desc, title;

-- Exercise 9 --
select AVG(older.avg) - AVG(younger.avg)
FROM ( select AVG(stars) AS avg
FROM movies.movie INNER JOIN movies.rating USING(mID)
WHERE year < 1980
group by mID ) AS older, ( 
select AVG(stars) AS avg
FROM movies.movie INNER JOIN movies.rating USING(mID)
WHERE year > 1980
group by mID ) AS younger