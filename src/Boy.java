public class Boy {

    private String fulName;
    private int aga;
    private String hobby;
    private String aducation;


    public void setFulName(String fulName){
        this.fulName=fulName;
    }
    public void setAga(int aga){
        this.aga=aga;
    }
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void setAducation(String aducation){
        this.aducation=aducation;
    }
    String getFulName(){
        return fulName;
    }
    int getAga(){
        return aga;
    }
    String getHobby(){
        return hobby;
    }
    String getAducation(String student){
        return aducation;
    }
}
