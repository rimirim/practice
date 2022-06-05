class CascadeTest {

  String name;

  CascadeTest(this.name);

  void cascadeTest() {
    print("작업이 편리해짐");
  }

  void cascadeTest2() {
    print("test");
  }
}

cascade_grammer_test(){
  CascadeTest ct = CascadeTest(("아무개"))..cascadeTest()..cascadeTest2();
  // 자바에서는
  // cascadeTest.cadcadeTest();
  // cascadeTest.cadcadeTest2();

  print("이름: ${ct.name}");


}