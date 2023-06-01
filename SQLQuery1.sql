use RecipeOrganize
go
drop database RecipeOrganize
create database RecipeOrganize
CREATE TABLE account (
 
  userID INT IDENTITY(1,1) PRIMARY KEY,
  userName VARCHAR(30) UNIQUE NOT NULL,
  password VARCHAR(30) NOT NULL,
  fullName VARCHAR(30) NOT NULL,
  phone VARCHAR(12) NULL,
  status INT NOT NULL,
  role bit NOT NULL,
  token NVARCHAR(50) NOT NULL
);


CREATE TABLE recipe (
  recipeID INT PRIMARY KEY NOT NULL,
  recipeName VARCHAR(50) NULL,
  caloRecipe VARCHAR(50) NULL,
  description TEXT NULL,
  imgUrl VARCHAR(50) NULL,
  avgRating INT NOT NULL,
  difficulty VARCHAR(50) NULL
);

CREATE TABLE favorite (
  favoriteID INT PRIMARY KEY NOT NULL,
  userID INT,
  recipeID INT,
  FOREIGN KEY (userID) REFERENCES account(userID),
  FOREIGN KEY (recipeID) REFERENCES recipe(recipeID)
);

CREATE TABLE mealPlan (
  planID INT PRIMARY KEY NOT NULL,
  planDate DATE NULL,
  userID INT,
  recipeID INT,
  FOREIGN KEY (userID) REFERENCES account(userID),
  FOREIGN KEY (recipeID) REFERENCES recipe(recipeID)
);

CREATE TABLE feedback (
  feedbackID INT PRIMARY KEY NOT NULL,
  rating INT NOT NULL,
  comment TEXT NULL,
  feedbackDate DATE NULL,
  userID INT,
  recipeID INT,
  FOREIGN KEY (userID) REFERENCES account(userID),
  FOREIGN KEY (recipeID) REFERENCES recipe(recipeID)
);

CREATE TABLE ingredient (
  ingredientID INT PRIMARY KEY NOT NULL,
  ingredientName VARCHAR(50) NULL,
  caloIn VARCHAR(50) NULL,
  quantity VARCHAR(50) NULL,
  unit VARCHAR(50) NULL,
  recipeID INT,
  FOREIGN KEY (recipeID) REFERENCES recipe(recipeID)
);

CREATE TABLE category (
  categoryID INT PRIMARY KEY,
  categoryName VARCHAR(100) NOT NULL,
  recipeID INT,
  FOREIGN KEY (recipeID) REFERENCES recipe(recipeID)
);
-- Chèn dữ liệu vào bảng account
INSERT INTO account (userName, password, fullName, phone, status, role, token)
VALUES ('admin', '123', 'John Doe', '1234567890', 1, 1, 'token123'),
       ('jane456', 'password456', 'Jane Smith', '9876543210', 1, 0, 'token456'),
	   ('mary789', 'password789', 'Mary Johnson', '5555555555', 1, 0, 'token789');

-- Chèn dữ liệu vào bảng recipe
INSERT INTO recipe (recipeID, recipeName, caloRecipe, description, imgUrl, avgRating, difficulty)
VALUES (1, 'Chicken Stir-Fry', '500 calories', 'Delicious stir-fried chicken with vegetables.', 'img/recipe/image1.jpg',3,'Easy'),
       (2, 'Spaghetti Bolognese', '600 calories', 'Classic Italian pasta dish with meat sauce.', 'img/recipe/image2.jpg',4, 'Medium'),
	   (3, 'Greek Salad', '300 calories', 'Refreshing salad with tomatoes, cucumbers, and feta cheese.', 'img/recipe/image3.jpg',5, 'Easy'),
	   (4, 'Vegetable Stir-Fry', '400 calories', 'Healthy stir-fried vegetables with tofu.', 'img/recipe/image4.jpg',3, 'Easy'),
	   (5, 'Quinoa Salad', '350 calories', 'Healthy and nutritious salad with quinoa, vegetables, and dressing.', 'img/recipe/image5.jpg',4, 'Easy'),
	    (6, 'Chocolate Brownies', '400 calories', 'Rich and decadent chocolate brownies.', 'img/recipe/image6.jpg',5,'Medium'),
		(7, 'Vanilla Cupcakes', '250 calories', 'Classic vanilla cupcakes with buttercream frosting.', 'img/recipe/image7.jpg',3, 'Easy'),
		(8, 'Vietnamese fried spring rolls', '153 calories', 'A dish that is crispy on the outside, but has a rich and delicious filling on the inside.', 'img/recipe/image8.jpg',5, 'Medium'),
		(9, 'pho', '350 calories', 'Pho consists of a bowl of rich broth and the aroma of spices, accompanied by soft noodles and thinly sliced ​​beef (or chicken) that is cooked to medium and golden brown.', 'img/recipe/image9.jpg',5, 'Hard');
-- Chèn dữ liệu vào bảng favorite
INSERT INTO favorite (favoriteID, userID, recipeID)
VALUES (1, 1, 1),
       (2, 2, 2),
	   (3, 3, 3),
	   (4, 1, 4),
	   (5, 2, 5),
	   (6, 1, 6),
	   (7, 2, 7);
-- Chèn dữ liệu vào bảng mealPlan
INSERT INTO mealPlan (planID, planDate, userID, recipeID)
VALUES (1, '2023-05-26', 1, 1),
        (2, '2023-05-27', 2, 2),
		(3, '2023-05-28', 3, 3),
		(4, '2023-05-29', 1, 4),
		(5, '2023-05-30', 2, 5),
		(6, '2023-06-01', 1, 6),
		(7, '2023-06-02', 2, 7);
-- Chèn dữ liệu vào bảng feedback
INSERT INTO feedback (feedbackID, rating, comment, feedbackDate, userID, recipeID)
VALUES (1, 5, 'Great recipe!', '2023-05-26', 1, 1),
       (2, 4, 'Tasty recipe!', '2023-05-27', 2, 2),
	   (3, 5, 'Delicious and healthy!', '2023-05-28', 3, 3),
	   (4, 4, 'Delicious vegetarian dish!', '2023-05-29', 1, 4),
	   (5, 5, 'Super tasty and healthy salad!', '2023-05-30', 2, 5),
	   (6, 4, 'Delicious chocolatey treat!', '2023-06-01', 1, 6),
	   (7, 5, 'Moist and delicious cupcakes!', '2023-06-02', 2, 7);
-- Chèn dữ liệu vào bảng ingredient
INSERT INTO ingredient (ingredientID, ingredientName, caloIn, quantity, unit, recipeID)
VALUES (1, 'Chicken', '100 calories', '200g', 'grams', 1),
       (2, 'Ground Beef', '200 calories', '250g', 'grams', 2),
	   (3, 'Tomato', '20 calories', '2', 'pieces', 3),
	   (4, 'Tofu', '150 calories', '200g', 'grams', 4),
	   (5, 'Quinoa', '150 calories', '1 cup', 'cup', 5),
	   (6, 'Chocolate', '200 calories', '200g', 'grams', 6),
	   (7, 'Flour', '100 calories', '1 cup', 'cup', 7);
-- Chèn dữ liệu vào bảng category
INSERT INTO category (categoryID, categoryName, recipeID)
VALUES (1, 'Main Dish', 1),
       (2, 'Pasta', 2),
	   (3, 'Salad', 3),
	   (4, 'Vegetarian', 4),
	   (6, 'Dessert', 6),
	   (7, 'Bakery', 7);