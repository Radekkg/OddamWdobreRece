CREATE DATABASE charityDonation;

INSERT INTO institutions (id, name, description)
VALUES      (1,'"Dbam o Zdrowie"','Pomoc dzieciom z ubogich rodzin.'),
            (2,'"A kogo"','Pomoc wybudzaniu dzieci ze śpiączki.'),
            (3,'“Dla dzieci"','Pomoc osobom znajdującym się w trudnej sytuacji życiowej.'),
            (4,'“Bez domu”','Pomoc dla osób nie posiadających miejsca zamieszkania.');


INSERT INTO donations (id, quantity,institutions_id,street,city ,zip_code, pick_up_date, pick_up_time, pick_up_comment)
VALUES (1,1,1,'Zamkowa','Ostrzeszów','63-500','2022-09-26',20-21,'test 1'),
        (2,2,2,'Piastowskia','Ostrzeszów','63-500','2022-09-20',20-21,'test 2'),
        (3,2,4,'Farna','Ostrzeszów','63-500','2022-09-12',20-12,'test 3'),
        (4,4,3,'Grunwaldzka','Ostrzeszów','63-500','2022-09-11',20-21,'test 4');

INSERT INTO categories (id, name)
VALUES  (1,'ubrania'),
        (2,'zabawki'),
        (3,'buty');

INSERT INTO donations_categories(donation_id, categories_id)
VALUES (1,2),
       (2,3),
       (3,3),
       (4,3),
       (4,1),
       (4,2);




