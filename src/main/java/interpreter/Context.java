package interpreter;

/**
 * store context
 */
public class Context {
    private String data[];
    private int curIndex = 0;

    /**
     * initialize the context using the given string array
     * @param data
     */
    public Context(String[] data){
        this.data = data;
    }

    /**
     * get current token
     * @return token string
     */
    public String getCurToken(){
        if(curIndex < data.length){
            return data[curIndex];
        }else{
            return "END";
        }
    }

    /**
     * set the token index to the next one
     */
    public void nextToken(){
        curIndex++;
    }

}
