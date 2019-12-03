public class Person {
	String sex = "Мужской";
	String name = "Федор";
	int height = 180;
	double weight = 87.5;
	int age = 30;

	void move {
		System.out.println(+ name " прошел 15 метров");
	}

	boolean sitDown() {
		return true;
	}

	void running() {
		System.out.println(+ name " бежит 100 метров");
	}

	void speak() {
		System.out.println(+ name " говорит");
	}

	String useLearningSkill() {
		System.out.println(+ name " учит Java");
		return "Учу Java";
	}
}