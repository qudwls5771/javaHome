package package0010_exam;

import package0007_sandwich.superClass_sandwich;

public class childClass_sandwich_anotherPackage extends superClass_sandwich {

    protected String material_001;
    protected String material_002;

    protected childClass_sandwich_anotherPackage(String name ,String bread, String butter, String material_001, String material_002) {
        super(name, bread, butter);
        this.material_001 = material_001;
        this.material_002 = material_002;
    }

    protected childClass_sandwich_anotherPackage(String name ,String bread, String butter, String material_001) {
        super(name, bread, butter);
        this.material_001 = material_001;
        // this.material_002 = material_002;
    }

    public void getInfo(String string) {
    }

    
}
