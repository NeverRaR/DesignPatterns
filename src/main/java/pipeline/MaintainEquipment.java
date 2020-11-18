package pipeline;

class MaintainEquipment implements Handler<Equipment,Equipment>{
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        for (Equipment.Problem pr:input.getProblems()
             ) {
            pr.fix();
        }
        System.out.println("Maintain: "+input.toString());
        return input;
    }
}
