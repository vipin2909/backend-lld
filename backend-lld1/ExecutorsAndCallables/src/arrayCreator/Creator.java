package arrayCreator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Creator implements Callable<List<Integer>> {
    int n;
    Creator(int n) { this.n = n; }

    @Override
    public List<Integer> call() {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) list.add(i);
        return list;
    }
}
