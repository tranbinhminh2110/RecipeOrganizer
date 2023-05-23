use RecipeOrganize
go
drop database RecipeOrganize
create database RecipeOrganize
CREATE TABLE account(
    [planID]  [int],
  
    [userID] INT PRIMARY KEY  NOT NULL,
	[userName] [varchar](30) NULL,
	[password] [varchar](30) NULL,
	[fullName] [varchar](30) NULL,
	[phone] [varchar](12) NULL,
	[stastus] [int] NULL,
	[role] [int] NULL,
	[token] [nvarchar](50) NULL,
	);

CREATE TABLE recipe (
    [recipeID]  INT PRIMARY KEY NOT NULL,
	[recipeName] [varchar](50) NULL,
	[caloRecipe] [varchar](50) NULL,
	[decription] TEXT NULL,
	[imgUrl] [varchar](50) NULL,
	[difficulty] [varchar](50) NULL,
  
);
CREATE TABLE favorite (
    [favoriteID]  INT PRIMARY KEY NOT NULL,
	userID int ,
	recipeID int ,
		FOREIGN KEY (userID) REFERENCES account(userID),
	FOREIGN KEY (recipeID) REFERENCES recipe(recipeID),
  
);
CREATE TABLE mealPlan (
    [planID]  INT PRIMARY KEY NOT NULL,
	[planDate] [date] NULL,
	userID int ,
	recipeID int ,
	FOREIGN KEY (userID) REFERENCES account(userID),
	FOREIGN KEY (recipeID) REFERENCES recipe(recipeID),
);
CREATE TABLE feedback (
    [feedbackID]  INT PRIMARY KEY NOT NULL,
	[rating] int NOT NULL,
	[comment] TEXT NULL,
	[feedbackDate] [date] NULL,
	userID int ,
	recipeID int ,
	FOREIGN KEY (userID) REFERENCES account(userID),
	FOREIGN KEY (recipeID) REFERENCES recipe(recipeID),

  
);

CREATE TABLE ingredient (
  ingredientID INT PRIMARY KEY NOT NULL,
  ingredientName [varchar](50) NULL,
  caloIn[varchar](50)NULL,
  quantity[varchar](50)NULL,
  unit[varchar](50)NULL,
	recipeID int ,
  FOREIGN KEY (recipeID) REFERENCES recipe(recipeID),
  )

CREATE TABLE category (
  catecoryID INT PRIMARY KEY ,
  categoriName VARCHAR(100) NOT NULL,
	recipeID int ,
  FOREIGN KEY (recipeID) REFERENCES recipe(recipeID),
);
