package com.cbiel.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<FoodData> myFoodList;
    FoodData mFoodData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycleView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(HomePage.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myFoodList = new ArrayList<>();

        mFoodData = new FoodData("test1","d","1",R.drawable.imageone);
        //myFoodList.add(mFoodData);


        mFoodData = new FoodData("Buffalo Chicken Pizza","Ingredients: 1 tube (13.8 ounces) refrigerated pizza crust, 1 cup Buffalo wing sauce divided, 1-1/2 cups shredded cheddar cheese, 1-1/2 cups part-skim shredded mozzarella cheese, 2 pounds boneless skinless chicken breasts, cubed, 1/2 teaspoon each garlic salt, pepper and chili powder, 2 tablespoons butter, 1/2 teaspoon dried oregano, Celery sticks and blue cheese salad dressing\n" +
                System.getProperty ("line.separator") +
                System.getProperty ("line.separator") +
                "Step 1: Unroll pizza crust into a lightly greased 15x10x1-in. baking pan; flatten dough and build up edges slightly. Bake at 400° for 7 minutes. Brush dough with 3 tablespoons Buffalo wing sauce. Combine cheddar and mozzarella cheeses; sprinkle a third over the crust. Set aside.\n"
                + System.getProperty ("line.separator") +
                "Step 2: In a large skillet, cook the chicken, garlic salt, pepper and chili powder in butter until chicken is no longer pink. Add the remaining wing sauce; cook and stir over medium heat 5 minutes longer.\n" +
                 System.getProperty ("line.separator") +
                "Step 3: Spoon over pizza. Sprinkle with oregano and remaining cheese.\n"
                + System.getProperty ("line.separator") +
                "Step 4: Bake until crust is golden brown and cheese is melted, 18-20 minutes. Serve with celery and blue cheese dressing.\n"
                + System.getProperty ("line.separator") +
                "Step 5: Freeze option: Bake pizza crust as directed; cool. Top with all the ingredients as directed and securely wrap and freeze unbaked pizza. To use, unwrap pizza; bake as directed, increasing time as necessary.\n"
                ,"40 minutes",R.drawable.imagetwo);
        myFoodList.add(mFoodData);


        mFoodData = new FoodData("Smash Burger","Ingredients\n"+
                System.getProperty ("line.separator") +
                "1/4 cup mayonnaise\n" +
                "4 teaspoons yellow mustard\n" +
                "12 dill pickle chips, plus 1 teaspoon brine\n" +
                "1/8 teaspoon onion powder\n" +
                "1/8 teaspoon garlic powder\n" +
                "Pinch of smoked paprika\n" +
                "Kosher salt and freshly ground pepper\n" +
                "1 1/4 pounds ground beef (80% lean)\n" +
                "Unsalted butter, softened, for brushing\n" +
                "4 bakery hamburger buns, split\n" +
                "4 slices American cheese\n" +
                "Ketchup, for serving\n" +
                "8 thin slices tomato\n" +
                "4 thin slices red onion\n" +
                "4 lettuce leaves\n" +
                System.getProperty ("line.separator") +
                "Heat a griddle or large cast-iron skillet over medium heat for at least 10 minutes. Meanwhile, combine the mayonnaise, mustard and pickle brine in a small bowl. Combine the onion powder, garlic powder, paprika, 1/2 teaspoon salt and 1/4 teaspoon pepper in a separate small bowl. Set aside.\n" +
                System.getProperty ("line.separator") +
                "Loosely form the beef into 4 balls; set aside. Working in batches, lightly brush the griddle with butter and toast the buns cut-side down until lightly browned, 1 to 2 minutes. Transfer to a plate.\n" +
                System.getProperty ("line.separator") +
                "Brush the griddle with more butter and add 1 ball of beef. Press firmly with 2 large crisscrossed metal spatulas for exactly 10 seconds, then gently remove the spatulas. Sprinkle the patties with some of the seasoning mixture and continue cooking, undisturbed, until well browned, 1 1/2to 2 minutes. (Start cooking another burger at this point.) Flip the patty, sprinkle with more of the seasoning mixture and top with 1 cheese slice. Continue cooking until the cheese is melted around the edges and the bottom of the burger is browned, about 1 more minute. Repeat with the remaining beef.\n" +
                System.getProperty ("line.separator") +
                "Spread the mayonnaise mixture on the bun tops and add some ketchup. Serve the patties on the buns with the pickles, tomato, red onion and lettuce.\n" +
                System.getProperty ("line.separator") +
                System.getProperty ("line.separator") +
                "Link to recipe site: https://www.foodnetwork.com/recipes/food-network-kitchen/smashburger-style-burgers-3721349","30 Minutes",R.drawable.imagethree);
        myFoodList.add(mFoodData);


        mFoodData = new FoodData("Chili","2 pounds lean ground beef\n" +
                "1 onion diced\n" +
                "1 jalapeno seeded and finely diced\n" +
                "4 cloves garlic minced\n" +
                "2 ½ tablespoons chili powder divided (or to taste)\n" +
                "1 teaspoon cumin\n" +
                "1 green bell pepper seeded and diced\n" +
                "14 ½ ounces crushed tomatoes canned\n" +
                "19 ounces kidney beans canned, drained & rinsed\n" +
                "14 ½ ounces diced tomatoes with juice\n" +
                "1 ½ cups beef broth\n" +
                "1 cup beer\n" +
                "1 tablespoon tomato paste\n" +
                "1 tablespoon brown sugar optional\n" +
                "salt and pepper to taste\n" +
                System.getProperty ("line.separator") +
                "Instructions\n" +
                System.getProperty ("line.separator") +
                " Combine ground beef and 1 ½ tablespoons chili powder.\n" +
                System.getProperty ("line.separator") +
                "In a large pot, brown ground beef, onion, jalapeno, and garlic. Drain any fat.\n" +
                System.getProperty ("line.separator") +
                "Add in remaining ingredients and bring to a boil. Reduce heat and simmer uncovered 45-60 minutes or until chili has reached desired thickness.\n" +
                System.getProperty ("line.separator") +
                "Top with cheddar cheese, green onions, cilantro or other favorite toppings.\n" +
                System.getProperty ("line.separator") +
                System.getProperty ("line.separator") +
                "Link to recipe: https://www.spendwithpennies.com/the-best-chili-recipe/","1 hr 5 min"
                ,R.drawable.imagefour);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Homemade Mac and Cheese","Ingredients\n" +
                "1 lb. dried elbow pasta\n" +
                "1/2 cup unsalted butter\n" +
                "1/2 cup all purpose flour\n" +
                "1 1/2 cups whole milk\n" +
                "2 1/2 cups half and half\n" +
                "4 cups grated medium sharp cheddar cheese divided (measured after grating)\n" +
                "2 cups grated Gruyere cheese divided (measured after grating)\n" +
                "1/2 Tbsp. salt\n" +
                "1/2 tsp. black pepper\n" +
                "1/4 tsp. paprika\n"+
                System.getProperty ("line.separator") +
                System.getProperty ("line.separator") +
                "Instructions\n" +
                System.getProperty ("line.separator") +
                "Preheat oven to 325 degrees F and grease a 3 qt baking dish (9x13\").  Set aside.\n" +
                System.getProperty ("line.separator") +
                "Bring a large pot of salted water to a boil.  When boiling, add dried pasta and cook 1 minute less than the package directs for al dente.  Drain and drizzle with a little bit of olive oil to keep from sticking.\n" +
                System.getProperty ("line.separator") +
                "While water is coming up to a boil, grate cheeses and toss together to mix, then divide into three piles.  Approximately 3 cups for the sauce, 1 1/2 cups for the inner layer, and 1 1/2 cups for the topping.\n" +
                System.getProperty ("line.separator") +
                "Melt butter in a large saucepan over MED heat.  Sprinkle in flour and whisk to combine.  Mixture will look like very wet sand.  Cook for approximately 1 minute, whisking often.  Slowly pour in about 2 cups or so of the milk/half and half, while whisking constantly, until smooth.  Slowly pour in the remaining milk/half and half, while whisking constantly, until combined and smooth.\n" +
                System.getProperty ("line.separator") +
                "Continue to heat over MED heat, whisking very often, until thickened to a very thick consistency.  It should almost be the consistency of a semi thinned out condensed soup.\n" +
                System.getProperty ("line.separator") +
                "Remove from the heat and stir in spices and 1 1/2 cups of the cheeses, stirring to melt and combine.  Stir in another 1 1/2 cups of cheese, and stir until completely melted and smooth.\n" +
                System.getProperty ("line.separator") +
                "In a large mixing bowl, combine drained pasta with cheese sauce, stirring to combine fully.  Pour half of the pasta mixture into the prepared baking dish.  Top with 1 1/2 cups of grated cheeses, then top that with the remaining pasta mixture.\n" +
                System.getProperty ("line.separator") +
                "Sprinkle the top with the last 1 1/2 cups of cheese and bake for 15 minutes, until cheesy is bubbly and lightly golden brown.  "
                ,"35 Minutes",R.drawable.imagefive);
        myFoodList.add(mFoodData);

        mFoodData = new FoodData("Spaghetti Salad","Ingredients\n" +
                "1 pound spaghetti\n" +
                "2 cups grape tomatoes - halved\n" +
                "2 cups cucumbers - sliced and halved\n" +
                "1 cup pepperoni slices - halved\n" +
                "3/4 cup red onion - minced\n" +
                "3/4 cup Parmesan cheese - grated\n" +
                "2 tablespoons fresh parsley - chopped\n" +
                "Italian Vinaigrette Dressing - about 1 1/4 cup\n"+
                System.getProperty ("line.separator") +
                "Italian Vinaigrette Dressing\n" +
                "3/4  cup olive oil\n" +
                "1/4 cup red wine vinegar\n" +
                "1/4 cup fresh lemon juice\n" +
                "1 teaspoon garlic - minced\n" +
                "1/2 teaspoon onion powder\n" +
                "1/2 teaspoon dried oregano\n" +
                "1/2 teaspoon dried basil\n" +
                "1/4 teaspoon pepper\n" +
                "1 teaspoon salt\n" +
                System.getProperty ("line.separator") +
                "Instructions\n" +
                System.getProperty ("line.separator") +
                "Cook spaghetti pasta according to package directions. Drain and rinse.\n" +
                System.getProperty ("line.separator") +
                "To a large bowl add spaghetti, tomatoes, cucumbers, onion, and pepperoni. Drizzle over dressing and toss all ingredients together. Sprinkle on Parmesan cheese and parsley.\n" +
                System.getProperty ("line.separator") +
                "Serve immediately. **Can be made a day ahead of serving. Store in an airtight container in fridge for up to 3 days.\n" +
                System.getProperty ("line.separator") +
                "Italian Vinaigrette Dressing\n" +
                System.getProperty ("line.separator") +
                "Add olive oil, vinegar, lemon juice, garlic, oregano, basil, pepper and salt to a small bowl or jar. Mix together or shake to incorporate all ingredients.\n" +
                System.getProperty ("line.separator") +
                System.getProperty ("line.separator") +
                "Link to recipe site: https://www.asouthernsoul.com/spaghetti-salad/","15 Minutes",R.drawable.imagesix);
        myFoodList.add(mFoodData);

        MyAdapter myAdapter = new MyAdapter(HomePage.this,myFoodList);
        mRecyclerView.setAdapter(myAdapter);
    }
}