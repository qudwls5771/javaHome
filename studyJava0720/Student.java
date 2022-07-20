public class Student {
    //필드
    private String name;
    private  int groupNum;

    //생성자 : 생성자는 클래스 이름과 동일
    //오버로딩(클래스의 스타일) : 생성자의 매개변수를 통해 다양한 타입으로 생성
    //기본적으로 생성자(매개변수 없는) 1개가 있다.
    public Student(String i_name, int i_groupNum){
        //this : 제일 가까운 객체를 지칭 = 여기서는 가장 가까운 Student라는 클래스
        //this.name => Student의 필드 name을 가르킨다.
        //this.groupNum => Student의 필드 groupNum을 가르킨다.
        this.name = i_name;
        this.groupNum = i_groupNum;
    }

    //메서드
    //getter, setter 쓰는 이유 : 객체의 캡슐화, 데이터 입출력이라는 기능의 메서드를 잘 쓰기 위해
    //외부에서 필드값을 바로 조회 또는 수정을 막기 위해서! 객체는 딱 닫혀야한다.

    public String getName() {
        return name;
    }

    public void setName(String i_name) {
        this.name = i_name;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int i_groupNum) {
        this.groupNum = i_groupNum;
    }

    //Student 인스턴스 타입으로 아래 equals라는 메서드의 매개변수로 들어감(단, Object로 "타입" 형변환)
    @Override
    public boolean equals(Object obj){
        //instanceof : 메모리 heap에 있는 인스턴스끼리 비교하는 것.
        //상속 받았다면 부모클래스도 동일하다가 true가 나온다.
        if(obj instanceof Student) {
            //Member 타읍으로 obj매개변수를 형변환
            //Member라는 변수명으로 obj(주소) 연결
            Student student_1 = (Student) obj;
            if(groupNum == student_1.getGroupNum() && name.equals(student_1.getName())){
                //둘다 맞아야 true
                System.out.println("일치");
                    return true;
            }

        }
        System.out.println("불일치");
        //아니면 false
        return false;
    }

}
