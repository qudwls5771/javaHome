

class PointXY{
    private int x;
    private int y;
    //객체 생성 : x,y 입력 받는 형태의 생성자 정의 
    PointXY(int x, int y){
        this.x = x;
        this.y  =y;
    }
    //x,y값 입력받아 멤버변수 x에 담아뒤기
    public void setX(int x){
        this.x =x;
    }

    public void setY(int y){
        this.y =y;
    }

    //증가시킬 x,y값 입력받아 멤버변수에 x,y값 증가시켜 담아두기
    public void moveXY(int x, int y){
        this.x = x;
        this.y = y;
    }



    public int getX(){
        return this.x;
    }

    public  int getY(){
        return this.y;
    }


}