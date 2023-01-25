package test4.test4_2;

class Main {
  public static void main(String[] args) {
    test4.test4_2.Person person1 = new  test4.test4_2.Person();
    person1.hello();

    // person1のインスタンスフィールドnameに「Kate Jones」をセットしてください
    person1.name = "Kate Jones";

    // person1のインスタンスフィールドnameの値を出力してください
    System.out.println(person1.name);

    test4.test4_2.Person person2 = new  test4.test4_2.Person();
    person2.hello();

    // person2のインスタンスフィールドnameに「John Christopher Smith」をセットしてください
    person2.name = "John Christopher Smith";

    // person2のインスタンスフィールドnameの値を出力してください
    System.out.println(person2.name);
    
  }
}