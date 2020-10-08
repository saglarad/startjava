public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 35;
		if(age > 20) {
			System.out.println("Вы взрослый");
		}

		char sex = 'F';
		if(sex == 'M') {
			System.out.println("Вы мужчина");
		} else {
			System.out.println("Вы женщина");
		}

		float height = 1.62f;
		if(height < 1.80) {
			System.out.println("Вы не высокий");
		} else {
			System.out.println("Вы высокий");
		}

		char name = 'S';
		if(name == 'M') {
			System.out.println("Ваше имя начинается с буквы М");
		} else if(name == 'I') {
			System.out.println("Ваше имя начинается с буквы И");
		} else {
			System.out.println("Ваше имя начинается с другой буквы");
		}