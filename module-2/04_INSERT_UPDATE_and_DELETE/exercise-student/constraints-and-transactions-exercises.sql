-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
INSERT INTO actor(first_name, last_name)
VALUES ('HAMPTON', 'AVENUE'),('LISA', 'BYWAY');

SELECT *
FROM actor;

-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.
INSERT INTO film(title, description, release_year, language_id, length)
VALUES ('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, 1, 198);

SELECT *
FROM film
WHERE title = 'EUCLIDEAN PI';

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
INSERT INTO film_actor(actor_id, film_id)
VALUES (201, 1001), (202, 1001);

SELECT *
FROM film_actor
WHERE film_id = 1001;


-- 4. Add Mathmagical to the category table.
INSERT INTO category(name)
VALUES ('Mathmagical');

SELECT * 
FROM category;

-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
INSERT INTO film_category(film_id, category_id)
VALUES ((SELECT film_ID FROM film WHERE title = 'EUCLIDEAN PI'),(SELECT category_id FROM category WHERE name = 'Mathmagical'));

UPDATE film_category
SET category_id = 17
        WHERE film_id IN(SELECT film_id FROM film WHERE title = 'EGG IGBY')
        OR film_id IN(SELECT film_id FROM film WHERE title = 'KARATE MOON')
        OR film_id IN(SELECT film_id FROM film WHERE title = 'RANDOM GO')
        OR film_id IN(SELECT film_id FROM film WHERE title = 'YOUNG LANGUAGE');

-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)
UPDATE film
SET rating = 'G'
WHERE film_id IN(SELECT film_id FROM film_category WHERE category_id = (SELECT category_id FROM category WHERE name = 'MATHMAGICAL'));

SELECT *
FROM film_category
WHERE category_id = 17;

-- 7. Add a copy of "Euclidean PI" to all the stores.
INSERT INTO inventory(film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'),1);
INSERT INTO inventory(film_id, store_id)
VALUES ((SELECT film_id FROM film WHERE title = 'EUCLIDEAN PI'),2);


-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.

DELETE 
FROM film
WHERE title = 'EUCLIDEAN PI';

-- (Did it succeed? Why?)
-- <No it didnt work, because it violates foreign key constraints, other tables are using shared keys.>


-- 9. Delete Mathmagical from the category table.
DELETE
FROM category
WHERE name = 'Mathmagical';

-- (Did it succeed? Why?)
-- <No, it doesn't work because it violates foreign key constraint, category_id is still referenced from the film_category table.>
--


-- 10. Delete all links to Mathmagical in the film_category tale.
DELETE
FROM film_category
WHERE category_id IN (SELECT category_id FROM category WHERE name = 'Mathmagical')

-- (Did it succeed? Why?)
-- <Yes, because >
--

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
DELETE
FROM category
WHERE name = 'Mathmagical';

DELETE
FROM film
WHERE title = 'EUCLIDEAN PI';
-- (Did either deletes succeed? Why?)
-- <YES, deleting from the category table works because it has no other key constraints. Deleting Euclidean Pi from films does not because it still contains other constrained foreign keys.>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.


