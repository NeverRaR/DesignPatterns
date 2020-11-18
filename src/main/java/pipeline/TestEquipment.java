package pipeline;

import java.util.ArrayList;

class TestEquipment implements Handler<Equipment,Equipment> {

    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        ArrayList<Equipment.Problem> problems = input.getProblems();
        for(int i = problems.size()-1;i>=0;i--){
            if(problems.get(i).isFixed()){
                input.deleteProblem(i);
            }
        }
        System.out.println("Test: "+input.toString());
        return input;
    }
}
