class Lesson7 {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Barsik", 10);
        cat[1] = new Cat("Murzik", 7);
        cat[2] = new Cat("Ryzhik", 5);
        Plate plate = new Plate(20);
        System.out.println("Three cats: " + cat[0].getName() + ", " + cat[1].getName() + ", " + cat[2].getName());
        System.out.println("Now in plate " + plate.getFood() + " of food");
        //cat.eat(plate);
        //System.out.println(plate);
        
            for(Cat i : cat) {
                if (i.getFed() == 0) {
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("cat " + i.getName() + " ate " + i.getAppetite() + " of food ");
                }
                i.setFed(i.getFed() - 1);
            }
            System.out.println("In plate " + plate.getFood() + " of food");
    }
}

class Cat {
    private String name;
    private int appetite;
    private int fed;
    
    String getName() {
        return name;
    }
    
    int getAppetite() {
        return appetite;
    }
    
    int getFed() {
        return fed;
    }
    
    void setFed(int fed) {
        this.fed = fed;
    }
    
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fed = 0;
    }
    
    void eat(Plate plate) {
        plate.decreaseFood(appetite);
    }
    
    //@Override
    //public String toString() {
        //return name + ", appetite: " + appetite;
    //}
}

class Plate {
    private int food;
    
    int getFood() {
        return food;
    }
    
    Plate(int food) {
        this.food = food;
    }
    
    
    void decreaseFood(int n) {
        this.food -= n;
    }
    
    public void increaseFood() {
        this.food += 20;
        System.out.println("20 of food added in plate");
    }
    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }
    
    //@Override
    //public String toString() {
        //return "Plate: " + food;
    //}
}