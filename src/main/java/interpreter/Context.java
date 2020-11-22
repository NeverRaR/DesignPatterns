package interpreter;

public class Context {
    private String data[];
    private int curIndex = 0;

    public Context(String[] data){
        this.data = data;
    }

    public String getCurToken(){
        if(curIndex < data.length){
            return data[curIndex];
        }else{
            return "END";
        }
    }

    public void nextToken(){
        curIndex++;
    }

}
