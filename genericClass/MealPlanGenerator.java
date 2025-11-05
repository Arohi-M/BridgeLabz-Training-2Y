interface MealPlan { String getPlan(); }
class VegetarianMeal implements MealPlan { public String getPlan(){return "Vegetarian Meal";} }
class VeganMeal implements MealPlan { public String getPlan(){return "Vegan Meal";} }
class Meal<T extends MealPlan> {
    T mealType;
    Meal(T mealType){this.mealType=mealType;}
    public void showMeal(){System.out.println(mealType.getPlan());}
}
public class MealPlanGenerator {
    public static <T extends MealPlan> void generateMealPlan(T meal){
        System.out.println("Generating: " + meal.getPlan());
    }
    public static void main(String[] args){
        Meal<VegetarianMeal> veg = new Meal<>(new VegetarianMeal());
        veg.showMeal();
        generateMealPlan(new VeganMeal());
    }
}