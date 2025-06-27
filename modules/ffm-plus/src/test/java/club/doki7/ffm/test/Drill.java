package club.doki7.ffm.test;

import java.lang.foreign.Linker;
import java.lang.foreign.MemoryLayout;
import java.util.List;
import java.util.Optional;

public class Drill {
    public static void main(String[] args) {
        List<String> capturedNames = Linker.Option.captureStateLayout().memberLayouts().stream()
                .map(MemoryLayout::name)
                .flatMap(Optional::stream)
                .toList();
        System.out.println("capturedNames:");
        for (String s : capturedNames) {
            System.out.println(" - " + s);
        }
    }
}
