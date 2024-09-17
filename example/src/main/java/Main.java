import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.util.List;

public class Main {
    static {
        System.loadLibrary("glfw");
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.loadLibrary("vulkan-1");
        }
        else {
            System.loadLibrary("vulkan");
        }
    }

    public static void main(String[] args) {
        MetalLookAndFeel.setCurrentTheme(UICommons.defaultMetalTheme);
        try {
            UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("设置外观时发生了错误: " + e.getMessage());
        }

        var deviceInfoDialog = new DeviceInfoDialog(List.of(
                new DeviceInfo("Device A", "南去经三国，东来过五湖"),
                new DeviceInfo("Device B", "南去经三国，东来过五湖")
        ));
        deviceInfoDialog.setVisible(true);

        System.err.println("设备选择完成");
    }
}
