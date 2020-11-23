package pipeline;

import java.util.ArrayList;

public class Equipment {
    private boolean isInUse;
    private String name;

    private ArrayList<Problem> problems;

    public Equipment(){
        this("defaultEquipment",true);
    }
    public Equipment(String name, boolean isInUse){
        this.name = name;
        this.isInUse = isInUse;
        problems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Problem> getProblems() {
        return problems;
    }

    /**
     * remove Problem of index i from problems,
     * @param i the index of the problem to be removed.
     */
    public void deleteProblem(int i){
        if(i >= problems.size()){
            return;
        }
        problems.remove(i);
        return;
    }

    /**
     * add a problem p to the ArrayList problems.
     * @param p
     */
    public void addProblem(Problem p){
        if(!problems.contains(p)){
            problems.add(p);
        }
    }
    public boolean isInUse() {
        return isInUse;
    }

    public void setIsInUse(boolean newState){
        isInUse = newState;
        return;
    }
    @Override
    public String toString(){

        return "Equipment:"+" "+name+
                "\tinUse: " +isInUse+
                "\tproblems: "+problems.toString() ;
    }

    public class Problem{
        private String name;
        private boolean isFixed;

        public Problem(String name){
            this.name = name;

        }
        public Problem(){
            this("");
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * fix this problem by setting the isFixed = true.
         */
        public void fix(){
            isFixed = true;
        }

        public String getName() {
            return name;
        }

        public boolean isFixed() {
            return isFixed;
        }

        @Override
        public String toString(){
            return "Problem "+name+" isFixed: "+isFixed;
        }
    }
}
