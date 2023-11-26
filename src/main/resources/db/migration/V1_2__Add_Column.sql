INSERT INTO users (firstname, lastname, pseudo, password, email, birthdate, address, admin)
VALUES ('Alain', 'Chabat', 'alou','1234','alou@gmail.com', '1956-02-14', '29 avenue de la République 75002 Paris', false),
       ('Bernard', 'Taris', 'beber','azerty', 'beber@gmail.com', '1965-02-14', '12 rue du vieux port 13400 Mareille', false),
       ('Pepe', 'Gouinafier', 'leP','a1234', 'leP@gmail.com', '2001-02-03', '15 rue Ampere 92120 Clamart', false),
       ('Paul', 'Aubjois', 'Paulou','takima', 'paul.aubjois@gmail.com', '1989-05-08', '16 rue du Maréchal 44120 Carcasonne', false),
       ('Anouk', 'Koukou', 'Anoukou','G48K!!J!!', 'anoukou@gmail.com', '1998-12-13', '29 rue du Moulin 75002 Paris', false),
       ('Root', 'Root', 'Admin','UnMdpSafe', 'admin@outlook.fr', '2000-01-02', '1 rue du Temple 75000 Paris', true);

INSERT INTO items (user_id, name, image, description, condition, type, value)
VALUES
    (1, 'Ordinateur portable Dell XPS', 'https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/xps-notebooks/xps-13-9315/media-gallery/umber/notebook-xps-13-9315-umber-gallery-3.psd?fmt=pjpg&pscan=auto&scl=1&wid=4108&hei=2832&qlt=100,1&resMode=sharp2&size=4108,2832&chrss=full&imwidth=5000', 'Ordinateur portable Dell XPS en excellent état, avec processeur i7 et SSD 512 Go', 'Excellent état', 'Électronique', 1200),
    (1, 'Téléphone iPhone 13', 'https://media.ldlc.com/r1600/ld/products/00/05/93/08/LD0005930815_1.jpg', 'iPhone 13 en parfait état, couleur argent, 128 Go de stockage', 'Bon état', 'Électronique', 900),
    (2, 'Livre "Le Seigneur des Anneaux"', 'https://m.media-amazon.com/images/I/71ADh-KokpL._AC_UF1000,1000_QL80_.jpg', 'Édition spéciale du "Seigneur des Anneaux" avec couverture rigide', 'Neuf', 'Livre', 30),
    (3, 'Vélo de montagne Trek', 'https://www.velovert.com/photos/news/zooms/2019-08-14-102840_trek-fuel-ex--i--98-gx[71f842a6dab400e144302af7b9fc8fbd156577136083].jpg', 'Vélo de montagne Trek tout suspendu, taille M, avec freins à disque hydrauliques', 'Très bon état', 'Sport et Loisirs', 800),
    (4, 'Sac à dos North Face', 'https://images.thenorthface.com/is/image/TheNorthFaceEU/52SY_KX7_hero?$262x306$', 'Sac à dos North Face de 40 litres, idéal pour la randonnée', 'Excellent état', 'Accessoires', 80),
    (5, 'Console de jeu PlayStation 5', 'https://www.numerama.com/wp-content/uploads/2021/12/maxresdefault-8.jpg', 'PlayStation 5 avec deux manettes et jeux inclus', 'Neuf', 'Jeux vidéo', 600),
    (2, 'Guitare acoustique Martin', 'https://img.kytary.com/eshop_fr/velky_v2/na/637012290295200000/b889edac/64679094/martin-000-10e.jpg', 'Guitare acoustique Martin en acajou, son exceptionnel', 'Très bon état', 'Instruments de musique', 1000),
    (2, 'Montre Rolex Submariner', 'https://www.bijouxmedusa.fr/cdn/shop/products/rolex-submariner-40mm-2-tons-bleu-saphir-montre-or-bijoux-medusa-homme-quebec-canada-533_800x.jpg?v=1595388740', 'Montre Rolex Submariner en acier inoxydable, avec boîte et papiers', 'Excellent état', 'Accessoires de mode', 8000),
    (2, 'Enceintes sans fil Sonos', 'https://cdn.conforama.fr/prod/product/image/f703/G_CNF_O57453235_B.jpeg', 'Enceintes sans fil Sonos avec son cristallin, idéales pour la maison', 'Bon état', 'Électronique', 400),
    (3, 'Tapis de yoga Manduka', 'https://www.weekendbee.com/cdn/shop/products/eko-yoga-mat-5mm-from-tree-rubber-yoga-mat-manduka-surf-marbled-251711.jpg?v=1676618881', 'Tapis de yoga Manduka Pro, haute densité et antidérapant', 'Très bon état', 'Sport et Loisirs', 50),
    (3, 'Lunettes de soleil Ray-Ban Aviator', 'https://images.ray-ban.com/is/image/RayBan/805289601708__STD__shad__qt.png?impolicy=RB_Product&width=400&bgc=%23f2f2f2', 'Lunettes de soleil Ray-Ban Aviator avec monture dorée', 'Neuf', 'Accessoires de mode', 150),
    (3, 'Chaise de bureau ergonomique', 'https://cdn2.conforama.fr/product/image/b78e/G_CNF_D22771741_B.jpeg', 'Chaise de bureau ergonomique avec support lombaire réglable', 'Excellent état', 'Mobilier', 200),
    (4, 'Casque audio Bose QuietComfort', 'https://m.media-amazon.com/images/I/51JbsHSktkL._AC_UF1000,1000_QL80_.jpg', 'Casque audio Bose QuietComfort avec réduction de bruit', 'Très bon état', 'Électronique', 250),
    (4, 'Tablette graphique Wacom', 'https://media.ldlc.com/r1600/ld/products/00/04/80/75/LD0004807591_2.jpg', 'Tablette graphique Wacom Intuos Pro pour les artistes numériques', 'Bon état', 'Informatique', 120),
    (4, 'Machine à café Nespresso', 'https://www.conforama.fr/fstrz/r/s/media.conforama.fr/m/export/Medias/500000/50000/1000/900/90/G_551995_B.jpg', 'Machine à café Nespresso avec mousseur à lait intégré', 'Très bon état', 'Appareils électroménagers', 100),
    (4, 'Sacoche en cuir pour ordinateur portable', 'https://m.media-amazon.com/images/I/81tmGPWzEeL._AC_UY780_.jpg', 'Sacoche en cuir pour ordinateur portable jusqu à 15 pouce', 'Excellent état', 'Accessoires de mode', 70),
    (1, 'Couteau de chef japonais', 'https://cdn.couteaux-du-chef.fr/44929/couteau-chef-japonais-artisanal-kajiwara-kurouchi-18cm.jpg', 'Couteau de chef japonais en acier Damas, lame tranchante', 'Neuf', 'Cuisine', 150),
    (1, 'Parapluie pliant automatique', 'https://www.parapluie-de-france.com/images/articles/254/376832791137.jpg', 'Parapluie pliant automatique avec revêtement imperméable', 'Neuf', 'Accessoires', 20),
    (1, 'Skateboard professionnel', 'https://www.cdiscount.com/pdt2/5/7/0/1/700x700/auc9399426727570/rw/keenso-skateboard-skateboard-professionnel-a-quat.jpg', 'Skateboard professionnel avec plateau en érable et roulements à billes ABEC-7', 'Bon état', 'Sport et Loisirs', 60),
    (1, 'Microphone USB Blue Yeti', 'https://m.media-amazon.com/images/I/61HWZsE5YNL.jpg', 'Microphone USB Blue Yeti pour l enregistrement audio de haute qualité', 'Très bon état', 'Informatique', 80),
    (1, 'Trottinette', 'https://gyromax.fr/2519-thickbox_default/AR02982.jpg', 'UNE TRES BELLE TROTTINETTE', 'neuf', 'Sport et Loisirs', 100),
    (1, 'Velo', 'https://www.mygreensport.com/wp-content/uploads/2020/02/velo-de-ville-renaissance-6-vitesses-by-arcade-cycles-bleu-ocean-mat.jpg', 'Un vélo pas si beau', 'usage', 'Sport et Loisirs', 120),
    (2, 'Armoire à chaussettes', 'https://ae01.alicdn.com/kf/Sb253ca41fcaf4e8b94b105eab00d7c42J.jpg_640x640Q90.jpg_.webp', 'Ma bonne vieille armoire à chaussettes', 'presque_neuf', 'Mobilier', 70);

INSERT INTO posts (item_id, title, publication, description, address)
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

INSERT INTO favorite_posts(user_id, post_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (2, 10),
       (3, 11),
       (3, 12),
       (4, 9),
       (4, 8);