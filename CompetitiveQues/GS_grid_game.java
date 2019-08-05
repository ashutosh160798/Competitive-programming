import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class GS_grid_game {

    private static int n;
    private static int m;
    private static int[][] neighbours;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gridRows = Integer.parseInt(bufferedReader.readLine().trim());
        int gridColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> grid = new ArrayList<>();

        IntStream.range(0, gridRows).forEach(i -> {
            try {
                grid.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int rulesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> rules = IntStream.range(0, rulesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .collect(toList());

        List<List<Integer>> result = gridGame(grid, k, rules);

        result.stream()
                .map(
                        r -> r.stream()
                                .map(Object::toString)
                                .collect(joining(" "))
                )
                .map(r -> r + "\n")
                .collect(toList())
                .forEach(System.out::println);

        bufferedReader.close();
    }

    private static List<List<Integer>> gridGame(List<List<Integer>> grid, int k, List<String> rules) {

        m = grid.size();
        n = grid.get(0).size();
        Integer[][] gridArr = new Integer[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                gridArr[i][j] = grid.get(i).get(j);
            }
        }
        neighbours = new int[m][n];
        updateNeighbour(gridArr);

        for (int p = 0; p < k; p++) {
            for (int q = 0; q < m; q++) {
                for (int r = 0; r < n; r++) {
                    if (rules.get(neighbours[q][r]).equals("alive")) {
                        gridArr[q][r] = 1;
                    } else {
                        gridArr[q][r] = 0;
                    }
                }
            }
            neighbours = new int[m][n];
            updateNeighbour(gridArr);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ans.add(Arrays.asList(gridArr[i]));
        }
        return ans;
    }

    private static void updateNeighbour(Integer[][] arr) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isValid(i + 1, j + 1) && arr[i + 1][j + 1] == 1) {
                    neighbours[i][j]++;
                }
                if (isValid(i, j + 1) && arr[i][j + 1] == 1) {
                    neighbours[i][j]++;
                }
                if (isValid(i - 1, j + 1) && arr[i - 1][j + 1] == 1) {
                    neighbours[i][j]++;
                }
                if (isValid(i + 1, j) && arr[i + 1][j] == 1) {
                    neighbours[i][j]++;
                }
                if (isValid(i - 1, j) && arr[i - 1][j] == 1) {
                    neighbours[i][j]++;
                }
                if (isValid(i + 1, j - 1) && arr[i + 1][j - 1] == 1) {
                    neighbours[i][j]++;
                }
                if (isValid(i, j - 1) && arr[i][j - 1] == 1) {
                    neighbours[i][j]++;
                }
                if (isValid(i - 1, j - 1) && arr[i - 1][j - 1] == 1) {
                    neighbours[i][j]++;
                }
            }
        }
    }

    private static boolean isValid(int i, int j) {

        return i >= 0 && j >= 0 && i < m && j < n;

    }
}
