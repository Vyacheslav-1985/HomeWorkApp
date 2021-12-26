/**
 * Java 1. Homework 5
 * @Author Maksimov Vyacheslav
 * @version 26.12.2021
 *
 */

class Homework5 {
    
	public static void main(String[]args) {
        Employee[] employeeArray = new Employee[5];
		    employeeArray[0] = new Employee("Ivanov Ivan Ivanovich", "chef", "chef@ya.ru", "+79466987528", 100000, 52);
		    employeeArray[1] = new Employee("Petrov Petr Petrovich", "sous chef", "souschef@ya.ru", "+79466987543", 60000, 43);
		    employeeArray[2] = new Employee("Aleksandrov Aleksandr Aleksandrovich", "cook", "cook1@ya.ru", "+79466987537", 30000, 37);
		    employeeArray[3] = new Employee("Semenov Semen Semenovich", "cook", "cook2@ya.ru", "+79466987529", 30000, 29);
		    employeeArray[4] = new Employee("Sidorov Sidor Sidorovich", "cook", "cook3@ya.ru", "+79466987522", 30000, 22);
	        
		 
		for(Employee employee : employeeArray) 
            if (employee.getAge() > 40)		 	
		        System.out.println(employee);
		
	}
}	
	
	class Employee {
	    private String name;
        private String post;
        private String email;
	    private String phone;
	    private int salary;
	    private int age;
	
	public Employee (String name, String post, String email, String phone, int salary, int age) {
		this.name = name;
		this.post = post;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}	

    public int getAge() {
		return age;
	}	
    public String toString() {
		return(name + "\n-"
		        + post + "\n-"
                + email + "\n-"
				+ phone + "\n-"
				+ salary + "\n-"
				+ age);

    }
}	
