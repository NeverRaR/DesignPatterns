package pipeline;

import java.util.Random;

class ExaminEquipment implements Handler<Equipment,Equipment> {
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        int count = 0;
        Random rand10= new Random(10);
        count = rand10.nextInt(10);
        for(int i = 0;i<count;i++) {
            Equipment.Problem defaultProblem = input.new Problem("Problem"+i);
            input.addProblem(defaultProblem);
        }
        System.out.println("Examin: "+input.toString());
        return input;
    }
}
