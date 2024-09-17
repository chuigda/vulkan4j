import javax.swing.*;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

public final class UICommons {
    public static final MetalTheme defaultMetalTheme = new DefaultMetalTheme();

    public static final int fontSize = 12;

    public static final Font defaultMonospaceFont;

    static {
        init:
        {
            List<String> fontFamilies = Arrays.asList(GraphicsEnvironment
                    .getLocalGraphicsEnvironment()
                    .getAvailableFontFamilyNames());

            boolean hasFiraCode = fontFamilies.stream()
                    .anyMatch(s -> s.contains("Fira Code"));
            if (hasFiraCode) {
                defaultMonospaceFont = new StyleContext().getFont("Fira Code", Font.PLAIN, fontSize);
                break init;
            }

            boolean hasNotoMono = fontFamilies.stream()
                    .anyMatch(s -> s.contains("Noto Mono"));
            if (hasNotoMono) {
                defaultMonospaceFont = new StyleContext().getFont("Noto Mono", Font.PLAIN, fontSize);
                break init;
            }

            boolean hasDejavuSansMono = fontFamilies.stream()
                    .anyMatch(s -> s.contains("DejaVu Sans Mono"));
            if (hasDejavuSansMono) {
                defaultMonospaceFont = new StyleContext().getFont("DejaVu Sans Mono", Font.PLAIN, fontSize);
                break init;
            }

            boolean hasLucidaConsole = fontFamilies.stream()
                    .anyMatch(s -> s.contains("Lucida Console"));
            if (hasLucidaConsole) {
                defaultMonospaceFont = new StyleContext().getFont("Lucida Console", Font.PLAIN, fontSize);
                break init;
            }

            boolean hasConsolas = fontFamilies.stream()
                    .anyMatch(s -> s.contains("Consolas"));
            if (hasConsolas) {
                defaultMonospaceFont = new StyleContext().getFont("Consolas", Font.PLAIN, fontSize);
                break init;
            }

            boolean hasSimSun = fontFamilies.stream()
                    .anyMatch(s -> s.contains("宋体"));
            if (hasSimSun) {
                defaultMonospaceFont = new StyleContext().getFont("宋体", Font.PLAIN, fontSize);
                break init;
            }

            defaultMonospaceFont = new StyleContext().getFont(Font.MONOSPACED, Font.PLAIN, fontSize);
        }
    }

    public static void createTextAreaMenu(JTextArea textArea) {
        JPopupMenu menu = new JPopupMenu();
        JMenuItem cut = new JMenuItem("剪切");
        JMenuItem copy = new JMenuItem("复制");
        JMenuItem paste = new JMenuItem("粘贴");
        JMenuItem selectAll = new JMenuItem("全选");
        menu.add(cut);
        menu.add(copy);
        menu.add(paste);
        menu.add(selectAll);
        cut.addActionListener(e -> textArea.cut());
        copy.addActionListener(e -> textArea.copy());
        paste.addActionListener(e -> textArea.paste());
        selectAll.addActionListener(e -> textArea.selectAll());

        if (!textArea.isEditable()) {
            cut.setEnabled(false);
            paste.setEnabled(false);
        }

        textArea.setComponentPopupMenu(menu);
    }

    public static void makeGrayBackgroundAndReadonly(JTextArea textArea) {
        textArea.setBackground(defaultMetalTheme.getControl());
        textArea.setEditable(false);
    }
}
