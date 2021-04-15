package FoodProcessor;

public class FoodProcessorOperatingSystem implements FoodProcessorOpenAPIIF, Runnable{
        private FoodProcessorLoadableIF currentFoodServer;
        public FoodProcessorOperatingSystem(){};

        void slice(){
            System.out.println("Slicing " + currentFoodServer.getFood() + ".");
        }
        void mix(){
            System.out.println("Mixing " + currentFoodServer.getFood() + ".");
        }
        void boil(){
            System.out.println("Boiling " + currentFoodServer.getFood() + ".");
        }
        void bake(){
            System.out.println("Baking " + currentFoodServer.getFood() + ".");
        }
        void fry(){
            System.out.println("Frying " + currentFoodServer.getFood() + ".");
        }
        void stir(){
            System.out.println("Stiring " + currentFoodServer.getFood() + ".");
        }
        float getTemperature(){
            return 15.0;
        }
        float getSoftness(){
            return 12.5;
        }

        public void setChosenFoodProcessor(){
            String compiledClassLocation = new File(".").getCanonicalPath();
            System.out.println(compiledClassLocation);
            URL[] classPath = new File(compiledClassLocation).toURI().toURL();
            ClassLoader classLoader = new URLClassLoader(classPath);

            Class c = null;
            switch (){

            }
        }
}