
class Person {
    String name;
    int age;

    // 생성자 오버로딩 1
    public Person(String name) {
        this.name = name;
        this.age = 17;
    }

    // 생성자 오버로딩 2
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}


class Student extends Person {
    int score;

    // 부모 클래스의 생성자 호출
    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    // 메서드 오버로딩 1
    public void showResult() {
        System.out.println("점수: " + score);
    }

    // 메서드 오버로딩 2
    public void showResult(int bonus) {
        System.out.println("보너스 포함 점수: " + (score + bonus));
    }

    // 메서드 오버로딩 3
    public void showResult(int bonus, int penalty) {
        System.out.println(
            "보너스와 감점 적용 점수: " + (score + bonus - penalty)
        );
    }
}


public class OOPReview {
    public static void main(String[] args) {

        // 생성자 오버로딩 사용
        Person person1 = new Person("민수");
        Person person2 = new Person("지우", 16);

        System.out.println("=== Person 정보 ===");
        person1.showInfo();

        System.out.println();
        person2.showInfo();

        // 상속과 super() 사용
        Student student1 = new Student("현우", 17, 85);

        System.out.println("\n=== Student 정보 ===");
        student1.showInfo();
        student1.showResult();

        // 메서드 오버로딩 사용
        student1.showResult(5);
        student1.showResult(10, 3);
    }
}


/*

    오늘 배운 내용


1. this
현재 객체의 필드나 메서드를 가리킨다.

예:
this.name = name;

왼쪽의 this.name은 객체의 필드이고,
오른쪽의 name은 생성자에 전달된 매개변수이다.
매개변수의 값을 객체의 필드에 저장하는 코드이다.


2. super()
자식 클래스에서 부모 클래스의 생성자를 호출한다.

예:
super(name, age);

Student 객체를 만들 때 전달받은 이름과 나이를
부모 클래스인 Person의 생성자에 전달한다.

super()는 자식 생성자의 첫 번째 문장에 작성해야 한다.


3. 생성자 오버로딩
같은 클래스에서 매개변수 구성이 다른 생성자를
여러 개 만드는 것이다.

예:
Person(String name)
Person(String name, int age)

객체를 생성할 때 전달한 값에 맞는 생성자가 실행된다.


4. 메서드 오버로딩
같은 이름의 메서드를 매개변수 구성을 다르게 하여
여러 개 만드는 것이다.

예:
showResult()
showResult(int bonus)
showResult(int bonus, int penalty)

전달하는 매개변수에 따라 실행할 메서드가 결정된다.




    네 가지 개념의 차이


this
- 현재 객체의 필드나 메서드를 가리킨다.

super()
- 부모 클래스의 생성자를 호출한다.

생성자 오버로딩
- 객체를 초기화하는 방법을 다양하게 만든다.

메서드 오버로딩
- 같은 이름의 메서드를 여러 매개변수 형태로 만든다.




    복습하면서 알게 된 점


this와 super()는 역할이 다르다.
this.name은 현재 객체의 name 필드를 가리키지만,
super(name, age)는 부모 클래스의 생성자를 호출한다.

생성자 오버로딩은 객체를 만들 때 전달하는 값에 따라
초기화 방법을 선택할 수 있게 해 준다.

메서드 오버로딩은 매개변수 구성에 따라
같은 이름의 메서드를 다르게 사용할 수 있게 해 준다.

오버로딩은 반환 자료형만 다르게 작성해서는 성립하지 않는다.


========================================
📌 AI 활용 복습 문제
========================================

문제 1. this.name = name;에서 this.name은 무엇일까?
1) 생성자 이름
2) 현재 객체의 필드
3) 부모 클래스의 이름
4) 메서드의 반환 자료형

정답: 2번


문제 2. super(name, age)의 역할은 무엇일까?
1) 현재 객체를 삭제한다.
2) 부모 클래스의 생성자를 호출한다.
3) 메서드를 오버로딩한다.
4) 필드를 출력한다.

정답: 2번


문제 3. 생성자 오버로딩에 해당하는 것은?
1) Person(String name)
   Person(String name, int age)

2) void show()
   void print()

3) int getScore()
   double getAge()

4) class Person
   class Student

정답: 1번


문제 4. 메서드 오버로딩의 조건으로 알맞은 것은?
1) 메서드 이름이 반드시 달라야 한다.
2) 반환 자료형만 다르면 된다.
3) 같은 이름에 매개변수 구성이 달라야 한다.
4) 모든 메서드가 매개변수가 없어야 한다.

정답: 3번


문제 5. Student가 Person을 상속받는 코드로 알맞은 것은?
1) class Student uses Person
2) class Student extends Person
3) class Student super Person
4) class Student Person()

정답: 2번


문제 6. 다음 코드에서 student1.showResult(5)는 어떤 메서드를 실행할까?
student1.showResult();
student1.showResult(int bonus);
student1.showResult(int bonus, int penalty);

1) 매개변수가 없는 메서드
2) int 매개변수 하나를 받는 메서드
3) int 매개변수 두 개를 받는 메서드
4) 실행할 수 없다.

정답: 2번


문제 7. super()를 자식 생성자에서 사용할 때 지켜야 하는 규칙은?
1) 항상 마지막에 작성한다.
2) 반복문 안에 작성한다.
3) 생성자의 첫 번째 문장에 작성한다.
4) main() 메서드에서만 사용한다.

정답: 3번


문제 8. 생성자 오버로딩과 메서드 오버로딩의 차이로 알맞은 것은?
1) 둘 다 객체와 관계가 없다.
2) 생성자 오버로딩은 초기화 방법을 다양하게 하고,
   메서드 오버로딩은 같은 이름의 기능을 여러 형태로 제공한다.
3) 메서드 오버로딩은 생성자를 만드는 기능이다.
4) 생성자 오버로딩은 반환 자료형만 바꾸는 기능이다.

정답: 2번
*/
