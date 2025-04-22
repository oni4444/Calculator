package test;

public class Character {

    // 속성 > 변수로 표현
    private String name;
    private String job;
    private int level;


    // 생성자 > 조립설명서
    // 생성자의 특징
    // 1. 클래스와 이름이 동일합니다.
    // 2. 반환 데이터 타입이 존재하지 않는다.
    // 3. 여러개가 존재할 수 있습니다.
    public Character() {

    }

    public Character(String name, int level, String job) {
        // 이 코드변수 안에서 접근할 수 있는 변수 개수 > 6개
        // this.name:클래스변수 name:매개변수
        this.name = name;
        this.level = level;
        this.job = job;
    }

    public Character(String name, String job) {
        // 이 코드변수 안에서 접근할 수 있는 변수 개수 > 6개
        // this.name:클래스변수 name:매개변수
        this.name = name;
        this.level = 1;
        this.job = job;
    }

    // 기능
    public Object sum() {};



}
