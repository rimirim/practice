class Dog2 {
  String name = "멍뭉이";
  int age = 5;
  String color = "white";
  int thirsty = 100;

  // 디폴트 생성자
  Dog2(this.name, this.age, this.color, this.thirsty) {}
}

print_dog2(){
  Dog2 d1 = Dog2("토토짱", 3, "black", 70);
  print("이름: ${d1.name}");
  print("나이: ${d1.age}");
  print("색상: ${d1.color}");
  print("목마름 지수: ${d1.thirsty}");
}