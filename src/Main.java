import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        char[][] usersBoard = new char[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                usersBoard[i][j] = '*';
            }
        }
        int[][] battleField = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                battleField[i][j] = 0;
            }
        }






    }
    private static void setUp3boat(int[][] battleField){
        Random random = new Random();
        while (true){
            int x = random.nextInt(7);
            int y = random.nextInt(7);
            int dir = random.nextInt(2);
            if(dir == 0){   // dir == 0 is vertical boat
                if(x > 0  && x < 6){
                    battleField[x][y] = 1;
                    battleField[x+1][y] = 1;
                    battleField[x- 1][y] = 1;
                }
            }
            else{   // dir == 1  is horizontal boat
                if(y > 0  && y < 6){
                    battleField[x][y] = 1;
                    battleField[x][y + 1] = 1;
                    battleField[x][y - 1] = 1;
                }
            }

        }
    }
    private static void setUp2Boat(int[][] battleField){
        Random random = new Random();
        while (true){
            int x = random.nextInt(7);
            int y = random.nextInt(7);
            int dir = random.nextInt(2);
            if(dir == 0){   // dir == 0 is vertical boat
                if(x == 0 && y == 0){
                    if(battleField[x+1][y] == 0 &&
                            battleField[x][y+1] == 0 &&
                            battleField[x][y+2] == 0 &&
                            battleField[x+1][y+1] == 0 &&
                            battleField[x+1][y+2] == 0) {
                        battleField[x][y] = 1;
                        battleField[x+1][y] = 1;
                    }
                }
                else if(x == 0 && y == 6){
                         if(battleField[x][y-1] == 0 &&
                            battleField[x+1][y] == 0 &&
                            battleField[x+2][y] == 0 &&
                            battleField[x+1][y-1] == 0 &&
                            battleField[x+2][y-1] == 0)
                    {
                        battleField[x][y] = 1;
                        battleField[x + 1][y] = 1;
                    }
                }
                else if(x > 0 && x < 5 && y == 0){
                    if (battleField[x - 1][y] == 0 &&
                            battleField[x + 1][y]== 0 &&
                            battleField[x][y+1] == 0 &&
                            battleField[x + 2][y] == 0 &&
                            battleField [x - 1][y + 1] == 0 &&
                            battleField [x + 1][y + 1] == 0 &&
                            battleField[x + 2][y + 1] == 0 &&)
                    {
                        battleField[x][y] = 1;
                        battleField[x+1][y] = 1;
                    }
                }
                else if(x == 5 && y == 0){
                    if( battleField[x - 1][y] == 0 &&
                            battleField[x + 1][y]== 0 &&
                            battleField[x][y+1] == 0 &&
                            battleField [x - 1][y + 1] == 0 &&
                            battleField [x + 1][y + 1] == 0 &&)
                    {
                        battleField[x][y] = 1;
                        battleField[x+1][y] = 1;
                    }
                }
                else if(x == 6 && y == 0){
                    if(
                            battleField[x-1][y] == 0 &&
                            battleField[x-2][y] == 0 &&
                            battleField[x-2][y+1] == 0 &&
                            battleField[x-1][y+1] == 0 &&
                            battleField[x][y+1] == 0 &&
                    )
                    {
                        battleField[x][y] = 1;
                        battleField[x-1][y] = 1;
                    }
                }
                else if()


            }
            else{   // dir == 1  is horizontal boat
                if(y > 0  && y < 6){
                    battleField[x][y] = 1;
                    battleField[x][y + 1] = 1;
                    battleField[x][y - 1] = 1;
                }
            }


        }
    }

}






