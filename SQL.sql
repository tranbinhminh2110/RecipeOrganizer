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
  token NVARCHAR(50) NOT NULL,
  email VARCHAR(100) UNIQUE NOT NULL,
  image_path VARCHAR(255)
);

CREATE TABLE recipe (
  recipeID INT PRIMARY KEY NOT NULL,
  recipeName VARCHAR(50) NOT NULL,
  caloRecipe INT NULL,
  description TEXT NULL,
  imgUrl VARCHAR(50) NULL,
  avgRating INT NOT NULL,
  difficulty VARCHAR(50) NULL,
  ingredient_table TEXT NULL
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
  feedbackID INT IDENTITY(1,1) PRIMARY KEY,
  rating INT  NULL,
  comment TEXT NULL,
  feedbackDate DATETIME NULL,
  userName VARCHAR(30)NOT NULL,
  recipeID INT,
  FOREIGN KEY (userName) REFERENCES account(userName),
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
INSERT INTO account (userName, password, fullName, phone, status, role, token, email, image_path)
VALUES ('admin', '123', 'John Doe', '1234567890', 1, 1, 'token123', 'abc@gmail.com', 'C:\Users\MSI BH\OneDrive\Hình ảnh\Browser Pictures\default-user.png'),
       ('jane456', '456', 'Jane Smith', '9876543210', 0, 0, 'token456', 'abcd@gmail.com', 'C:\Users\MSI BH\OneDrive\Hình ảnh\Browser Pictures\default-user.png'),
	   ('mary789', '789', 'Mary Johnson', '5555555555', 1, 0, 'token789', 'abcde@gmail.com', 'C:\Users\MSI BH\OneDrive\Hình ảnh\Browser Pictures\default-user.png');

-- Chèn dữ liệu vào bảng recipe
INSERT INTO recipe (recipeID, recipeName, caloRecipe, description, imgUrl, avgRating, difficulty, ingredient_table)
VALUES (1, 'Chicken Stir-Fry', 500, 'Delicious stir-fried chicken with vegetables.', 'img/recipe/image1.jpg',3,'Easy', '4 cups water|2 cups white rice|⅔ cup soy sauce|¼ cup brown sugar|1 tablespoon cornstarch|1 tablespoon minced fresh ginger|1 tablespoon minced garlic|¼ teaspoon red pepper flakes|V3 skinless, boneless chicken breast halves, thinly sliced|2 tablespoons sesame oil, divided|1 head broccoli, broken into florets|V1 onion, cut into large chunks|1 cup sliced carrots|V1 (8 ounce) can sliced water chestnuts, drained|1 green bell pepper, cut into matchsticks'),
       (2, 'Spaghetti Bolognese', 600, 'Classic Italian pasta dish with meat sauce.', 'img/recipe/image2.jpg',4, 'Medium', '4 cups water|2 cups white rice|⅔ cup soy sauce|¼ cup brown sugar|1 tablespoon cornstarch|1 tablespoon minced fresh ginger|1 tablespoon minced garlic|¼ teaspoon red pepper flakes|V3 skinless, boneless chicken breast halves, thinly sliced|2 tablespoons sesame oil, divided|1 head broccoli, broken into florets|V1 onion, cut into large chunks|1 cup sliced carrots|V1 (8 ounce) can sliced water chestnuts, drained|1 green bell pepper, cut into matchsticks'),
	   (3, 'Greek Salad', 300, 'Refreshing salad with tomatoes, cucumbers, and feta cheese.', 'img/recipe/image3.jpg',5, 'Easy', '4 cups water|2 cups white rice|⅔ cup soy sauce|¼ cup brown sugar|1 tablespoon cornstarch|1 tablespoon minced fresh ginger|1 tablespoon minced garlic|¼ teaspoon red pepper flakes|V3 skinless, boneless chicken breast halves, thinly sliced|2 tablespoons sesame oil, divided|1 head broccoli, broken into florets|V1 onion, cut into large chunks|1 cup sliced carrots|V1 (8 ounce) can sliced water chestnuts, drained|1 green bell pepper, cut into matchsticks'),
	   (4, 'Vegetable Stir-Fry', 400, 'Healthy stir-fried vegetables with tofu.', 'img/recipe/image4.jpg',3, 'Easy', '4 cups water|2 cups white rice|⅔ cup soy sauce|¼ cup brown sugar|1 tablespoon cornstarch|1 tablespoon minced fresh ginger|1 tablespoon minced garlic|¼ teaspoon red pepper flakes|V3 skinless, boneless chicken breast halves, thinly sliced|2 tablespoons sesame oil, divided|1 head broccoli, broken into florets|V1 onion, cut into large chunks|1 cup sliced carrots|V1 (8 ounce) can sliced water chestnuts, drained|1 green bell pepper, cut into matchsticks'),
	   (5, 'Quinoa Salad', 350, 'Healthy and nutritious salad with quinoa, vegetables, and dressing.', 'img/recipe/image5.jpg',4, 'Easy', '4 cups water|2 cups white rice|⅔ cup soy sauce|¼ cup brown sugar|1 tablespoon cornstarch|1 tablespoon minced fresh ginger|1 tablespoon minced garlic|¼ teaspoon red pepper flakes|V3 skinless, boneless chicken breast halves, thinly sliced|2 tablespoons sesame oil, divided|1 head broccoli, broken into florets|V1 onion, cut into large chunks|1 cup sliced carrots|V1 (8 ounce) can sliced water chestnuts, drained|1 green bell pepper, cut into matchsticks'),
	   (6, 'Chocolate Brownies', 400 , 'Rich and decadent chocolate brownies.', 'img/recipe/image6.jpg',5,'Medium',''),
		(7, 'Vanilla Cupcakes', 250 , 'Classic vanilla cupcakes with buttercream frosting.', 'img/recipe/image7.jpg',3, 'Easy',''),
		(8, 'Vietnamese fried spring rolls', 153, 'A dish that is crispy on the outside, but has a rich and delicious filling on the inside.', 'img/recipe/image8.jpg',5, 'Medium','');
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
INSERT INTO feedback ( rating, comment, feedbackDate, userName, recipeID)
VALUES ( 5, 'Great recipe!', '2023-05-26 10:30:04', 'admin', 1),
       ( 4, 'Tasty recipe!', '2023-05-27 10:35:00', 'mary789', 2),
	   ( 5, 'Delicious and healthy!', '2023-05-28 12:30:00', 'mary789', 3),
	   ( 4, 'Delicious vegetarian dish!', '2023-05-29 9:34:02', 'mary789', 4),
	   ( 5, 'Super tasty and healthy salad!', '2023-05-30 11:30:20', 'admin', 5),
	   ( 4, 'Delicious chocolatey treat!', '2023-06-01 10:30:30', 'admin', 6),
	   ( 5, 'Moist and delicious cupcakes!', '2023-06-02 11:00:06', 'mary789', 7);
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
	   (4, 'Vegetarian', 5),
	   (5, 'Dessert', 6),
	   (6, 'Bakery', 7);