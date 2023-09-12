package DSA.arrays_and_hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ValidSudokuBoard {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        HashMap<String, HashSet<Character>> map = new HashMap<>();

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {

                if (board[row][column] == '.')
                    continue;

//                Hash Set for Rows
                String rowKeyName = "R" + row;
                if (map.containsKey(rowKeyName)) {
                    if (!map.get(rowKeyName).add(board[row][column])) {
                        return false;
                    }
                } else {
                    map.put(rowKeyName, new HashSet<>());
                    map.get(rowKeyName).add(board[row][column]);
                }

//                Hash Set for Columns
                String columnKeyName = "C" + column;
                if (map.containsKey(columnKeyName)) {
                    if (!map.get(columnKeyName).add(board[row][column])) {
                        return false;
                    }
                } else {
                    map.put(columnKeyName, new HashSet<>());
                    map.get(columnKeyName).add(board[row][column]);
                }

//                Hash Set for Grids
                String keyName = "G" + (row/3) + (column/3);
                if(map.containsKey(keyName)){
                    if(!map.get(keyName).add(board[row][column])){
                        return false;
                    }
                }else{
                    map.put(keyName, new HashSet<>());
                    map.get(keyName).add(board[row][column]);
                }
            }
        }

        return true;
    }
}
