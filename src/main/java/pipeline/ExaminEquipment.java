package pipeline;

import java.util.Random;

class ExaminEquipment implements Handler<Equipment,Equipment> {
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        /**
         * find random number of problems to the equipment.
         */
        int count = 0;
        Random rand10= new Random(10);
        count = rand10.nextInt(10);
        for(int i = 0;i<count;i++) {
            Equipment.Problem defaultProblem = input.new Problem("Problem"+i);
            input.addProblem(defaultProblem);
        }
        System.out.println("\tExamineEquipment:("+this.hashCode()+"):\n\tExamine: "+input.toString());
        return input;
    }
}
