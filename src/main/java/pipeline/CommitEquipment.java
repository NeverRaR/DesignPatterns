package pipeline;

class CommitEquipment implements Handler<Equipment,Equipment>{
    @Override
    public Equipment process(Equipment input) {
        if(input==null){
            return null;
        }
        if(input.getProblems().size() == 0){
            input.setIsInUse(true);
        }
        System.out.println("Commit: "+input.toString());
        return input;
    }
}
