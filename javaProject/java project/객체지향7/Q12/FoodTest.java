package Q12;

public class FoodTest {

	public static void main(String[] args) {
		Melon oneMelon = new Melon(649.4,9900, 1.7, "전남 고창");
		System.out.println(oneMelon);
		System.out.println("자, 이 멜론으로 말하자면 "+oneMelon.getPlace()+"에서 온 머스크 멜론입니다!");
		System.out.println("무게는 "+oneMelon.getWeight()+"인데 가격이 무려 "+oneMelon.getPrice()+"원! 단돈 "+oneMelon.getPrice()+"이면 멜론을 먹을 수 있습니다!");
		System.out.println("게다가 칼로리도 겨우 "+oneMelon.getCalories()+"kcal밖에 안하니 다이어트 음식으로 딱입니다!");
	}

}
