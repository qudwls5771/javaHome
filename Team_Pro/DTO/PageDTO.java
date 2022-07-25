package DTO;

public class PageDTO {
    private int start;
    private int end;
    private int rowS;
    private int rowE;
    private int totalpage;
    private int pageG;
    private int nowPage;
    private float temp;

    public int getStart() {
        return start;
    }



    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getRowS() {
        return rowS;
    }

    public void setRowS(int rowS) {
        this.rowS = rowS;
    }

    public int getRowE() {
        return rowE;
    }

    public void setRowE(int rowE) {
        this.rowE = rowE;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public int getPageG() {
        return pageG;
    }

    public void setPageG(int pageG, float temp) {
        this.pageG = pageG;
        this.temp = temp;;
        cal();
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public void cal() {
        start = 0;
        end = 0;
        totalpage = 0; // total 페이지 총 수

        totalpage = (int) Math.ceil(temp);

        start = (pageG - 1) * 10 + 1;

        if (totalpage >= pageG * 10) {
            end = (pageG) * 10;
        } else {
            end = totalpage;
        }

        System.out.println(nowPage+":"+end);
        if(nowPage == 0) {
            nowPage =1;
        } else if(nowPage>end) {
            nowPage =end;
        }

        rowE = nowPage * 8;
        rowS = rowE - 7;
        if(rowE==0)rowS=0;

    }



}
