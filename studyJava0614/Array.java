import java.util.ArrayList;

public class Array{
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();
        //add = 추가, set = 수정, remove = 삭제
        colors.add("red");
        colors.add("blue");
        colors.add(0, "black");
        System.out.println(colors);
        colors.remove(0);
        System.out.println(colors);
        System.out.println(colors.size());



    


    }

    public static void sort(ArrayList<Integer> sumList) {
    }
}