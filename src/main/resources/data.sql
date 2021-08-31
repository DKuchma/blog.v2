INSERT INTO blog_user (id,EMAIL, LOGIN, PASSWORD, USER_NAME)
VALUES (1,'user1@yandex.ru', 'user1', 'user1', 'user1'),
(2,'user2@yandex.ru', 'user2', 'user2', 'user2');

INSERT INTO blog_post (BODY, TITLE, CREATOR_ID) VALUES ('POST1', 'TITLE1', 1),
('POST2', 'TITLE2', 2);