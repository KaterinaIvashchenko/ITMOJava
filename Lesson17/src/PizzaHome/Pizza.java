package PizzaHome;

/**
 * Класс Пицца с универсальным билдером
 */

public class Pizza {

    private final int flour;
    private final int eggs;
    private final int tomatoes;
    private final int mushrooms;
    private final int chicken;
    private final String yummy;

    @Override
    public String toString() {
        return "Рецепт пиццы " + yummy + ":\nКоличество муки - " + flour  + "\nКоличество яиц - " + eggs + "\nКоличество помидоров - " + tomatoes + "\nКоличество грибов - " + mushrooms + "\nКоличество мяса куры - " + chicken;
    }


    public static class Cook {

        private final int flour;
        private int eggs = 0;
        private int tomatoes = 0;
        private int mushrooms = 0;
        private int chicken = 0;
        private String yummy;

        public Cook(int flour) {
            this.flour = flour;
        }

        public Cook eggs(int val) {
            eggs = val;
            return this;
        }

        public Cook tomatoes(int val) {
            tomatoes = val;
            return this;
        }

        public Cook mushrooms(int val) {
            mushrooms = val;
            return this;
        }

        public Cook chicken(int val) {
            chicken = val;
            return this;
        }

        public Cook yummy (String val) {
            yummy = val;
            return this;
        }

        public Pizza cook() {
            return new Pizza(this);
        }
    }

    private Pizza(Cook cook) {
        flour = cook.flour;
        eggs = cook.eggs;
        tomatoes = cook.tomatoes;
        mushrooms = cook.mushrooms;
        chicken = cook.chicken;
        yummy = cook.yummy;
    }
}
