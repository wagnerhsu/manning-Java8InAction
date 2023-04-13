package lambdasinaction.chap3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MethodReference {
    public static void main(String... args) {
        log.info("MethodReference demo");
        List<String> list = new ArrayList<>();
        list.add("Line01");
        list.add("line02");

        BiPredicate<List<String>, String> pred = List<String>::contains;
        assert pred.test(list, "line02") == true;

    }

}
