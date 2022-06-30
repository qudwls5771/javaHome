package package0007_sandwich;

import package0010_exam.*;

public class blueberrysand extends childClass_sandwich_anotherPackage{

        //이렇게 만들다 보니 다른 샌드위치와 차이가 없네요..
        public blueberrysand(String name, String bread, String butter, String material_1, String material_2 ){
            super(name, bread, butter, material_1, material_2);
        }
    
        @Override
        public void getInfo(String day){
            System.out.println("이름은은 "+name+"입니다, 오늘은 "+day+"입니다");
            System.out.println("메인재료1은 "+bread+"입니다");
            System.out.println("메인재료2는 "+butter+"입니다");
            System.out.println("재료1는 "+material_001+"입니다");
            System.out.println("재료2는 "+material_002+"입니다");
        }

}
