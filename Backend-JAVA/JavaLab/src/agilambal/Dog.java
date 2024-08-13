package agilambal;

public class Dog {
		String name;
		String breed;
		public Dog (String name,String breed) {
			this.name=name;
			this.breed=breed;
		}
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name=name;
		}
		public String getbreed() {
			return breed;
		}
		public void setbreed(String breed) {
			this.breed=breed;
		}
		void display() {
			System.out.println("Dog Name:"+name);
			System.out.println("Dog Breed:"+breed);
		}
	public static void main(String[] args) {
		Dog dog1 =  new Dog ("Fathi","golden retriver");
		Dog dog2 = new Dog ("Pooja","labrardor");
		dog1.display();
		dog2.display();
		
		dog1.setname("Dhivya");
        dog2.setname("Priya");
        dog1.setbreed("Labrador");
        dog2.setbreed("American BullDog");
        System.out.println("Updated Dog Names & Breeds:");
        System.out.println("Dog1: " + dog1.getname() + ", Breed of Dog 1: " + dog1.getbreed());
        System.out.println("Dog2: " + dog2.getname() + ", Breed of Dog 1: " + dog2.getbreed());
	}
}
