/**
 * Java 1. Homework 7
 * @Author Maksimov Vyacheslav
 * @version 10.01.2022
 *
 */

class Homework7 {
	public static void main(String[] args) {
		Cat[] cats = {
			new Cat("Barsik", 15), new Cat("Murzik", 10), new Cat("Vasily", 20)
		};
		Plate plate = new Plate(50, 30);
		System.out.println(plate);
		
		for (Cat cat : cats) {
			cat.eat(plate);
			System.out.println(cat);
		}
		System.out.println(plate);
		plate.add(40);
		System.out.println(plate);
		
		for (Cat cat : cats) {
			cat.setFullness(false);
			cat.eat(plate);
			System.out.println(cat);
		}
	    System.out.println(plate);
	}
}

class Cat {
	private String name;
	private int appetite;
	private Boolean fullness;
	
	Cat(String name, int appetite) {
		this.name = name;
		this.appetite = appetite;
		fullness = false;
	}
	
	void setFullness(Boolean status) {
		fullness = status;
	}
	
	void eat(Plate plate) {
		if (!fullness) {
			fullness = plate.decreaseFood(appetite);
		}
	}

    @Override
	public String toString() {
	    return "{name=" + name + ", appetite=" +
		appetite + ", fullness=" + "}";		
	}
}

class Plate {
	private int volume;
	private int food;
	
	Plate(int volume, int food) {
		this.volume = volume;
		this.food = food;
	}
    
	Boolean decreaseFood (int portion){
	    if (food < portion) {
			return false;
		}
		food -= portion;
		return true;
    }
    
	void add(int food) {
		if (this.food + food <= volume) {
			this.food += food;
		}
	}

    @Override
	public String toString() {
		return "plate: " + food;
	}
}
