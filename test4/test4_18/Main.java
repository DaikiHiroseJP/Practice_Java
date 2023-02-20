class Main {
  public static void main(String[] args) {
    // 仕事を「医者」にしてください
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();
    // 仕事を「教師」にしてください
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);
    person2.printData();
    System.out.println("----------------------");
    // person1の仕事を「獣医」に変更してください
    
    
    // 「person1の仕事を◯◯に変更しました」と出力されるようにしてください
    
    
    person1.printData();
  }
}