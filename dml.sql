-- SET SQL_SAFE_UPDATES = 0;
-- DROP database lpr;
-- create database lpr;

INSERT INTO lpr.roles (roles_id, roles)
VALUES
(1, 'Admin'),
(2, 'User');

INSERT INTO lpr.users (user_id, login, Credentials, email, gender, birthday, roles_id)
VALUES
(1, 'Robert 1', 'Credentials', 'valnurray@gmai.com', 'male', null, 1),
(2, 'Hector from Troy', 'Credentials', 'valnurray@gmai.com', 'male', null, 2),
(3, 'Bigbag Cat', 'Credentials', 'valnurray@gmai.com', 'male', null, 2),
(4, 'I dont know', 'Credentials', 'valnurray@gmai.com', 'male', null, 2),
(5, 'Nikita Lankin', 'Credentials', 'valnurray@gmai.com', 'male', null, 2),
(6, 'John Carpenter', 'Credentials', 'email@gmail.com', 'male', null, 2),
(7, 'Robert Downey Junior', 'Credentials', 'emailsssss2@sssemail.com', 'male', null, 2),
(8, 'Captain dead', 'Credentials', 'email@sssemail.com', 'male', null, 2),
(9, 'Sone user', 'Credentials', 'email@sssemail.com', 'male', null, 2),
(10, 'Capec', 'Credentials', 'email@sssemail.com', 'male', null, 2),
(11, 'A eto kakec', 'Credentials', 'email@something.com', 'male', null, 2);

INSERT INTO lpr.content (content_id, Title, Info, Link)
values
(1, 'Japan Travel', 'How to Spend 14 Days in Japan - A Japan Travel Itinerary', 'https://www.youtube.com/embed/IuTDuvYr7f0'),
(2, 'Japan from Ptushkin', 'Japan that blows your mind. Big release.', 'https://www.youtube.com/embed/Gb0TQ7VeApY'),
(3, 'Web Design: intro', 'Web Design: The Complete Guide to Getting Started in 2022', 'https://www.youtube.com/embed/j1pa36PK14E'),
(4, 'The Universe', 'Journey Through The Universe - HD Documentary', 'https://www.youtube.com/embed/mO3Q4bRQZ3k'),
(5, 'Cosmic Vistas', 'The Most Breathtaking Sights In Our Galaxy', 'https://www.youtube.com/embed/8vkqH3r1-f4'),
(6, 'TOKYO, JAPAN', '100 Things to do in TOKYO, JAPAN', 'https://www.youtube.com/embed/HYSMJ-lM2t0'),
(7, 'TOKYO Travel tips', 'Giving you EVERYTHING you need to know to before you start your own Japanese adventure!', 'https://www.youtube.com/embed/bC9m_id_Yds'),
(8, 'Attractive City 1', '7 principles for building better cities', 'https://www.youtube.com/embed/IFjD3NMv6Kw'),
(9, 'Attractive City 2', 'How to Make an Attractive City', 'https://www.youtube.com/embed/Hy4QjmKzF1c'),
(10, 'Ancient Ruins', '25 Most Amazing Ancient Ruins of the World', 'https://www.youtube.com/embed/fq70UHD8DrM'),
(11, 'Man-Made Wonders', '30 Greatest Man-Made Wonders of the World', 'https://www.youtube.com/embed/YEok4Ykw204'),
(12, 'A new era of space travel', 'A revolution in the history of space travel took off on 20 July 2021', 'https://www.youtube.com/embed/P_GO2IS_yBQ'),
(13, 'Andromeda', 'An Extraordinary Journey to the Mysterious Galaxy of Andromeda', 'https://www.youtube.com/embed/OCNsxmUpals'),
(14, 'Other Earths', 'Other Earths: The Search for Habitable Planets', 'https://www.youtube.com/embed/J8lJtgyAcIA'),
(15, 'Gravity', 'Gravity Compilation: Crash Course Kids', 'https://www.youtube.com/embed/EwY6p-r_hyU'),
(16, 'Why Is the Sky Blue?', 'But why is the sky blue?', 'https://www.youtube.com/embed/bcVr13Fw7w8'),
(17, 'Big Bang', 'How The Universe Began- Full Documentary', 'https://www.youtube.com/embed/L2zg5gBU2sU'),
(18, 'Big Bang 2', 'From The Big Bang To The Present Day', 'https://www.youtube.com/embed/J_PpoOHIA-w'),
(19, 'Guitar Lesson 1', 'Guitar Lesson 1 - Absolute Beginner? Start Here!', 'https://www.youtube.com/embed/BBz-Jyr23M4'),
(20, 'Guitar Lesson 2', 'Guitar Lesson 2 - EASY 2 CHORD SONG & LEAD GUITAR', 'https://www.youtube.com/embed/6Jxz9F3CYuo'),
(21, 'Guitar Lesson 3', 'Guitar Lesson 3 - Three Little Birds Guitar Tutorial', 'https://www.youtube.com/embed/SV2ehlxGEFw'),
(22, 'Chapter 1', 'LIFE BEYOND: Chapter 1. Alien life, deep time, and our place in cosmic history', 'https://www.youtube.com/embed/SUelbSa-OkA'),
(23, 'Chapter 2', 'LIFE BEYOND II: The Museum of Alien Life', 'https://www.youtube.com/embed/ThDYazipjSI'),
(24, 'Chapter 3', 'LIFE BEYOND 3', 'https://www.youtube.com/embed/saWNMPL5ygk'),
(25, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(26, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(27, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(28, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(29, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(30, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(31, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(32, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(33, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(34, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(35, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(36, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(37, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(38, 'Lorem ipsum 2', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc'),
(39, 'Lorem ipsum 3', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'https://www.youtube.com/embed/x1R2yQtErPc');

INSERT INTO lpr.category (category_id, description, title)
VALUES
(1, 'The amazing world of space',  'Space'),
(2, 'We will teach you how to make music',  'Music'),
(3, 'Discover the world of travel with us',  'Travel'),
(4, 'Different areas of science',  'Sciense'),
(5, 'The best design lessons',  'Design'),
(6, 'Architecture in the modern and ancient world',  'Architecture'),
(7, 'All the rest',  'Else');

insert into lpr.product (product_id, info, price, title, visibility) 
values 
(1, 'Japan travel guide. Traveling on the couch', 32.00, 'Travel to Japan', 'Y'),
(2, 'Web design. Best practice', 20.00, 'Design', 'Y'),
(3, '...not so far away', 45.00, 'Explore the galaxy', 'Y'),
(4, '...not so far away', 45.00, 'Tokyo', 'Y'),
(5, 'Modern architecture in modern cityes', 32.00, 'City Design', 'Y'),
(6, 'Ancient architecture', 31.00, 'Ancient Design', 'Y'),
(7, 'explore galaxy with Morgan Freeman', 13.00, 'Out of space', 'Y'),
(8, 'Phisics for children 4-6 years', 54.00, 'Phisics', 'Y'),
(9, 'Cosmic history', 99.00, 'LIFE BEYOND', 'Y'),
(10, 'Math for children 6-8 years', 78.00, 'Math', 'Y'),
(11, 'Math for children elementary school', 17.00, 'Math', 'Y'),
(12, 'Math for children secondary school', 15.00, 'Math', 'Y'),
(13, 'Math', 27.30, 'Math', 'Y'),
(14, 'Math for students', 29.00, 'Phisics', 'Y'),
(15, 'Big Bang Theory. were galaxy starts', 13.00, 'Big Bang', 'Y'),
(16, 'Guitar for beginers', 47.00, 'Guitar l1', 'Y'),
(17, 'Guitar not for beginers', 32.00, 'Guitar l2', 'Y'),
(18, 'Playinf on piano', 21.00, 'Piano', 'Y'),
(19, 'the best contemporary composers', 24.00, 'Classic music', 'Y'),
(20, 'Math for students', 27.00, 'Math', 'Y');

INSERT INTO lpr.bascet (bascet_id, count_orders, total_orders_price)
values
(1, 1, 20.00),
(2, 2, 78.00),
(3, 1, 15.00);

INSERT INTO lpr.orderfield (order_id, time_order, total_price, bascet_id, product_id, user_id)
values
(1, null, 20.00, 1, 2, 1),
(2, null, 47.00, 2, 16, 3),
(3, null, 31.00, 2, 6, 3),
(4, null, 15.00, 3, 12, 4);

INSERT INTO lpr.product_members (product_members_id, order_time, product_id, user_id)
values
(1, null, 1 , 1),
(2, null, 2 , 1),
(3, null, 3 , 1),
(4, null, 9 , 1),
(5, null, 1 , 2),
(6, null, 2 , 2),
(7, null, 5 , 3),
(8, null, 6 , 4),
(9, null, 6 , 4),
(10, null, 11 , 5),
(11, null, 12 , 5),
(12, null, 13 , 5),
(13, null, 14 , 5),
(14, null, 2 , 6),
(15, null, 4 , 6),
(16, null, 20 , 7),
(17, null, 19 , 8),
(18, null, 7 , 9),
(19, null, 16 , 10);

INSERT INTO lpr.product_content (content_id, product_id)
values
(1, 1),
(2, 1),
(3, 2),
(4, 3),
(5, 3),
(6, 4),
(7, 4),
(8, 5),
(9, 5),
(10, 6),
(11, 6),
(12, 7),
(13, 7),
(14, 7),
(15, 8),
(16, 8),
(17, 15),
(18, 15),
(19, 16),
(20, 16),
(21, 16),
(22, 9),
(23, 9),
(24, 9),
(25, 10),
(26, 10),
(27, 10),
(28, 11),
(29, 11),
(30, 11),
(31, 11),
(32, 11),
(33, 20),
(34, 20),
(35, 19),
(36, 19),
(37, 18),
(38, 17),
(39, 12);

INSERT INTO lpr.category_product (category_id, product_id)
values
(1, 3),
(1, 7),
(1, 9),
(1, 15),
(2, 16),
(2, 17),
(2, 18),
(2, 19),
(3, 1),
(3, 4),
(4, 8),
(4, 10),
(4, 11),
(4, 12),
(4, 13),
(4, 14),
(4, 20),
(5, 5),
(5, 6);