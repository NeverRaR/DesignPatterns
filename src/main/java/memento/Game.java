package memento;

import java.lang.reflect.Array;

class Game {

    private int[][] map = {
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,1,1,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,0,0,0,0,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,2,2,2,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0,0,0,0,0,0,0,0,0},
            {0,2,0,0,0,0,0,0,2,2,2,0},
            {0,0,0,0,0,0,0,0,0,0,0,0}
    };
    GameMemento initialMemento;

    public Game(){
        initialMemento = getGaeMemento();
    }

    public void Play(){
        //...
        map[4][4] = 0;
        map[5][5] = 1;

    }

    public String showMap() {
        String a = "";
        for(int i = 0;i<12;i++){
            for(int j = 0;j<12;j++){
                a+=map[i][j]+" ";
            }
            a+="\n";
        }
        return a;
    }

    public void Restart(){
        setGameMemento();
    }

    GameMemento getGaeMemento(){
        GameMemento state = new GameMemento();
        state.setMap(map);
        return state;
    }

    void setGameMemento(){
        map = initialMemento.map;
    }


    private static class GameMemento{
        private int[][] map;

        public int[][] getMap() {
            return map;
        }

        public void setMap(int[][] map) {
            this.map = map;
        }
    }
}
