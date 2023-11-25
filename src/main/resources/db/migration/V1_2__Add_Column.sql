INSERT INTO users (id, firstname, lastname, pseudo, password, email, birthdate, address, admin)
VALUES (1, 'Alain', 'Chabat', 'alou','1234','alou@gmail.com', '1956-02-14', '29 avenue de la République 75002 Paris', false),
       (2, 'Bernard', 'Taris', 'beber','azerty', 'beber@gmail.com', '1965-02-14', '12 rue du vieux port 13400 Mareille', false),
       (3, 'Pepe', 'Gouinafier', 'leP','a1234', 'leP@gmail.com', '2001-02-03', '15 rue Ampere 92120 Clamart', false),
       (4, 'Paul', 'Aubjois', 'Paulou','takima', 'paul.aubjois@gmail.com', '1989-05-08', '16 rue du Maréchal 44120 Carcasonne', false),
       (5, 'Anouk', 'Koukou', 'Anoukou','G48K!!J!!', 'anoukou@gmail.com', '1998-12-13', '29 rue du Moulin 75002 Paris', false),
       (6, 'Root', 'Root', 'Admin','UnMdpSafe', 'admin@outlook.fr', '2000-01-02', '1 rue du Temple 75000 Paris', true);

INSERT INTO objects (user_id, name, image, description, condition, type, value)
VALUES
    (1, 'Ordinateur portable Dell XPS', 'chemin_image_1.jpg', 'Ordinateur portable Dell XPS en excellent état, avec processeur i7 et SSD 512 Go', 'Excellent état', 'Électronique', 1200),
    (1, 'Téléphone iPhone 13', 'chemin_image_2.jpg', 'iPhone 13 en parfait état, couleur argent, 128 Go de stockage', 'Bon état', 'Électronique', 900),
    (2, 'Livre "Le Seigneur des Anneaux"', 'chemin_image_3.jpg', 'Édition spéciale du "Seigneur des Anneaux" avec couverture rigide', 'Neuf', 'Livre', 30),
    (3, 'Vélo de montagne Trek', 'chemin_image_4.jpg', 'Vélo de montagne Trek tout suspendu, taille M, avec freins à disque hydrauliques', 'Très bon état', 'Sport et Loisirs', 800),
    (4, 'Sac à dos North Face', 'chemin_image_5.jpg', 'Sac à dos North Face de 40 litres, idéal pour la randonnée', 'Excellent état', 'Accessoires', 80),
    (5, 'Console de jeu PlayStation 5', 'chemin_image_6.jpg', 'PlayStation 5 avec deux manettes et jeux inclus', 'Neuf', 'Jeux vidéo', 600),
    (2, 'Guitare acoustique Martin', 'chemin_image_7.jpg', 'Guitare acoustique Martin en acajou, son exceptionnel', 'Très bon état', 'Instruments de musique', 1000),
    (2, 'Montre Rolex Submariner', 'chemin_image_8.jpg', 'Montre Rolex Submariner en acier inoxydable, avec boîte et papiers', 'Excellent état', 'Accessoires de mode', 8000),
    (2, 'Enceintes sans fil Sonos', 'chemin_image_9.jpg', 'Enceintes sans fil Sonos avec son cristallin, idéales pour la maison', 'Bon état', 'Électronique', 400),
    (3, 'Tapis de yoga Manduka', 'chemin_image_10.jpg', 'Tapis de yoga Manduka Pro, haute densité et antidérapant', 'Très bon état', 'Sport et Loisirs', 50),
    (3, 'Lunettes de soleil Ray-Ban Aviator', 'chemin_image_11.jpg', 'Lunettes de soleil Ray-Ban Aviator avec monture dorée', 'Neuf', 'Accessoires de mode', 150),
    (3, 'Chaise de bureau ergonomique', 'chemin_image_12.jpg', 'Chaise de bureau ergonomique avec support lombaire réglable', 'Excellent état', 'Mobilier', 200),
    (4, 'Casque audio Bose QuietComfort', 'chemin_image_13.jpg', 'Casque audio Bose QuietComfort avec réduction de bruit', 'Très bon état', 'Électronique', 250),
    (4, 'Tablette graphique Wacom', 'chemin_image_14.jpg', 'Tablette graphique Wacom Intuos Pro pour les artistes numériques', 'Bon état', 'Informatique', 120),
    (4, 'Machine à café Nespresso', 'chemin_image_15.jpg', 'Machine à café Nespresso avec mousseur à lait intégré', 'Très bon état', 'Appareils électroménagers', 100),
    (4, 'Sacoche en cuir pour ordinateur portable', 'chemin_image_16.jpg', 'Sacoche en cuir pour ordinateur portable jusqu à 15 pouce', 'Excellent état', 'Accessoires de mode', 70),
    (1, 'Couteau de chef japonais', 'chemin_image_17.jpg', 'Couteau de chef japonais en acier Damas, lame tranchante', 'Neuf', 'Cuisine', 150),
    (1, 'Parapluie pliant automatique', 'chemin_image_18.jpg', 'Parapluie pliant automatique avec revêtement imperméable', 'Neuf', 'Accessoires', 20),
    (1, 'Skateboard professionnel', 'chemin_image_19.jpg', 'Skateboard professionnel avec plateau en érable et roulements à billes ABEC-7', 'Bon état', 'Sport et Loisirs', 60),
    (1, 'Microphone USB Blue Yeti', 'chemin_image_20.jpg', 'Microphone USB Blue Yeti pour l enregistrement audio de haute qualité', 'Très bon état', 'Informatique', 80),
    (1, 'Trottinette', 'Trottinette', 'UNE TRES BELLE TROTTINETTE', 'neuf', 'Transport',100),
    (1, 'Velo', 'Velo', 'Un vélo pas si beau', 'usage', 'Transport',120),
    (2, 'Armoire à chaussettes', 'Armoire', 'Ma bonne vieille armoire à chaussettes', 'presque_neuf', 'Meuble',70);

INSERT INTO posts (object_id, title, publication, description, address)
VALUES
    (1, 'Vente ordinateur portable Dell XPS', '2023-11-25', 'Ordinateur portable Dell XPS en excellent état à vendre. Processeur i7, SSD 512 Go. Prix négociable.', '123 Rue de l Ordinateur'),
    (2, 'iPhone 13 à vendre', '2023-11-26', 'Téléphone iPhone 13 en bon état à vendre. Couleur argent, 128 Go de stockage. Livraison disponible.', '456 Avenue du Smartphone'),
    (3, 'Édition spéciale du Seigneur des Anneaux à vendre', '2023-11-27', 'Livre "Le Seigneur des Anneaux" en édition spéciale à vendre. Couverture rigide, comme neuf.', '789 Rue du Livre'),
    (4, 'Vélo de montagne Trek à vendre', '2023-11-28', 'Vélo de montagne Trek tout suspendu à vendre. Taille M, freins à disque hydrauliques. Prix négociable.', '101 Rue du Cycliste'),
    (5, 'Sac à dos North Face à vendre', '2023-11-29', 'Sac à dos North Face de 40 litres à vendre. Idéal pour la randonnée. Disponible immédiatement.', '111 Rue de l Aventure'),
    (6, 'PlayStation 5 à vendre', '2023-11-30', 'PlayStation 5 à vendre avec deux manettes et jeux inclus. Parfait état de fonctionnement.', '222 Avenue du Jeu Vidéo'),
    (7, 'Guitare acoustique Martin à vendre', '2023-12-01', 'Guitare acoustique Martin à vendre en acajou. Son exceptionnel. Étui inclus.', '333 Rue de la Musique'),
    (8, 'Montre Rolex Submariner à vendre', '2023-12-02', 'Montre Rolex Submariner à vendre. En acier inoxydable, avec boîte et papiers d origine.', '444 Avenue de la Montre'),
    (9, 'Enceintes sans fil Sonos à vendre', '2023-12-03', 'Enceintes sans fil Sonos à vendre. Son cristallin, idéales pour la maison. Livraison possible.', '555 Rue du Son'),
    (10, 'Tapis de yoga Manduka à vendre', '2023-12-04', 'Tapis de yoga Manduka Pro à vendre. Haute densité et antidérapant. Parfait pour la pratique quotidienne.', '666 Avenue du Yoga'),
    (11, 'Lunettes de soleil Ray-Ban Aviator à vendre', '2023-12-05', 'Lunettes de soleil Ray-Ban Aviator à vendre. Monture dorée, comme neuves. Livraison rapide.', '777 Rue de la Mode'),
    (12, 'Chaise de bureau ergonomique à vendre', '2023-12-06', 'Chaise de bureau ergonomique à vendre. Support lombaire réglable, excellent état.', '888 Avenue du Mobilier'),
    (13, 'Casque audio Bose QuietComfort à vendre', '2023-12-07', 'Casque audio Bose QuietComfort à vendre. Réduction de bruit, excellent état de fonctionnement.', '999 Rue du Son'),
    (14, 'Tablette graphique Wacom à vendre', '2023-12-08', 'Tablette graphique Wacom Intuos Pro à vendre. Idéale pour les artistes numériques.', '1010 Avenue de l Art'),
    (15, 'Machine à café Nespresso à vendre', '2023-12-09', 'Machine à café Nespresso à vendre. Avec mousseur à lait intégré. Parfait état.', '1212 Rue du Café'),
    (2, 'Echange vélo fonctionnel', '2023-10-09', 'Echange mon vélo acheté en 2021, par pitié prenez-le il est maudis', '29 avenue de la République 75002 Paris');

INSERT INTO favorite_posts(id, user_id, post_id)
VALUES (1, 3, 1);