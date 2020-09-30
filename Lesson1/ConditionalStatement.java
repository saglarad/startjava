public class ConditionalStatement {
	public static void main(String[] args) {
		int yourAge = 35;
		if(yourAge > 20) {
			System.out.println("Вы взрослый");
		}

		char sex = 'F';
		if(sex == 'M') {
			System.out.println ("Вы мужчина");
		} else {
			System.out.println("Вы женщина");
		}

		float height = 1.62f;
		if(height < 1.80) {
			System.out.println("Вы не высокий");
		} else {
			System.out.println("Вы высокий");
		}

		char yourName = 'S';
		if(yourName == 'M') {
			System.out.println("Ваше имя начинается с буквы М");
		} else if(yourName == 'I') {
			System.out.println("Ваше имя начинается с буквы И");
		} else {
			System.out.println("Ваше имя начинается с другой буквы");
		}




/*
		if(youMale = m) {
			System.out.println("То Вы мужчина");
		}

		if(youNotMale = f) {
			System.out.println("То Вы женщина");
		}

		if(yourHeight < 1.80) {
			System.out.println("Не высокий");
		} else {
			System.out.println("Высокий");
		}

		if(yourNameStartsWithLetterM == 'М') {
			System.out.println("Ваше имя М");
		} else if(yourNameStartsWithLetterI == 'И') {
			System.out.println("Ваше имя И");
		}
		else {
			System.out.println("Вас зовут по другому");
		}*/
	}
}